package Week2JAVAPart2.Ex6;

import Week2JAVAPart2.Ex3.Tool;

import java.util.ArrayList;
import java.util.List;

public class ShopAssistant {

    public void findToolBox(List<String> toolNames, String color) {
        System.out.println("here is your " + color + " toolbox :");
        List<String> finalList = new ArrayList<>();
        ToolBox toolBox = new ToolBox(color);
        for (String toolName : toolNames) {
            Tool tool = new Tool(toolName);
            toolBox.add(tool);
            finalList.add(tool.getName());
        }
        System.out.println(finalList);
    }
}

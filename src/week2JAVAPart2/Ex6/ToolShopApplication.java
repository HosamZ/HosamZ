package week2JAVAPart2.Ex6;

import java.util.Arrays;
import java.util.List;


public class ToolShopApplication {

    public static void main(String[] args) {
        List<String> toolNames = Arrays.asList("Hammer", "Saw", "Nails");

        ShopAssistant shopAssistant = new ShopAssistant();
        shopAssistant.findToolBox(toolNames, "red");

    }


}
//        Scanner scanner = new Scanner(System.in);
//        List<String> needTools = new ArrayList<>();
//        String needTool = "";
//        for (int i = 0; i < 3; i++) {
//            System.out.println("Please enter your tools!");
//            needTool = scanner.next();
//            needTools.add(needTool);
package week2JAVAPart2.Ex3;

public class Derek {

    public Tool tool= new Tool(" ");
    //Derek has a tool as attribute, but he does not receive it through the constructor. Instead he receives
    // it with a setTool method. He also has the methods canHangPainting and hangPainting.
    public void setTool(Tool tool) {
        this.tool = tool;
    }
    public Boolean canHangPainting(){
        String toolName = tool.getName();
        return toolName == "hammer";
        }
    public void hangPainting() {
        if (canHangPainting()) {
            System.out.println("now i can hang painting");
        } else {
            System.out.println("i`m missing the hammer!");
    }
    }
}

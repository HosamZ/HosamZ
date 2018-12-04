package week5Java.ex6;

public class AddTop implements Step {
    @Override
    public void perform(Furniture furniture) {
        furniture.add("top");
    }
}

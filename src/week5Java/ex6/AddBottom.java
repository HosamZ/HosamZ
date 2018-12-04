package week5Java.ex6;

public class AddBottom implements Step {
    @Override
    public void perform(Furniture furniture) {
        furniture.add("bottom");
    }
}

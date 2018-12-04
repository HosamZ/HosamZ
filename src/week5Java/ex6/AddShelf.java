package week5Java.ex6;

public class AddShelf implements Step {
    @Override
    public void perform(Furniture furniture) {
        furniture.add("shelf");
    }
}

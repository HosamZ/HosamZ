package week5Java.ex6;

public class AddDoor implements Step {
    @Override
    public void perform(Furniture furniture) {
        furniture.add("door");
    }
}

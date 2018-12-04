package week5Java.ex6;

import java.util.Arrays;
import java.util.List;

public class WardrobeBuilder {
    private List<Step> steps = getSteps();

    public Wardrobe build() {
        Wardrobe wardrobe = new Wardrobe();
        for (Step step : steps) {
            step.perform(wardrobe);

        }
        return wardrobe;
    }

    public List<Step> getSteps() {
        AddBack back = new AddBack();
        AddSide side = new AddSide();
        AddBottom bottom = new AddBottom();
        AddDoor door = new AddDoor();
        AddShelf shelf = new AddShelf();
        AddTop top = new AddTop();
        List<Step> steps = Arrays.asList(bottom, side, side, back, top, shelf, shelf, shelf, shelf, shelf, shelf, shelf, shelf, door, door);
        return steps;
    }
}
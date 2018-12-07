package evaluation.week5JAVA;

import week5Java.ex6.Furniture;
import week5Java.ex6.Step;

public class AddLeg implements Step {
    @Override
    public void perform(Furniture furniture) {
        furniture.add("leg");
    }
}

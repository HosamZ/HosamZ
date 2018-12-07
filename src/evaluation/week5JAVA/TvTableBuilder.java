package evaluation.week5JAVA;

import week5Java.ex6.AddShelf;
import week5Java.ex6.AddTop;
import week5Java.ex6.Step;

import java.util.Arrays;
import java.util.List;

public class TvTableBuilder {
    private List<Step> steps = getSteps();


    public TvTable build() {
        TvTable tvTable = new TvTable();
        for (Step step : steps) {
            step.perform(tvTable);
        }
        return tvTable;
    }


    public List<Step> getSteps() {
        AddLeg leg = new AddLeg();
        AddShelf shelf = new AddShelf();
        AddTop top = new AddTop();
        List<Step> steps = Arrays.asList(leg, leg, leg, leg, top, shelf);
        return steps;
    }
}

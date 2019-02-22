package week8.firstDayEx;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Archive {
    public void display(List<String> tricks) {
        List<String> names = getUnique(tricks);
        System.out.println("Number of unique tricks: " + names.size());
        System.out.println("Tricks: "+names);
    }

     List<String> getUnique(List<String> tricks) {
        return new ArrayList<>(new HashSet<>(tricks));
    }
}

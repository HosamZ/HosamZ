package week8.firstDayEx;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Archive {
    public void display(List<String> tricks) {
        Set<String> names = getUnique(tricks);
        System.out.println("Number of unique tricks: " + names.size());
        System.out.println("Tricks: "+names);
    }

     Set<String> getUnique(List<String> tricks) {
        return new HashSet<>(tricks);
    }
}

package week8;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Archive {
    public void display(List<String> tricks) {
        Set<String> names = new HashSet<>(tricks);
        System.out.println("Number of unique tricks: " + names.size());
        System.out.println("Tricks: "+names);
    }
}

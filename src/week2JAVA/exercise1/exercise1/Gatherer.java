package week2JAVA.exercise1.exercise1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Gatherer {
    public List<Hiker> signUp() {
        List<Hiker> hikers = new ArrayList<>();
        System.out.println("What`Bank your name ?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        while (!name.isEmpty()) {
            Hiker hiker = new Hiker(name);
            hikers.add(hiker);
            System.out.println("What`Bank your name ?");
            name = scanner.nextLine();
        }
        return hikers;
    }
}


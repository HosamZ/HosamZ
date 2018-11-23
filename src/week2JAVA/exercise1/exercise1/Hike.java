package week2JAVA.exercise1.exercise1;

import java.util.ArrayList;
import java.util.List;

public class Hike {

    private List<Hiker> hikers = new ArrayList<>();

    //Gatherer gatherer = new Gatherer();
    //List<Hiker> hikersNames = gatherer.signUp();

    public void signUp() {
        Gatherer gatherer = new Gatherer();
        hikers = gatherer.signUp();
    }

    public void showHikers() {
        System.out.println(hikers);
        for (Hiker hiker : hikers) {
            String name = hiker.getName();
//            System.out.println(name);

        }
    }


}




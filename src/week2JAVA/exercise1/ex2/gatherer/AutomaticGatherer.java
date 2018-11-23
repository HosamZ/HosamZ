package week2JAVA.exercise1.ex2.gatherer;

import week2JAVA.exercise1.exercise1.Hike;
import week2JAVA.exercise1.exercise1.Hiker;

import java.util.ArrayList;
import java.util.List;

public class AutomaticGatherer {
    void getConfirmedHikers(){
        List<Hiker> confirmedHikers = new ArrayList<>();
        confirmedHikers.add(new Hiker("hiker1"));
        confirmedHikers.add(new Hiker("hiker2"));
        confirmedHikers.add(new Hiker("hiker3"));
        confirmedHikers.add(new Hiker("hiker4"));
        confirmedHikers.add(new Hiker("hiker5"));
    }
}

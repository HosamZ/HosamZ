package week5Java.ex7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Moves {
    public static List<Move> getAsList() {
        List<Move> moves = Arrays.asList(new Rock(), new Paper(), new Scissors(), new Spock(), new Lizard());
        return moves;
    }


    public static String asString() {
        List<String> names = new ArrayList<>();
        List<Move> asList = getAsList();
        for (Move move : asList) {
            names.add(move.getName());
        }
        return String.join(", ", names);
    }
}
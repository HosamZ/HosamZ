package week5Java.ex7;

public class Spock implements Move {
    @Override
    public String getName() {
        return "spock";
    }

    @Override
    public Boolean defeatMove(Move move) {
        if (move.getName().equals("scissors")||move.getName().equals("rock")){
            return true;
        }
        return false;
    }
}

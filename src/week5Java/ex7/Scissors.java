package week5Java.ex7;

public class Scissors implements Move {
    @Override
    public String getName() {
        return "scissors";
    }

    @Override
    public Boolean defeatMove(Move move) {
        if (move.getName().equals("paper")||move.getName().equals("spock")){
            return true;
        }
        return false;
    }
}

package week5Java.ex7;

public class Lizard implements Move {
    @Override
    public String getName() {
        return "lizard";
    }
    @Override
    public Boolean defeatMove(Move move) {
        if (move.getName().equals("paper")||move.getName().equals("spock")){
            return true;
        }
        return false;
    }
}

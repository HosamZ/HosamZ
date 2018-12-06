package week5Java.ex7;

public class Rock implements Move {
    @Override
    public String getName() {
        return "rock";
    }

    @Override
    public Boolean defeatMove(Move move) {
        if (move.getName().equals("paper")){
            return true;
        }
        return false;
    }
}

package week5Java.ex7;

public class Judge {

    public String descion(Move move1, Move move2) {
        if (move1.defeatMove(move2)) {
            return "You win!";
        }
        if (move2.defeatMove(move1)) {
            return "Computer win!";
        }
        return "Draw";
    }
}

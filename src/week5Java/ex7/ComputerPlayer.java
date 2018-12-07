package week5Java.ex7;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ComputerPlayer implements Player {
    private Random random = new Random();
    private List<Move> moves =Moves.getAsList();

    @Override
    public Boolean playAgain() {
        return true;
    }

    @Override
    public Move chooseMove() {
        int position = random.nextInt(moves.size());
        Move move = moves.get(position);
        return move;
    }

}

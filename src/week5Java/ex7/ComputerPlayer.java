package week5Java.ex7;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ComputerPlayer implements Player {
    private Random random = new Random();
    private List<Move> moves = Arrays.asList(new Rock(),new Scissors(),new Paper());

    @Override
    public Boolean playAgain() {
        return true;
    }

    @Override
    public Move chooseMove() {
        int position = random.nextInt(3);
        Move move = moves.get(position);
        return move;
    }

}

package week5Java.ex7;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class HumanPlayer implements Player {
    private List<Move> moves = Moves.getAsList();

    @Override
    public Boolean playAgain() {
        System.out.println("do you want to play again? yes/no");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        return answer.equals("yes");
    }

    @Override
    public Move chooseMove() {
        Optional<Move> oMove = Optional.empty();
        System.out.println("These are your options: " + Moves.asString());
        System.out.println("Choose one:");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        for (Move move : moves) {
            if (move.getName().equalsIgnoreCase(answer)) {
                oMove = Optional.of(move);
                break;
            }
        }
        return oMove.get();
    }
}

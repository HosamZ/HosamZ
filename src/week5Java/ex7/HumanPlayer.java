package week5Java.ex7;

import java.util.ArrayList;
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
        showOptions();
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        while (!isValid().contains(answer)){
            System.out.println("please enter a valid value?");
            String answer1 = scanner.nextLine();
            answer=answer1;
        }
        for (Move move : moves) {
            if (move.getName().equalsIgnoreCase(answer)) {
                oMove = Optional.of(move);
            }
        }
        return oMove.get();
    }

    private List<String> isValid() {
        List<String> validMoves = new ArrayList<>();
        validMoves.add("rock");
        validMoves.add("paper");
        validMoves.add("scissors");
        return validMoves;
    }

    public void showOptions() {
        System.out.println("These are your options: " + Moves.asString());
        System.out.println("Choose one:");
    }
}

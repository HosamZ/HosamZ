package week5Java.ex7;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HumanPlayer implements Player {
    private List<Move> moves = Arrays.asList(new Rock(),new Scissors(),new Paper());


    @Override
    public String playerName() {
        return "Human";
    }

    @Override
    public Boolean playAgain() {
        System.out.println("do you want to play again?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (answer.equals("yes")){
            return true;
        }
        return false;
    }

    @Override
    public Move chooseMove() {
        Rock rock = new Rock();
        Scissors scissors = new Scissors();
        Paper paper = new Paper();
        System.out.println("These are your options: +"+rock.moveName()+","+scissors+"," +paper+".");
        System.out.println("Choose one!");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (!moves.contains(answer)) {
            return chooseMove();
        }

        for (Move move : moves) {
            if(move.moveName().equals(answer)){
                return move;
            }
        }
        return null;
    }
}

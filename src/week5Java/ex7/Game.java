package week5Java.ex7;

import java.util.Scanner;

public class Game {

    private Judge judger= new Judge();

    public void play() {
        System.out.println("Let’s play rock, paper, scissors!");
        Player player1 = new HumanPlayer();
        Player player2 = new ComputerPlayer();
        boolean playAgain = true;
        while (playAgain) {
            playOneRound(player1, player2);
            playAgain = askPlayers();
        }
    }

    public void playOneRound(Player player1, Player player2) {
        Move move1 = player1.chooseMove();
        Move move2 = player2.chooseMove();
        System.out.println("Player1 chose: " + move1.getName());
        System.out.println("Player2 chose: " + move2.getName());
        System.out.println(judger.descion(move1, move2));
    }

    public boolean askPlayers() {
        System.out.println("do you wanna play again ? yes/no");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (answer.equals("yes")) {
            return true;
        } else {
            System.out.println("see you next time!");
            return false;
        }
    }
}
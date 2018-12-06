package week5Java.ex7;

import java.util.Scanner;

public class Game {

    public void game() {
        ComputerPlayer computerPlayer = new ComputerPlayer();
        HumanPlayer humanPlayer = new HumanPlayer();
        Judge judger = new Judge();
        System.out.println("Let’s play rock, paper, scissors!");
        Move move1 = humanPlayer.chooseMove();
        Move move2 = computerPlayer.chooseMove();
        System.out.println("Player1 chose: "+move1.getName());
        System.out.println("Player2 chose: "+move2.getName());
        System.out.println(judger.descion(move1,move2));
        playAgain();
    }
    public void playAgain(){
        System.out.println("do you wanna play again ? yes/no");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (answer.equals("yes")){
            Game game = new Game();
            game.game();
        }else {
            System.out.println("see you next time!");
        }
    }
}

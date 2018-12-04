package week5Java.ex7;

public class RockScissorsPaperApplication {
    public static void main(String[] args) {
        Rock rock = new Rock();
        Scissors scissors = new Scissors();
        HumanPlayer humanPlayer = new HumanPlayer();
        humanPlayer.chooseMove();
        System.out.println(rock.moveName()+", "+scissors.moveName());
    }
}

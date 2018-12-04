package week5Java.ex7;

public class Scissors implements Move {
    @Override
    public String moveName() {
        return "scissors";
    }

    @Override
    public Boolean defeatMove() {
        //teach moves how to defeat each others 
        return null;
    }
}

package week5Java.ex7;

public class Paper implements Move {
    @Override
    public String moveName() {
        return "paper";
    }

    @Override
    public Boolean defeatMove() {
        return null;
    }
}

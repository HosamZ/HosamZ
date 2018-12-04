package week5Java.ex7;

public class Rock implements Move {
    @Override
    public String moveName() {
        return "rock";
    }

    @Override
    public Boolean defeatMove() {
        return null;
    }
}

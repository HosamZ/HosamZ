package week5Java.ex7;

public class Paper implements Move {
    @Override
    public String getName() {
        return "paper";
    }

    @Override
    public Boolean defeatMove(Move move){
        if (move.getName().equals("rock")){
            return true;
        }
        return false;
    }
}

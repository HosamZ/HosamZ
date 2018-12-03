package week5Java.ex5;

public class Joker implements Villain {
    Integer lives = 10;

    @Override
    public void weaken(String name) {
        System.out.println("Damn you," + name + "!" + "You managed to weaken me!");
        lives--;
        if (lives == 0)
            System.out.println("You all defeated me! But I will be back!");
    }
}

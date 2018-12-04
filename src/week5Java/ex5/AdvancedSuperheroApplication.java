package week5Java.ex5;
import week5Java.ex4.Superhero;
import week5Java.ex4.SuperheroCaller;

public class AdvancedSuperheroApplication {
    public static void main(String[] args) {
        Joker joker = new Joker();
        SuperheroCaller caller = new SuperheroCaller();
        for (int times = 0; times < 10; times++) {
            Superhero superhero = caller.call();
            superhero.fight(joker);
//            joker.weaken(superhero.getName());
        }
    }
}

package week5Java.ex4;
import java.util.ArrayList;
import java.util.List;

public class SuperheroApplication {
    public static void main(String[] args) {
        SuperheroCaller caller = new SuperheroCaller();
        Superhero hero = caller.call();
        System.out.println("Superhero: "+hero);
        List<Superhero> heroes = getHeroes();
        System.out.println("Number of SuperHeroes: "+heroes.size());
    }
    private static List<Superhero> getHeroes() {
        SuperheroCaller caller = new SuperheroCaller();
        List<Superhero> heroes = new ArrayList<>();
        for (int times = 0; times < 6 ; times++) {
            Integer counter = times + 1;
            Superhero hero = caller.call();
            heroes.add(hero);
            System.out.println("Superhero "+ counter+":"+hero);
        }
        return heroes;
    }
}

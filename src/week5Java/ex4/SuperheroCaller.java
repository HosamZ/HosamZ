package week5Java.ex4;
import java.util.*;

public class SuperheroCaller {
    private List<Superhero> superheroes = Arrays.asList(new Batman(), new Superman(), new Spiderman());
    private Random random = new Random();


    public Superhero call() {
        int position = random.nextInt(3);
        Superhero hero = superheroes.get(position);
        return hero;
    }
}


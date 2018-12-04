package week5Java.ex4;

import week5Java.ex5.Villain;

public class Superman implements Superhero {
    @Override
    public String getName() {
        return "Superman";
    }

    @Override
    public void fight(Villain villain) {
        villain.weaken(getName());
    }

    @Override
    public String toString() {
        return "Superman";
    }


}

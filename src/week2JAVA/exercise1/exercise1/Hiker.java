package week2JAVA.exercise1.exercise1;

public class Hiker {

    private String name;

    public Hiker(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}


package week5Java.ex6;

import java.util.ArrayList;
import java.util.List;

public class Wardrobe implements Furniture {
    private List<String> parts = new ArrayList<>();

    @Override
    public String toString() {
        return "Wardrobe{" + "parts=" + parts + '}';
    }

    public List<String> getParts() {
        return parts;
    }

    @Override
    public void add(String part) {
        parts.add(part);
    }
}

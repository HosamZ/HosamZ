package week5Java.ex6;

import java.util.List;

public class Wardrobe implements Furniture{
    private List<String> parts;

    @Override
    public String toString() {
        return "Wardrobe{" + "parts=" + parts +'}';
    }

    @Override
    public void add(String part) {

//        for (String part : parts) {
//            parts.add(part);
//        }
    }
}

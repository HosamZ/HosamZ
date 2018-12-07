package evaluation.week5JAVA;

import week5Java.ex6.Furniture;

import java.util.ArrayList;
import java.util.List;

public class TvTable implements Furniture {
    private List<String> parts = new ArrayList<>();


    @Override
    public void add(String part) {
        parts.add(part);
    }

    public List<String> getParts() {
        return parts;
    }

    @Override
    public String toString() {
        return "TvTable{" + "parts=" + parts + '}';
    }
}

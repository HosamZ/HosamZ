package week4Java.ex5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AdvancedShoppingApplication {
    public static void main(String[] args) {
        List<Grocery> groceries = new ArrayList<>();
        System.out.println("Groceries: " + groceries);
        Grocery grocery1 = new Grocery("banans");
        Grocery grocery2 = new Grocery("oranges");
        Grocery grocery3 = new Grocery("tomatoes");
        groceries.addAll(Arrays.asList(grocery1,grocery2,grocery3));
        System.out.println("Groceries: "+groceries);
        Grocery grocery5 = new Grocery("oranges");
        groceries.remove(grocery5);
        System.out.println(groceries);
    }
}
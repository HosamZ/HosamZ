package week4Java.ex5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AdvancedShoppingApplication {
    public static void main(String[] args) {
        List<Grocery> groceries = new ArrayList<>();
        System.out.println("Groceries: " + groceries);
        Grocery grocery1 = new Grocery("bananas");
        Grocery grocery2 = new Grocery("oranges");
        Grocery grocery3 = new Grocery("tomatoes");
        groceries.addAll(Arrays.asList(grocery1,grocery2,grocery3));
        System.out.println("Groceries: "+groceries);
        Grocery grocery5 = new Grocery("oranges");
        groceries.remove(grocery5);
        System.out.println("Groceries: "+groceries);
        groceries.add(grocery3);
        groceries.add(grocery3);
        System.out.println("Groceries: "+groceries);
        groceries.get(2);
        groceries.remove(2);
        System.out.println("Groceries: "+groceries);
        System.out.println("Groceries size is : "+groceries.size());
    }
}
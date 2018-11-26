package week4Java.ex1;

import java.util.ArrayList;
import java.util.List;

public class BasicShoppingApplication {
    public static void main(String[] args) {
        List<String> groceries = new ArrayList<>();
        System.out.println("groceries empty list : "+groceries);
        groceries.add("bananas");
        groceries.add("oranges");
        groceries.add("oranges");
        groceries.add("tomatoes");
        System.out.println("groceries list : "+groceries);
        System.out.println("duplicated groceries : "+groceries);
        groceries.remove("oranges");
        System.out.println("groceries after removing : "+groceries);
        String thirdElement = groceries.get(2);
        System.out.println("third element is :" +thirdElement);
        System.out.println("groceries size is : "+groceries.size());
    }
}

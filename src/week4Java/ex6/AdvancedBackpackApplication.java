package week4Java.ex6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AdvancedBackpackApplication {
    public static void main(String[] args) {

        Set<Item> backpack = new HashSet<>();
        System.out.println("Backpack: "+backpack);
        Item item1 = new Item("toothpaste");
        Item item2 = new Item("towel");
        Item item3 = new Item("underwear");
        backpack.addAll(Arrays.asList(item1,item2,item3));
        System.out.println("Backpack: "+backpack);
        Item item4 = new Item("underwear");
        boolean containsUnderwear = backpack.contains(item4);
        if(containsUnderwear){
            System.out.println("The backpack contains underwear");
        }
        backpack.remove(item4);
        System.out.println("Backpack: "+backpack);
        boolean isUnderwearIn = backpack.contains(item4);
        if(!isUnderwearIn){
            System.out.println("The backpack no longer contains underwear");
        }
        backpack.add(item1);
        System.out.println("Backpack: "+backpack);

        backpack.add(item1);
        System.out.println("Backpack: "+backpack);
        System.out.println("Backpack size: "+backpack.size());
    }
}

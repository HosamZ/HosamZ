package week3;

import java.util.ArrayList;
import java.util.List;

public class Ex4 {


    public static void main(String[] args) {


        List<Integer> moneyFromFriends = new ArrayList<Integer>();

        moneyFromFriends.add(4);
        moneyFromFriends.add(2);
        moneyFromFriends.add(1);
        moneyFromFriends.add(2);
        Integer total = 0;
        for (Integer amount : moneyFromFriends) {

            total = total + amount;

        }
        System.out.println("I have a total of " + total + " Euro");

    }
}

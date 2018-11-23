package week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex8 {
    public static void main(String[] args) {

        List<Integer> serialNumbers = getSerialNumbers();
        List<Integer> teamEven = new ArrayList<>();
        List<Integer> teamOdd = new ArrayList<>();
        for (Integer number : serialNumbers
        ) { if (isEven(number)) {
                teamEven.add(number);
        }else{
            teamOdd.add(number);
        } }
        System.out.println("team even group is : " + teamEven);
        System.out.println("team odd group is : " + teamOdd);
    }
    public static Boolean isEven(Integer number) {
        Integer modulo = number % 2;
        return modulo == 0;
    }

    public static List<Integer> getSerialNumbers() {
        List<Integer> serialNumbers = new ArrayList<>();
        serialNumbers.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20));
        return serialNumbers;
    }
}

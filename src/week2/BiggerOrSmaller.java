package week2;

import java.util.ArrayList;
import java.util.Scanner;


public class BiggerOrSmaller {


    public static void main(String[] args) {
        Integer number1 = getNumber();
        Integer number2 = getNumber();

        if (isBigger(number1 , number2)) {

            System.out.println("Number1 is Bigger");


        }
        if (number1 == number2) {

            System.out.println("Sorry but the two numbers are equal!!");
        }


        if (isSmaller(number1 , number2)) {

            System.out.println("Number 2 is Bigger");
        }
    }
    public static Integer getNumber() {

        System.out.println("give me Number");
        Scanner scanner = new Scanner(System.in);

        return scanner.nextInt();
    }

    public static Boolean isBigger(Integer number1, Integer number2) {

        return number1 > number2;
    }

    public static Boolean isSmaller(Integer number1, Integer number2) {

        return number1 < number2;
    }


}
package week2;

import java.util.Scanner;

public class Ex20 {


    public static void main(String[] args) {


        System.out.println("Woof food do I get today ?!");

        Scanner scanner = new Scanner(System.in);
        Integer answer = scanner.nextInt();

        Integer jumpTimes = 6 * answer;
        Integer barkTimes = 1 + answer;
        System.out.println("Jumps "+jumpTimes+" times and bark "+barkTimes+" times");




    }
}

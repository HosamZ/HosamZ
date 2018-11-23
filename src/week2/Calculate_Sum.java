package week2;

import java.util.Scanner;

public class Calculate_Sum {


    public static void main(String[] args) {

        System.out.println("tell me your first number");
        int num1, num2, sum;
        Scanner scanner = new Scanner(System.in);
        num1 = scanner.nextInt();

        System.out.println("tell me your second number");
        num2 = scanner.nextInt();

        scanner.close();

        sum = num1 + num2;

        System.out.println("The sum is:" + sum);

    }


}

package week2;

import java.util.Scanner;

public class Ex10 {


    public static void main(String[] args) {
        System.out.println("give me your number");
        Scanner scanner = new Scanner(System.in);
        Integer number = scanner.nextInt();
        Integer square = number*number;
        System.out.println("your number square is: "+square);



    }
}

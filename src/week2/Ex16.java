package week2;

import java.io.StringReader;
import java.util.Scanner;

public class Ex16 {


    public static void main(String[] args) {

        String name = getName();
        System.out.println("Please tell me your order number !");

        Scanner scanner = new Scanner(System.in);
        Integer number = scanner.nextInt();

        Integer results = number % 3;
        Integer price = results * 4;
        System.out.println("Here you are, " + name + " it`s " + price + "Euro.");


    }
    public static String getName() {
        System.out.println("What`s your name?");
        Scanner scanner = new Scanner(System.in);

        return scanner.nextLine();
    }
}

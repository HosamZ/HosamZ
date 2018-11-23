package week3;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {

        System.out.println("Say a number between 1 and 10 ");
        Scanner scanner = new Scanner(System.in);
        Integer number = scanner.nextInt();
        while (number < 0 || number > 11) {
            System.out.println("Say a number between 1 and 10 ");
            //scanner = new Scanner(System.in);
            number = scanner.nextInt();

        }
        System.out.println("ok let`s do a trick with this number " + number);

    }
}

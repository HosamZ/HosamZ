package week7Java.ex6;

import java.util.List;
import java.util.Scanner;

public class SecretHandshakesApplication {
    public static void main(String[] args) {
        SecretHandshakeMovesTranslator translator = new SecretHandshakeMovesTranslator();
        System.out.println("Good evening, how much does this item cost? ");
        Scanner scanner = new Scanner(System.in);
        Integer answer = scanner.nextInt();
        List<String> result = translator.translatePriceIntoMove(answer);
        System.out.println(result);


    }
}

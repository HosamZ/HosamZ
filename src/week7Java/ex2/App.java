package week7Java.ex2;

import java.util.Optional;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        wordReceiver();
    }


    public static void wordReceiver() {
        NicknameGenerator wordSplitter = new NicknameGenerator();
        System.out.println("Please enter your word!");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        Optional<String> split = wordSplitter.generate(answer);
        if (split.isPresent()) {
            System.out.println(split.get());
        } else {
            System.out.println("re enter a valid word");
        }
    }
}

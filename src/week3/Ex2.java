package week3;

import java.util.Scanner;

import static week2.Ex16.getName;

public class Ex2 {

    public static void main(String[] args) {


        if (!hasClicked()) {
            System.out.println("Apolagize...");
        } else {
            System.out.println("Loading ...");
            if (!isAdult()) {
                System.out.println("Sorry you can`t sign up");
            } else {
                System.out.println("Loading ...");
                if (!isValid(getName())) {
                    System.out.println("Sorry you can`t sign up");
                } else {
                    System.out.println("Loading ...");
                    System.out.println("You are signed up! Thank you !");
                }

            }
        }
    }


    public static Boolean hasClicked() {

        System.out.println("Did something Click?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextBoolean();
    }

    public static Boolean isAdult() {

        System.out.println("How old are you?");
        Scanner scanner = new Scanner(System.in);
        Integer age = scanner.nextInt();
        return age >= 18;
    }

    public static Boolean isValid(String name) {

        return name.length() >= 3;

    }


}

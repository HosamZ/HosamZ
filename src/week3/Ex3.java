package week3;

import java.util.Scanner;

public class Ex3 {


    public static void main(String[] args) {

    if (!isWearingAHat() && !isBringingAPet()){

        System.out.println("Welcome to our cinema, how may i assist you?");
     }else {
            System.out.println("I`m sorry, but you are not allowed to enter.");
        }

    }

    public static Boolean isWearingAHat() {

        System.out.println("Are you wearing a Hat?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextBoolean();
    }
    public static Boolean isBringingAPet() {
        System.out.println("Are you bringing a Pet?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextBoolean();
    }


}


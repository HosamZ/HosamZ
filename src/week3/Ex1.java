package week3;

import java.util.Scanner;

public class Ex1 {


    public static void main(String[] args) {

        if (isAtHome() && !isUsingOldPhone()) {
            System.out.println("call with old Telephone.");
        } else {
            System.out.println("call with CellPhone.");
        }
    }

    public static Boolean isAtHome() {

        System.out.println("Are we at Home?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextBoolean();

    }

    public static Boolean isUsingOldPhone() {

        System.out.println("Grandma are you using old phone?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextBoolean();
    }


}

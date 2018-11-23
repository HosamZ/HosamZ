package week2;


import java.util.Scanner;

public class Ex19 {


    public static void main(String[] args) {

        System.out.println("Welcome to our comic shop. How much is your comic?");

        Scanner scanner = new Scanner(System.in);
        Double price = scanner.nextDouble();
        System.out.println("How much are you going to pay ?");

        Double paidMoney = scanner.nextDouble();

        Double change = paidMoney - price;

        double cents = (change * 1000) % 100;
        double euros = Math.floor(change);
        System.out.println("here you are" + euros + " and " + cents + "cents");

    }
}

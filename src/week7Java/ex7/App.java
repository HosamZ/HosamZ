package week7Java.ex7;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Transporter transporter = new Transporter();
        transporter.vehiclesChecker();
        System.out.println("please enter how many vehicles type~1 do you have? ");
        Scanner scanner = new Scanner(System.in);
        Integer answerVehiclesType1 = scanner.nextInt();
        System.out.println("please enter how many vehicles type~2 do you have? ");
        Integer answerVehiclesType2 = scanner.nextInt();
        System.out.println("please enter how many Celebrities? ");
        Integer celebritiesNumber  = scanner.nextInt();
        transporter.canTransportEveryone(answerVehiclesType1,answerVehiclesType2,celebritiesNumber);


    }
}

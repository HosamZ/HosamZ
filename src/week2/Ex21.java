package week2;

import java.util.Scanner;

public class Ex21 {

    public static void main(String[] args) {

        System.out.println("What is the last episode number you watched ?");

        Scanner scanner = new Scanner(System.in);
        Integer episode = scanner.nextInt();

        Integer season2 = (episode % 12 * episode / 12) + (12 * episode / 24);

        Integer season1 = episode - season2;
        Integer season2Minutes = season2 * 34;
        Double season1Minutes = season1 * 47.0;
        Double totalMinutes = season1Minutes + season2Minutes;

        double hours = Math.floor(totalMinutes/60);
        //double hours = Math.floor(hours);
        Double minutes = totalMinutes % 60;
        String message = "You have watched a total of " + hours + " hours and " + minutes + " minutes ";
        System.out.println(message);
        System.out.println("(a Total of " + totalMinutes + ")");


    }
}

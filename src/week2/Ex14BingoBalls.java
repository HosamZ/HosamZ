package week2;

import java.util.ArrayList;

public class Ex14BingoBalls {

    public static void main(String[] args) {

        ArrayList<String> balls = new ArrayList<String>();

        balls.add("red");
        balls.add("blue");
        while (balls.size() > 0) {


            String ball = balls.get(0);
            ball = balls.remove(0);

            System.out.println("You picked the number : " + ball);

        }

    }

}

package evaluation.week3Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberMirror2 {

    //try number3

    public void mirror2(Integer number) {

        Integer reversed = 0;

        while (number != 0) {
            Integer lastDigit = number % 10;
            reversed = reversed * 10 + lastDigit;
            number /= 10;
        }
        System.out.println("Reversed Number: " + reversed);

    }
}


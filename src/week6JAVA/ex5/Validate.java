package week6JAVA.ex5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Validate {

    public Boolean iSCheckValidate(Integer number) {
        return number % 10 == 0;
    }

    public Integer getSum(Long cardNumber) {
        String number = cardNumber.toString(cardNumber);
        List<String> allNumbers = getSplintList(number);
        Collections.reverse(allNumbers);

        List<String> evenNumbers = getEvenList(allNumbers);
        List<String> oddNumbers = getOddList(allNumbers);
        Integer sumEven = getEvenSum(evenNumbers);
        Integer sumOdd = getOddSum(oddNumbers);
        return  sumEven +sumOdd ;
    }

    public Integer getEvenSum(List<String> oddNumbers) {
        Integer sumOdd = 0;
        for (String oddNumber : oddNumbers) {
            Integer num = Integer.valueOf(oddNumber);
            sumOdd = sumOdd + num;
        }
        return sumOdd;
    }

    public static Integer getOddSum(List<String> evenNumbers) {
        Integer sumEven = 0;
        for (String evenNumber : evenNumbers) {
            Integer num = Integer.valueOf(evenNumber);
            if (num >= 5) {
                num = (num * 2) - 9;
                sumEven = sumEven + num;
            } else {
                num = num * 2;
                sumEven = sumEven + num;
            }

        }
        return sumEven;
    }

    public List<String> getEvenList(List<String> allNumbers) {
        List<String> evenNumber = new ArrayList<>();

        for (int position = 0; position < allNumbers.size(); position++) {
            if (position % 2 == 0) {

                String numString = allNumbers.get(position);
                evenNumber.add(numString);
            }
        }
        return evenNumber;
    }

    public List<String> getOddList(List<String> allNumbers) {
        List<String> oddNumber = new ArrayList<>();
        for (int position = 0; position < allNumbers.size(); position++) {
            if (position % 2 != 0) {

                String numString = allNumbers.get(position);
                oddNumber.add(numString);
            }
        }
        return oddNumber;
    }


    public List<String> getSplintList(String number) {
        String[] splint = number.split("");
        List<String> allnumbers = Arrays.asList(splint);
        return allnumbers;
    }


}
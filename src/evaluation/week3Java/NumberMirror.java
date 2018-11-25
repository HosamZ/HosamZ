package evaluation.week3Java;

import java.util.ArrayList;
import java.util.List;
//try number 2
public class NumberMirror {

    public Integer mirror(Integer number) {
        List<Integer> reversedDigits = new ArrayList<>();

       while(number>0){
           Integer lastDigit = number%10;
           reversedDigits.add(lastDigit);
           number = (number-lastDigit)/10;
       }
       Double modifiedNumber=0.0;
        while (reversedDigits.size()>0){
            int size = reversedDigits.size();
            Integer digit = reversedDigits.get(0);
            Double number1= digit * Math.pow(10,size-1);
            modifiedNumber = modifiedNumber+number1;
            reversedDigits.remove(0);
        }
        return modifiedNumber.intValue();
    }
}






//        String splitedNumber = Integer.toString(number);

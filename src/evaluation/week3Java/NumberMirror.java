//package evaluation.week3Java;
//
//import java.util.ArrayList;
//import java.util.List;
////try number 2
//public class NumberMirror {
//
//    public Double mirror(Double number) {
//
//        Double lastDigit = number%10;
//        List<Double> reversedDigits = new ArrayList<>();
//        reversedDigits.add(lastDigit);
//        Double newNumber = (number-lastDigit)/10;
//        Double modifiedNumber = 0;
//        while (reversedDigits.size()>0){
//            Double digit = reversedDigits.get(0);
//            Double size = Math.pow(10,-1);
//            modifiedNumber = number+(digit*size);
//            reversedDigits.remove(0);
//        }
//        return modifiedNumber;
//    }
//}
//
//
//
//
//
//
////        String splitedNumber = Integer.toString(number);

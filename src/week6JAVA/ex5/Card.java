//package week6JAVA.ex5;
//
//import java.util.Arrays;
//import java.util.List;
//
//public class Card {
//
//
//    private List<CreditCard> cards = Arrays.asList(new MasterCard(), new Visa(), new AmericanExpress());
//
//
//    public String getCard() {
//        for (CreditCard card : cards) {
//            List<Integer> spacialNumber = card.getSpecialNumber();
//            List<Integer> lenght = card.getLength();
//            if (card.checkIsValue(spacialNumber, lenght)){
//
//
//            }
//        }
//
//        return null;
//    }
//
//
//    public Integer getSpacialNumber(List<String> numbers) {
//        String num2 = "";
//        for (int i = 0; i < 2; i++) {
//            String number = numbers.get(i);
//            Integer num = Integer.valueOf(number);
//            if (num == 4) {
//                return num;
//            }
//            if (num != 4) {
//                num2 = number + "";
//            }
//        }
//        Integer num3 = Integer.valueOf(num2);
//        return num3;
//    }
//
//    public Integer getLenght(List<String> numbers) {
//        return numbers.size();
//    }
//
//}

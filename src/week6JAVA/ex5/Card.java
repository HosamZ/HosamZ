package week6JAVA.ex5;
import java.util.Arrays;
import java.util.List;

public class Card {


    private List<CreditCard> cards = Arrays.asList(new MasterCard(), new Visa(), new AmericanExpress());

    public String getCard(Long number) {
        String creditCard = "";
        for (CreditCard card : cards) {
            Integer spacialNumber = getSpacialNumber(number);
            Integer lenght = getLenght(number);
            if (card.checkIsValue(lenght, spacialNumber)) {
                creditCard = card.getName();
                return creditCard;
            }else {
                creditCard = " Creditcard is Invalid";

            }
        }

        return creditCard;
    }
    public Integer getSpacialNumber(Long number) {

        String numberString = number.toString(number);
        Integer spacialNumber = 0;
        if (numberString.startsWith("4")) {
            spacialNumber = 4;

        } else {
            List<String> numbersList = getSplintList(numberString);
            String numEmpty = "";
            for (int i = 0; i < 2; i++) {
                String numString = numbersList.get(i);
                numEmpty = numEmpty + numString;
            }
            spacialNumber = Integer.valueOf(numEmpty);
            return spacialNumber;

        }
        return spacialNumber;
    }


    public Integer getLenght(Long number) {
        String numberString = number.toString(number);
        List<String> numbers = getSplintList(numberString);
        return numbers.size();
    }

    public List<String> getSplintList(String number) {
        String[] splint = number.split("");
        List<String> allnumbers = Arrays.asList(splint);
        return allnumbers;
    }

}
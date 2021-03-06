package week6JAVA.ex5;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Card {
    private List<CreditCard> cards = Arrays.asList(new MasterCard(), new Visa(), new AmericanExpress());

    public String getCard(Long number) {
        for (CreditCard card : cards) {
            Integer spacialNumber = getSpecialNumber(number);
            Integer lenght = getLength(number);
            if (card.checkIsValue(lenght, spacialNumber)) {
                 return card.getName();
            }
        }

        return "Creditcard is Invalid";
    }

    public Integer getSpecialNumber(Long number) {

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

    public Integer getLength(Long number) {
        String numberString = number.toString(number);
        List<String> numbers = getSplintList(numberString);
        return numbers.size();
    }

    public List<String> getSplintList(String number) {
        String[] splint = number.split("");
        List<String> allnumbers = Arrays.asList(splint);
        return allnumbers;
    }

    public Optional<CreditCard> get(String name) {
        for (CreditCard card : cards) {
            if (card.getName().equalsIgnoreCase(name)) {
                return Optional.of(card);
            }
        }
        return Optional.empty();
    }
}
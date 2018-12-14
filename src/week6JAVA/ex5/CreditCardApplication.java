package week6JAVA.ex5;
import java.util.Arrays;
import java.util.List;

public class CreditCardApplication {
    public static void main(String[] args) {
        Validate validate = new Validate();
        Long cardNumber = 378282246310005L;
        Integer sum = validate.getSum(cardNumber);
        System.out.println(sum);
        boolean isValid = validate.iSCheckValidate(sum);
        System.out.println(isValid);
        String number = cardNumber.toString(cardNumber);
        String[] splint = number.split("");
        List<String> allNumbers = Arrays.asList(splint);
        System.out.println(allNumbers);
        System.out.println(number);



    }
    public static void startWith(List<String> cards){
        Card card1 = new Card();
        for (String card : cards) {

        }

    }
}

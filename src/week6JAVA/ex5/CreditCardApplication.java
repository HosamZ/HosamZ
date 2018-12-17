package week6JAVA.ex5;

public class CreditCardApplication {
    public static void main(String[] args) {
        getAndTestCard();
    }

    public static void getAndTestCard() {
        Validate validate = new Validate();
        Long cardNumber = 4111111111111111L;
        Integer sum = validate.getSum(cardNumber);
        System.out.println(sum);
        boolean isValid = validate.iSCheckValidate(sum);
        Card card = new Card();
        System.out.println(isValid);
        if (isValid) {
            String cardN = card.getCard(cardNumber);
            System.out.println(card.get(cardN).get().getName());
        }
    }
}
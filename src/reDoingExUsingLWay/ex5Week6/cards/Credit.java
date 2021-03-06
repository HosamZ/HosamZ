package reDoingExUsingLWay.ex5Week6.cards;

import reDoingExUsingLWay.ex5Week6.LuhnValidator;

public class Credit {
    private LuhnValidator luhnValidator = new LuhnValidator();

    public String getType(Long number){
        String cardNumber = number.toString();
        if (!luhnValidator.isValid(cardNumber)){
            return "INVALID";
        }
        return CreditCards.getCreditCard(cardNumber);
    }
}

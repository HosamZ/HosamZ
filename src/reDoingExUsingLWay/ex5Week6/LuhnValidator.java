package reDoingExUsingLWay.ex5Week6;

public class LuhnValidator {
    public boolean isValid(String cardNumber){
        LuhnsAlgorithm calculator = new LuhnsAlgorithm();
        Integer checkSum = calculator.calculate(cardNumber);
        return checkSum%10==0;
    }
}

package week3JAVA.ex3;

public class SupermarketApplication {

    public static void main(String[] args) {
        NumberCorrector corrector = new NumberCorrector();
       Double number = corrector.correct(-2.3);
        System.out.println("your corrected number is "+number);
    }
}

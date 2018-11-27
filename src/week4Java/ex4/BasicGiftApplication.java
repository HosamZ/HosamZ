package week4Java.ex4;
import java.util.Optional;
public class BasicGiftApplication {
    public static void main(String[] args) {
        Optional<String> giftBox = Optional.empty();
        System.out.println("Gift : " + giftBox);

        giftBox = Optional.of("Robotoy");
        System.out.println("Gift : " + giftBox);
        boolean isGiftThere = giftBox.isPresent();
        System.out.println("is there a gift in the box ?" + isGiftThere);
        System.out.println("The gift is a : "+giftBox.get());
    }

}
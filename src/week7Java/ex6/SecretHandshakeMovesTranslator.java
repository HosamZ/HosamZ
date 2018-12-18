package week7Java.ex6;

import week7Java.ex4.NumberSplitter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecretHandshakeMovesTranslator {
    private NumberSplitter splitter = new NumberSplitter();
    private List<String> handShakes = new ArrayList<>();

    public List<String> translatePriceIntoMove(Integer price) {

        List<Integer> splittedPrice = splitter.number(price);
        chooseMoves(splittedPrice);
        return handShakes;
    }

    private List<String> chooseMoves(List<Integer> splittedPrice) {
        List<Integer> handShakesOrder = Arrays.asList(2, 5, 6, 9);
        List<String> handShakesMoves = Arrays.asList(
                "thumb touches back",
                "tickles over palm",
                "bro knock",
                "thousand knuckles"
        );
        for (Integer digit : splittedPrice) {
            if (handShakesOrder.contains(digit)) {
                int position = handShakesOrder.indexOf(digit);
                String move = handShakesMoves.get(position);
                handShakes.add(move);
            }
        }
        return handShakes;
    }
}

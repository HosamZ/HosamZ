package week8.ex4;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class PowerLevelScouter {
    public Integer scout(String name) {
        return calculate(name, n->getLettersAsciiSum(n));
    }

    private Integer calculate(String name, Function<String, Integer> calculation){
        return calculation.apply(name);
    }

    private Integer getLettersAsciiSum(String name) {
        byte[] ascii = name.getBytes(StandardCharsets.US_ASCII);
        String asciiString = Arrays.toString(ascii);
        String modified = asciiString.substring(1, asciiString.length() - 1);
        List<String> codes = Arrays.asList(modified.split(", "));
        Integer sum= 0;
        for (String code : codes) {
            Integer number = Integer.valueOf(code);
            sum += number;
        }
        return sum;
    }

    public Integer scoutEnhanced(String name) {
        return calculate(name, n-> getLettersAsciiSum(n.toLowerCase()));
    }
}
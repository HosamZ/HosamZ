package challangeFindNxtSmallerNumber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Stack;

class NumberSplitterTest {

    @Test
    void split() {
        NumberSplitter numberSplitter = new NumberSplitter();
        Stack<String> split = numberSplitter.split(123);
        String pop = split.pop();
        System.out.println(split);
        System.out.println("pop:" + pop);
        Assertions.assertEquals(3,Integer.valueOf(pop));
    }
}
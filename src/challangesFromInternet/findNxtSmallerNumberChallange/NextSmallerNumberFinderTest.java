package challangesFromInternet.findNxtSmallerNumberChallange;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NextSmallerNumberFinderTest {

    @Test
    void findNext() {
        Integer next = new NextSmallerNumberFinder().findNext(675902);
        System.out.println(next);
    }

    @Test
    void findNextOneDigit() {
        Integer actual = new NextSmallerNumberFinder().findNext(6);
        Integer expected = -1;
        assertEquals(expected,actual);
    }

    @Test
    void findNextSameDigits() {
        Integer actual = new NextSmallerNumberFinder().findNext(666);
        Integer expected = -1;
        assertEquals(expected,actual);
    }

    @Test
    void findNextNaturalOrder() {
        Integer actual = new NextSmallerNumberFinder().findNext(123);
        Integer expected = -1;
        System.out.println(actual);
        assertEquals(expected,actual);
    }

    @Test
    void findNextStartsWithZero() {
        Integer actual = new NextSmallerNumberFinder().findNext(1027);
        System.out.println(actual);
        Integer expected = -1;

        assertEquals(expected,actual);
    }
}
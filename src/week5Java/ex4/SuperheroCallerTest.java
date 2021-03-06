package week5Java.ex4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SuperheroCallerTest {

    @Test
    void testNullValue(){
        SuperheroCaller caller = new SuperheroCaller();
        Superhero hero =caller.call();
        Assertions.assertNotNull(hero);

    }
    @Test
    void testNames(){
        SuperheroCaller caller = new SuperheroCaller();
        Superhero hero = caller.call();
        List<String> heroes = Arrays.asList("Batman","Superman","Spiderman");
        Assertions.assertTrue(heroes.contains(hero.getName()));
    }

//    @TicTakToe
//    void testBatmanCall() {
//        Batman batman = new Batman();
//        Assertions.assertEquals("Batman",batman.getName());
//
//    }
//    @TicTakToe
//    void testSupermanCall(){
//        Superman superman = new Superman();
//        Assertions.assertEquals("Superman",superman.getName());
//    }
//    @TicTakToe
//    void testSpidermanCall(){
//        Spiderman spiderman = new Spiderman();
//        Assertions.assertEquals("Spiderman",spiderman.getName());
//    }

}
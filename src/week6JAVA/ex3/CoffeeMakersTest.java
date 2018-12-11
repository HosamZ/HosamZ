package week6JAVA.ex3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class CoffeeMakersTest {

    @Test
    void CoffeeMakersTest() {
        Coffee coffee = new Coffee("Automatic coffee machine",5);
        Optional<CoffeeMaker> coffeeMaker = CoffeeMakers.get("Automatic coffee machine");
        Assertions.assertEquals(coffee.getMadeBy(),coffeeMaker.get().getName());
        Assertions.assertEquals(coffee.getBrewedTime(),coffeeMaker.get().getBrewingTime());
    }

    @Test
    void testNullValue() {
        Coffee coffee = new Coffee("Moka pot",0);
        Optional<CoffeeMaker> coffeeMaker = CoffeeMakers.get("Moka pot");
        Assertions.assertNotNull(coffeeMaker.isPresent());


    }
}
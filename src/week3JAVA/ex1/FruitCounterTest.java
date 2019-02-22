package week3JAVA.ex1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class FruitCounterTest {
    Screen screen = new Screen();
    @Test
    void testBusinessCustomer() {
        Customer customer = new Customer("Ahmad", "business");
        String formatted = screen.formatName(customer);
        Assertions.assertEquals("AHMAD", formatted);
    }
    @Test
    void testEconomicCustomer() {
        Customer customer = new Customer("Sameer", "economic");
        String formatted = screen.formatName(customer);
        Assertions.assertEquals("sameer", formatted);
    }
    @Test
    void testOtherCustomer() {
        Customer customer = new Customer("Adnan", "highclass");
        String formatted = screen.formatName(customer);
        Assertions.assertEquals("adnan", formatted);
    }

}
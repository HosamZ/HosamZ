package week3JAVA.ex2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import week3JAVA.ex1.Customer;

import static org.junit.jupiter.api.Assertions.*;

class TemplateChooserTest {

    private TemplateChooser chooser = new TemplateChooser();

    @Test
    void testManTemplate() {

        Customer customer = new Customer("  Mr.Ahmad  ");
        String template = chooser.chooseTemplate(customer);
        Assertions.assertEquals("Man",template);
    }
    @Test
    void testWomanTemplate() {

        Customer customer = new Customer("  Ms.Reem  ");
        String template = chooser.chooseTemplate(customer);
        Assertions.assertEquals("Woman",template);
    }
    @Test
    void testPrivilegedTemplate() {

        Customer customer = new Customer("Mr.Hokopoko  ");
        String template = chooser.chooseTemplate(customer);
        Assertions.assertEquals("privileged",template);
    }
    @Test
    void testDefaultTemplate() {

        Customer customer = new Customer("Sameer");
        String template = chooser.chooseTemplate(customer);
        Assertions.assertEquals("default",template);
    }
}
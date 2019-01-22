package week3JAVA.ex2;

import week3JAVA.ex1.Customer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsuranceApplication {
    public static void main(String[] args) {
        Customer customer5 = new Customer("Mr.Ahmad");
        Customer customer1 = new Customer("Ms.Razan");
        Customer customer2 = new Customer("Mrs.Sara");
        Customer customer3 = new Customer("Hokopoko Boss");
        Customer customer4 = new Customer("Random client");
        TemplateChooser chooser = new TemplateChooser();
        List<Customer> customers = new ArrayList<>();
        customers.addAll(Arrays.asList(customer5,customer1,customer2,customer3,customer4));
        for (Customer customer : customers) {
            String  template = chooser.chooseTemplate(customer);
            System.out.println(customer.getName() + " "+template);
        }
    }
}

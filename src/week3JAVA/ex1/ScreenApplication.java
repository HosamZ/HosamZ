package week3JAVA.ex1;

public class ScreenApplication {

    public static void main(String[] args) {
        Customer customer1 = new Customer("bob", "BUSINESS");
        Customer customer2 = new Customer("Mark", "Economy");
        Screen screen = new Screen();
        screen.display(customer1);
        screen.display(customer2);
    }
}

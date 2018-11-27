package week3JAVA.ex1;

public class Customer {
    private String name;
    private String category;
    public Customer(String name, String category) {
        this.name = name;
        this.category = category;
    }
    public Customer(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

}

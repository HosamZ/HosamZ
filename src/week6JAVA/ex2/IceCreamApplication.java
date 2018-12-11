package week6JAVA.ex2;

public class IceCreamApplication {
    public static void main(String[] args) {

        IceCream cone = new ConeIceCream("Chocolate","Oreo");
        System.out.println(cone.eat());
        IceCream cone1 = new CupIceCream("Vanilla","Cookies");
        System.out.println(cone1.eat());


    }

}

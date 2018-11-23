package Week2JAVAPart2.Ex4;

public class CarShopApplication {
    public static void main(String[] args) {
        Seller seller = new Seller();
        Car car1 = new Car("ferrari");
        Car car2 = new Car("Opel");
        Car car3 = new Car("BMW");
        seller.describe(car1);
        seller.describe(car2);
        seller.describe(car3);
    }

}

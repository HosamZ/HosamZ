package evaluation.week6;

public class CarApplication {
    public static void main(String[] args) {
        Hansel hansel = new Hansel();
        Cars cars= new Cars();
        for (int times = 0; times < 10; times++) {

            hansel.haveATry("Audi");
            cars.getNextCarBrand().drive();
        }



    }
}

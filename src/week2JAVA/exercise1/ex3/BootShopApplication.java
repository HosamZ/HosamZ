package week2JAVA.exercise1.ex3;

import java.util.List;

public class BootShopApplication {

    public static void main(String[] args) {
        BootShopAssistant bootShopAssistant = new BootShopAssistant();
        List<HikingBoot> boots = bootShopAssistant.getHikingBootRecommendations();
        Hansel hansel = new Hansel();
        hansel.tryHikingBoots(boots);
    }
}

package week2JAVA.exercise1.ex3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BootShopAssistant {

    public List<HikingBoot> getHikingBootRecommendations() {
        List<HikingBoot> recommendations = new ArrayList<>();
        recommendations.add(new HikingBoot(41));
        recommendations.add(new HikingBoot(40));
        recommendations.add(new HikingBoot(42));
        Collections.shuffle(recommendations);
        return recommendations;
    }
}

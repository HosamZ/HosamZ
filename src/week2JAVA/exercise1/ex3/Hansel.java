package week2JAVA.exercise1.ex3;

import java.util.List;

public class Hansel {

    private Integer footSize = 41;

    private Boolean isRightSize(HikingBoot boot) {
        Integer sizeOfBoot = boot.getSize();
        return sizeOfBoot == footSize;
    }

    public void tryHikingBoots(List<HikingBoot> boots) {
        for (HikingBoot boot : boots) {
            if (isRightSize(boot)) {
                System.out.println("I`m buying this one Thanks.");
                return;
            }
            System.out.println("this one does not fit , Sorry!");
        }
    }
}

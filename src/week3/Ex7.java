package week3;

import java.util.ArrayList;
import java.util.List;

public class Ex7 {

    public static void main(String[] args) {
        List<String> presentsOfMugtus = new ArrayList();

        presentsOfMugtus.add("present1");
        presentsOfMugtus.add("present2");
        presentsOfMugtus.add("present3");
        presentsOfMugtus.add("present4");

        List<String> presentsOFSamantha = new ArrayList<>();

        presentsOFSamantha.add("presentX");
        presentsOFSamantha.add("present2");
        presentsOFSamantha.add("present5");
        presentsOFSamantha.add("present6");
        presentsOFSamantha.add("present3");
        List<String> finalList = new ArrayList<>();
        List<String> repeatedPresetns = new ArrayList<>();
        finalList = presentsOfMugtus;
        for (String present : presentsOFSamantha) {

            repeatedPresetns.add(present);
            if (finalList.contains(present)) {
                repeatedPresetns.add(present);
            } else {
                finalList.add(present);
            }
        }
        System.out.println("Repeated list is : " + repeatedPresetns);
        System.out.println("Final list is :  " + finalList);

    }
}

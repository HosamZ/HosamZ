package week3JAVA.ex4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

//input : Hosam
//output : Hosa$4%m
public class Encryptor {

    // Comment

    

    public String encrypt(String messege){
        Random random = new Random();
        messege.replaceAll("A","4");
        messege.replaceAll("a","4");
        messege.replaceAll("E","3");
        messege.replaceAll("e","3");
        messege.replaceAll("I","1");
        messege.replaceAll("i","1");
        messege.replaceAll("O","8");
        messege.replaceAll("o","8");
        messege.replaceAll("U","9");
        messege.replaceAll("u","9");
        String[] split = messege.split("");
        List<String> letters = new ArrayList<>(Arrays.asList(split));
        String rubbish = "!@#$%&*+-=";
        List<String> newLetter = new ArrayList<>();
        for (String letter : split) {
            newLetter.add(letter);
            int randomNumber = random.nextInt(5);
            randomNumber++;
            String rubbishSection = rubbish.substring(1,randomNumber);
            newLetter.add(rubbishSection);
        }
        String newMsg = "";
        for (String letter : newLetter) {
            newMsg=newMsg+letter;
        }
        return newMsg;
    }
}

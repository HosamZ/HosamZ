package week4Java.ex12;

import java.util.ArrayList;
import java.util.List;

public class GotApplication {
    public static void main(String[] args) {
        showNumberOfCharacters();
        System.out.println("Number of dead characters: "+characterDeath());
        showNumberOfMenDeaths();
        //countFruit more clasess to store your methods every class has one responsibility
        deadWomenPercentage();
        Integer deadmen = showNumberOfMenDeaths();
        System.out.println("Dead men: "+deadmen+" | "+"Dead men: "+deadMenPercentage()+"%");
        Integer deadwomen = womenDeaths();
        System.out.println("Dead women: "+deadwomen+" | "+"Dead women: "+deadWomenPercentage()+"%");
    }
    private static Integer deadMenPercentage(){
        Integer totalMenDeaths = showNumberOfMenDeaths();
        Integer percentage1 = totalMenDeaths*100/characterDeath();
        return percentage1;
    }
    private static Integer deadWomenPercentage() {
        Integer totalWomenDeaths = womenDeaths();
        Integer percentage = totalWomenDeaths*100/characterDeath();
        return percentage;
    }
    private static Integer numberOfWomen(){
        CharacterReader reader = new CharacterReader();
        List<Character> lines = reader.getCharacters("week4Java/ex12/got-characters.csv");
        List<Character> womenTotalNumber = new ArrayList<>();
        for (Character line : lines) {
            if (line.getGender().contains("0")){
                womenTotalNumber.add(line);
            }
        }
        Integer totalWomenNumber = womenTotalNumber.size();
        return totalWomenNumber;
    }
    private static Integer womenDeaths() {
        CharacterReader reader = new CharacterReader();
        List<Character> lines = reader.getCharacters("week4Java/ex12/got-characters.csv");
        List<Character> womanDeaths = new ArrayList<>();

        for (Character line : lines) {
            if (!line.getBookOfDeath().isEmpty() && line.getGender().contains("0")) {
                womanDeaths.add(line);
            }
        }
        Integer womenDeath = womanDeaths.size();
        return womenDeath;
    }
    private static Integer showNumberOfMenDeaths() {
        CharacterReader reader = new CharacterReader();
        List<Character> characters = reader.getCharacters("week4Java/ex12/got-characters.csv");
        List<Character> menDeaths = new ArrayList<>();

        for (Character character : characters) {
            if(!character.getBookOfDeath().isEmpty()&& character.getGender().contains("1")){
                menDeaths.add(character);
            }
        }
        return menDeaths.size();
    }
    private static Integer characterDeath() {
        CharacterReader reader = new CharacterReader();
        List<Character> lines = reader.getCharacters("week4Java/ex12/got-characters.csv");
        List<Character> deaths = new ArrayList<>();
        for (Character line : lines) {
            if (!line.getBookOfDeath().isEmpty()){
                deaths.add(line);
            }
        }
        return deaths.size();
    }
    private static void showNumberOfCharacters() {
        CharacterReader reader = new CharacterReader();
        List<Character> lines = reader.getCharacters("week4Java/ex12/got-characters.csv");
        //How many characters appear in the books in total?
        System.out.println("Number of characters: "+lines.size());
    }
}


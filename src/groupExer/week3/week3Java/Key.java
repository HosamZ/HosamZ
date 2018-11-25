package groupExer.week3.week3Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Key {

    private Integer numberKey;

    public Key(Integer numberKey)
    {
        this.numberKey = numberKey;
    }
    public List<String> getLetters(String text) {
        String[] split = text.split("");
        List<String> letters = new ArrayList<>(Arrays.asList(split));
        return letters;
    }
    public List<String> applyKey(List<String> words) {
        List<String> letters = new ArrayList<>();
        for (String word : words) {
            int letterNumber = toAscii(word);
            int newLetterNumber = letterNumber + numberKey;

            if (newLetterNumber > 122) {
                newLetterNumber = (newLetterNumber % 122) + 64;
            }
            String newLetter = toLetter(newLetterNumber);
            letters.add(newLetter);
        }
        return letters;
    }
    public String ciphertext(List<String> letters) {
        String ciphertext = "";

        for (String letter : letters) {
            ciphertext = ciphertext + letter;
        }
        return ciphertext;
    }
    public int toAscii(String letter) {
        char character = letter.charAt(0);
        int asciiCode = character;

        return asciiCode;
    }
    public String toLetter(int asciiCode) {
        char character = (char) asciiCode;

        return String.valueOf(character);
    }
    public Integer getNumberKey()
    {
        return numberKey;
    }
    public void setNumberKey(Integer numberKey)
    {
        this.numberKey = numberKey;
    }
}
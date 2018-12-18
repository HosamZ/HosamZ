package week2;

import static week2.Ex16.getName;

public class Ex18 {


    public static void main(String[] args) {

        String word = getName();
        word = word.toUpperCase();
        int size = word.length();
        String middle = word.substring(1, size - 1);
        Character firstLetter = word.charAt(0);
        Character lastletter = word.charAt(size - 1);
        middle = middle.toLowerCase();
        String newWord = firstLetter + middle + lastletter;
        System.out.println(newWord);
    }
}



package week7Java.ex5;

public class CheckIfWordPalindrom {
    public static void main(String[] args) {
        String word = "nurses run";
        boolean checker = isWordPalindrom(word);
        System.out.println(checker);
    }
    public static boolean isWordPalindrom(String word){

        String[] splittedWord = word.replaceAll(" ","").split("");
        for (int i = 0; i <splittedWord.length/2 ; i++) {
            if (!splittedWord[i].equalsIgnoreCase(splittedWord[splittedWord.length-i-1])){
                return false;
            }
        }
        return true;
    }
}
package week11.ex4;

public class WordChecker {

    public static void main(String[] args) {
        InsertACharacter insertACharacter = new InsertACharacter();
        RemoveACharacter removeACharacter = new RemoveACharacter();
        ReplaceACharacter replaceACharacter = new ReplaceACharacter();

        String word1 = "pale-";
        String word2 = "pale";

        boolean b = RemoveACharacter.oneEditAway2(word1, word2);

        System.out.println(b);


    }
}

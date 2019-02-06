package week11.ex4;

public class RemoveACharacter {

    public static boolean oneEditAway2(String word1, String word2) {
        /* Length checks. */
        if (Math.abs(word1.length() - word2.length()) > 1) {
            return false;
        }
        String s1;
        if (word1.length() < word2.length()) s1 = word1;
        else s1 = word2;
        String s2;
        if (word1.length() < word2.length()) s2 = word2;
        else s2 = word1;

        int enCounter1 = 0;
        int enCounter2 = 0;
        boolean foundDifference = false;
        while (enCounter2 < s2.length() && enCounter1 < s1.length()) {
            if (s1.charAt(enCounter1) != s2.charAt(enCounter2)) {
                /* Ensure that this is the word1 difference found.*/
                if (foundDifference) return false;
                foundDifference = true;
                if (s1.length() == s2.length()) { // On replace, move shorter pointer
                    enCounter1++;
                }
            } else {
                enCounter1++; // If matching, move shorter pointer
            }
            enCounter2++; // Always move pointer for longer string
        }
        return true;
    }
}
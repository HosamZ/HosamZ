package groupExer.week3Java;

import java.util.List;

public class KeyApplication {

    public static void main(String[] args) {

        String plaintext ="HELLO";
        Key key = new Key(1);

        List<String> letters= key.getLetters(plaintext);
        System.out.println(letters);
        letters= key.applyKey(letters);
        System.out.println(letters);
        String cipher = key.ciphertext(letters);
        System.out.println(cipher);





    }
}

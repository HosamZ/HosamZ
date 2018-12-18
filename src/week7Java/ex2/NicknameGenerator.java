package week7Java.ex2;

import java.util.Optional;

public class NicknameGenerator {

    public Optional<String> generate(String word){
        int size = word.length();
        if (word.length()==0){
            return Optional.empty();
        }
        if (word.length()==1){

            return Optional.of(word);
        }
        String newWord = word.substring(0,size/2);
        return Optional.of(newWord);
    }
}
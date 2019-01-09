package week8.firstDayEx;

public class ExclamationMarkSymbol implements Decryptor {

    @Override
    public String decrypt(String line) {
        return line.replaceAll("!", "");
    }

    @Override
    public boolean canDecrypt(String line) {
        return line.contains("!");
    }
}

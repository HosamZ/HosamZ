package week8;

public class AmpersandSymbol implements Decryptor {
    @Override
    public String decrypt(String line) {
        String s = line.replaceAll("&", "");
        String newLine = new StringBuilder(s).reverse().toString();
        return newLine;
    }

    @Override
    public boolean canDecrypt(String line) {
        return line.contains("&");
    }
}

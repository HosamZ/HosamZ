package week8;

public class HashSymbol implements Decryptor {


    @Override
    public String decrypt(String line) {
        String newLine = line.replaceAll("#", "");
        String robomime = newLine.replaceAll("robomime", "");
//        newLine= line.replaceAll("robomime","");
        return robomime;
    }

    @Override
    public boolean canDecrypt(String line) {
        return line.contains("#");
    }
}

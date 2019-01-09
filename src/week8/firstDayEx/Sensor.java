package week8.firstDayEx;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Sensor {

    private List<Decryptor> decryptors = Arrays.asList(
            new AmpersandSymbol(),
            new ExclamationMarkSymbol(),
            new HashSymbol());

    public Optional<String> decrypt(String line) {
        for (Decryptor decryptor : decryptors) {
            if (decryptor.canDecrypt(line)) {
                String decrypt = decryptor.decrypt(line);
                return Optional.of(decrypt);
            }
        }
        return Optional.empty();
    }
}
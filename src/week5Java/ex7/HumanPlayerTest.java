package week5Java.ex7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanPlayerTest {

    @Test
    void testNullEntry() {
      HumanPlayer humanPlayer = new HumanPlayer();
      Assertions.assertNotNull(humanPlayer.chooseMove().getName());
    }
}
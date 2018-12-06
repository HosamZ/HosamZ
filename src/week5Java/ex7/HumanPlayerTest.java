package week5Java.ex7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanPlayerTest {

    @Test
    void testNullEntry() {
      Rock rock = new Rock();
      Paper paper = new Paper();
      Scissors scissors = new Scissors();
      HumanPlayer humanPlayer = new HumanPlayer();
      Assertions.assertNotNull(humanPlayer.chooseMove().getName());
    }
}
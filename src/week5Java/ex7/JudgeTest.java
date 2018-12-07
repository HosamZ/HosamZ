package week5Java.ex7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JudgeTest {

    private final Judge judge = new Judge();

    @Test
    void testDescionComputerWin() {
        Rock rock = new Rock();
        Paper paper = new Paper();
        Assertions.assertEquals("Computer win!", judge.descion(rock,paper));

    }
    @Test
    void testDescionHumanWin(){
        Rock rock = new Rock();
        Paper paper = new Paper();
        Assertions.assertEquals("You win!",judge.descion(paper,rock));
    }
    @Test
    void testDraw(){
        Move move1 = new Paper();
        Move move2 = new Paper();
        Assertions.assertEquals("Draw",judge.descion(move1,move2));
    }

}
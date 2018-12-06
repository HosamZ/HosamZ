package week5Java.ex7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JudgeTest {

    @Test
    void testDescionComputerWin() {
        Judge judge = new Judge();
        Rock rock = new Rock();
        Paper paper = new Paper();
        Assertions.assertEquals("Computer win!",judge.descion(rock,paper));

    }
    @Test
    void testDescionHumanWin(){
        Judge judge = new Judge();
        Rock rock = new Rock();
        Paper paper = new Paper();
        Assertions.assertEquals("You win!",judge.descion(paper,rock));
    }
    @Test
    void testDraw(){
        Judge judge = new Judge();
        Rock rock = new Rock();
        Paper paper = new Paper();
        Assertions.assertEquals("Draw",judge.descion(paper,paper));
    }
    @Test
    void testNullValue(){
        Judge judge = new Judge();
        Rock rock = new Rock();
        Paper paper = new Paper();
        HumanPlayer humanPlayer = new HumanPlayer();
        Assertions.assertEquals("please enter a valid value?",humanPlayer.chooseMove());

    }
}
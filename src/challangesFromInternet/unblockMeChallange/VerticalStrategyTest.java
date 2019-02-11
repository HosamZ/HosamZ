package challangesFromInternet.unblockMeChallange;

import challangesFromInternet.cipherRailsChallange.Coordinate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class VerticalStrategyTest {
    private VerticalStrategy verticalStrategy = new VerticalStrategy();

    @Test
    void getCoordinates() {
        Block block = new Block(0, "v", 1, 4, 5);
        List<Coordinate> coordinates = verticalStrategy.getCoordinates(block);
//        for (Coordinate coordinate : coordinates.get()) {
//            System.out.println(coordinate.getColumn()+ " | "+ coordinate.getRow());
//        }
        Assertions.assertEquals(5, coordinates.size());
    }
}
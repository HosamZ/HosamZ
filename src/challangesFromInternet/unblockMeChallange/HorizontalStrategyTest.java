package challangesFromInternet.unblockMeChallange;

import challangesFromInternet.cipherRailsChallange.Coordinate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class HorizontalStrategyTest {
    private HorizontalStrategy horizontalStrategy = new HorizontalStrategy();

    @Test
    void getCoordinates() {
        Block block = new Block(0, "h", 1, 4, 5);
        List<Coordinate> coordinates = horizontalStrategy.getCoordinates(block);
//        for (Coordinate coordinate : coordinates) {
//            System.out.println(coordinate.getColumn()+ " | "+ coordinate.getRow());
//        }
        Assertions.assertEquals(5, coordinates.size());
    }
}
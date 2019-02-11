package challangesFromInternet.unblockMeChallange;

import challangesFromInternet.cipherRailsChallange.Coordinate;

import java.util.ArrayList;
import java.util.List;

public class VerticalStrategy implements DirectionStrategy {

    @Override
    public List<Coordinate> getCoordinates(Block block) {
        if (block.getDirection().equalsIgnoreCase("v")) {
            List<Coordinate> coordinates = new ArrayList<>();
            Integer column = block.getStartColumn();
            Integer row = block.getStartRow();
            coordinates.add(new Coordinate(column, row));

            for (int index = 1; index < block.getLength(); index++) {
                row++;
                coordinates.add(new Coordinate(column, row));
            }
            return coordinates;

        }
        return new ArrayList<>();
    }
}
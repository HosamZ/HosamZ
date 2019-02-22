package challangesFromInternet.unblockMeChallange;

import challangesFromInternet.cipherRailsChallange.Coordinate;

import java.util.List;

public interface DirectionStrategy {
    List<Coordinate> getCoordinates(Block block);
}

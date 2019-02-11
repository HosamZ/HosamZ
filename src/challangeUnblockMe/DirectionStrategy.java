package challangeUnblockMe;

import challanges.cipherRailsChallange.Coordinate;

import java.util.List;

public interface DirectionStrategy {
    List<Coordinate> getCoordinates(Block block);
}

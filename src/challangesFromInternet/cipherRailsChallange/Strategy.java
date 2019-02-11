package challangesFromInternet.cipherRailsChallange;

import java.util.Optional;

public interface Strategy {

    Optional<Coordinate> getNext(Coordinate last);

}
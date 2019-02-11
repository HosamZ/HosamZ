package challangesFromInternet.unblockMeChallange;

import challangesFromInternet.cipherRailsChallange.Coordinate;

import java.util.List;
import java.util.Queue;

import static java.util.stream.Collectors.toList;

public class CoordinateGetter {
//    private List<DirectionStrategy> strategies = new ArrayList<>();
        private List<DirectionStrategy> strategies = Strategies.asList();


    public List<Coordinate> getCoordinates(Queue<Block> blocks) {
        return blocks.stream()
                .map(this::toCoordinates)
                .flatMap(List::stream)
                .collect(toList());
    }

    private List<Coordinate> toCoordinates(Block block) {
        return strategies.stream()
                .map(e -> e.getCoordinates(block))
                .filter(e -> !e.isEmpty())
                .flatMap(List::stream)
                .collect(toList());

//        if (block.getDirection().equalsIgnoreCase("h")) {
//            return strategies.get(0).getCoordinates(block);
//        }
//        return strategies.get(1).getCoordinates(block);
    }

}

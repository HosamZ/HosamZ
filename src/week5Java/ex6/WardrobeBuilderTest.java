package week5Java.ex6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class WardrobeBuilderTest {

    @Test
    void testBuild() {
        WardrobeBuilder wardrobeBuilder = new WardrobeBuilder();
        Wardrobe wardrobe = wardrobeBuilder.build();
        List<String> parts = wardrobe.getParts();
        List<String> wardrobeParts = Arrays.asList("bottom", "side", "side", "back", "top", "shelf", "shelf", "shelf", "shelf", "shelf", "shelf", "shelf", "shelf", "door", "door");
        Assertions.assertEquals(wardrobeParts, parts);
    }

    @Test
    void testBuildMap() {
        WardrobeBuilder wardrobeBuilder = new WardrobeBuilder();
        List<String> wardrobeParts = Arrays.asList("bottom", "side", "side", "back", "top", "shelf", "shelf", "shelf", "shelf", "shelf", "shelf", "shelf", "shelf", "door", "door");
        Map<String, Integer> expectedMap = getMap(wardrobeParts);
        Wardrobe wardrobe = wardrobeBuilder.build();
        List<String> parts = wardrobe.getParts();
        Map<String, Integer> actualMap = getMap(parts);
        Assertions.assertEquals(expectedMap, actualMap);
    }

    public Map<String, Integer> getMap(List<String> wardrobeParts) {
        Map<String, Integer> parts = new HashMap<>();
        for (String wardrobePart : wardrobeParts) {
            if (!parts.containsKey(wardrobePart)) {
                parts.put(wardrobePart, new Integer(0));
            }
            Integer times = parts.get(wardrobePart);
            parts.put(wardrobePart, times + 1);

        }
        return parts;
    }
}
package evaluation.week5JAVA;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class TvTableBuilderTest {

    @Test
    void tvTableBuilderTest() {
        TvTableBuilder tvTableBuilder = new TvTableBuilder();
        TvTable tvTable = tvTableBuilder.build();
        List<String> parts = tvTable.getParts();
        List<String> tvTableParts = Arrays.asList("leg", "leg", "leg", "leg", "top", "shelf");
        Assertions.assertEquals(tvTableParts, parts);
    }
}
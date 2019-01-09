package week8.firstDayEx;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class ArchiveTest {

        private Archive archive = new Archive();
        private List<String> names = Arrays.asList("ahmad","ahmad","hosam","test");
    @Test
    void testDisplayer() {
        HashSet<String> strings = new HashSet<>(names);

        List<String> expected = Arrays.asList("test", "hosam","ahmad");
        Set<String> actual = archive.getUnique(names);

        Assertions.assertEquals(expected,actual);
    }
}
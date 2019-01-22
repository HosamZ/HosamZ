package week7Java.ex9.dictionaryPackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Checker {
    public static void main(String[] args) {
        BookReader bookReader = new BookReader();
        BooksChecker booksChecker = new BooksChecker();
        getWordsSourceBook(bookReader);
//        System.out.println("///////////////////////");
        getWordsFromAliceBook(bookReader);

//        Set<String> getwordsfromAlice = new HashSet<>(getWordsFromAliceBook(bookReader));
//        Set<String> getwordsfromSource = new HashSet<>(getWordsSourceBook(bookReader));
//        System.out.println(getwordsfromAlice==getwordsfromSource);



//        compareBooks(getWordsSourceBook(bookReader),getWordsFromAliceBook(bookReader));
//        Stream<String> compareBooks =
    }


    private static List<String> getWordsFromAliceBook(BookReader bookReader) {
        Stream<String> bookAliceAdventures = bookReader.read("week7Java/ex9/book/alice's-adventures-in-wonderland.txt");
        List<String> aliceBook = bookAliceAdventures
                .map(String::toLowerCase)
                .map(e -> e.split(" ; "))
                .flatMap(e -> Stream.of(e))
                .collect(Collectors.toList());
        return aliceBook;
//        System.out.println(aliceBook);
    }

    private static List<String> getWordsSourceBook(BookReader bookReader) {
        List<String> collect = bookReader.read("week7Java/ex9/word/words.txt")
                .map(String::toLowerCase)
                .flatMap(Stream::of)
                .collect(Collectors.toList());
        return collect;
//        System.out.println(collect);
    }


}

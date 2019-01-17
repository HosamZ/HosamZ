package week9.ex5;

import week4Java.ex9.FileReader;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilmReader {
    private FileReader reader = new FileReader();

    public List<Film> getFilm() {
        return getFilmsAsStream()
                .skip(1)
                .map(line -> line.split(";"))
                .map(this::getFilmStats)//.map(line -> getFilmStats(line))
//                .peek(e -> System.out.println("movie: " + e.getTitle() + " runtime: " + e.getRunTime()))
                .collect(Collectors.toList());
    }

    public Film getFilmStats(String[] line) {
        return new Film(line[8], Double.valueOf(line[9])
                , Long.valueOf(line[10]), Integer.valueOf(line[6])
                , Long.valueOf(line[0]), Long.valueOf(line[5]));
    }

    public Stream<String> getFilmsAsStream() {
        return reader.asStream("week9/ex5/films.csv");
    }
}
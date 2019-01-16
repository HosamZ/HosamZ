package week9.ex5;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilmSummarizer {

    public static final int REVENUE_NUMBER = 880674609;

    public static void main(String[] args) {
        List<Film> film = new FilmReader().getFilm();
        displayFilmsStatistics(film);
    }

    public static void displayFilmsStatistics(List<Film> film) {
        getTop3HighestRankingFilms(film);
        top3RateLongerThan3Hours(film);
        top4ExpensiveMovies(film);
        top4mostExpensiveShorterThan90mins(film);
        top4Over7AndBudgetLimited(film);
        top2FilmsOver60Mins(film);
        top3RevenueOver880000(film);
    }

    public static void top3RevenueOver880000(List<Film> film) {
        List<String> randomRevenueBasedFilm = film.stream()
                .filter(line -> line.getRevenue() > REVENUE_NUMBER)
                .sorted(Comparator.comparing(Film::getScore))
                .limit(3)
                .map(Film::getTitle)
                .collect(Collectors.toList());
        System.out.println("top3 880674609 REVENUE movies : ");
        System.out.println(randomRevenueBasedFilm);
    }

    public static void top2FilmsOver60Mins(List<Film> film) {
        List<String> top2FilmsOver60Mins = film.stream()
                .filter(line -> line.getVoteCount() > 1000)
//                .filter(line -> line.getScore() < 3000)
                .filter(line -> line.getRunTime() > 70)
                .sorted(Comparator.comparing(Film::getScore).reversed())
                .limit(2)
                .map(Film::getTitle)
                .collect(Collectors.toList());
        System.out.println("top 2 Films over 60 mins : ");
        System.out.println(top2FilmsOver60Mins);
    }

    public static void top4Over7AndBudgetLimited(List<Film> film) {
        List<String> top4Over7AndBudgetLimited = film.stream()
                .filter(line -> line.getScore() > 7)
                .filter(line -> line.getBudget() > 50000 && line.getBudget() < 500000)
                .sorted(Comparator.comparing(Film::getBudget).reversed())
                .limit(4)
                .map(Film::getTitle)
                .collect(Collectors.toList());
        System.out.println("Top 4 most rated over 7 and budget between 50.000 and 500.000, sorted by budget: ");
        System.out.println(top4Over7AndBudgetLimited);
    }

    public static void top4mostExpensiveShorterThan90mins(List<Film> film) {
        List<String> top4ExpensiveShorterThan90Movies = film.stream()
                .filter(film3 -> film3.getRunTime() < 90)
                .sorted(Comparator.comparing(Film::getBudget).reversed())
                .limit(4)
//                .peek(e -> System.out.println("movie: " + e.getTitle() + " runtime: " + e.getRunTime()))
                .map(Film::getTitle)
                .collect(Collectors.toList());
        System.out.println("Top 4 most expensive shorter than 90 minutes, sorted by budget: ");
        System.out.println(top4ExpensiveShorterThan90Movies);
    }


    public static void top4ExpensiveMovies(List<Film> film) {
        List<String> topBudgetMovies = film.stream()
                .sorted(Comparator.comparing(Film::getBudget).reversed())
                .limit(4)
                .map(Film::getTitle)
                .collect(Collectors.toList());
        System.out.println("Top 4 most expensive, sorted by budget: ");
        System.out.println(topBudgetMovies);
    }

    public static void top3RateLongerThan3Hours(List<Film> film) {
        List<String> collect = film.stream()
                .filter(film1 -> film1.getRunTime() > 180)
                .sorted(Comparator.comparing(Film::getScore).reversed())
                .limit(3)
                .map(Film::getTitle)
                .collect(Collectors.toList());
        System.out.println("Top 3 with highest rating longer than 3 hours, sorted by rating: ");
        System.out.println(collect);
    }

    public static void getTop3HighestRankingFilms(List<Film> film) {
        List<String> top3Ratings = film.stream()
                .sorted(Comparator.comparing(Film::getScore).reversed())
                .limit(3)
                .map(Film::getTitle)
                .collect(Collectors.toList());
        System.out.println("Top 3 with highest rating, sorted by rating: ");
//                .forEach(line-> System.out.println(line.getTitle()));
        System.out.println(top3Ratings);
    }
}

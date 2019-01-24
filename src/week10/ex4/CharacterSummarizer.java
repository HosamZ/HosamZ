package week10.ex4;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CharacterSummarizer {
    public static void main(String[] args) {
        List<Character> getCharacterFileAsStream = new CharcatersReader().getCharacter();
        getGameOfThronesStatistics(getCharacterFileAsStream);
    }

    private static void getGameOfThronesStatistics(List<Character> getCharacterFileAsStream) {
        getAllCharNumberInBooks(getCharacterFileAsStream);
        getAllDeadCharacters(getCharacterFileAsStream);
        getDeadMenCharacterNumber(getCharacterFileAsStream);
        getDeadWomenCharacterNumber(getCharacterFileAsStream);
        getBiggestDeathBook(getCharacterFileAsStream);
        getAllDeadCharacterInBook3(getCharacterFileAsStream);
        getTwoAllegiancesBiggestDeadCount(getCharacterFileAsStream);
        getNobilityCharactersPercentageDeaths(getCharacterFileAsStream);
        getBookDeathAmountInLannister(getCharacterFileAsStream);
        getBookDeathAmountInStark(getCharacterFileAsStream);
        getStarksDeathsCount(getCharacterFileAsStream);
        getLannisterDeadCharacters(getCharacterFileAsStream);
        isAnyCharacterDidNotDie(getCharacterFileAsStream);
        hasAnyCharaterDiedInSameChapter(getCharacterFileAsStream);
    }

    private static void hasAnyCharaterDiedInSameChapter(List<Character> getCharacterFileAsStream) {
        boolean isCharacterDiedInSameChapter = getCharacterFileAsStream.stream()
                .anyMatch(e -> e.getDeathChapter() == e.getBookOfDeath());
        System.out.println("is there any Character died in same Chapter? "+isCharacterDiedInSameChapter);
    }

    private static void isAnyCharacterDidNotDie(List<Character> getCharacterFileAsStream) {
        boolean anyCharacterDidNotDie = getCharacterFileAsStream.stream()
                .anyMatch(e -> e.getBookOfDeath().isEmpty());
        System.out.println("is there any Character did not die ? " + anyCharacterDidNotDie);
    }

    private static void getLannisterDeadCharacters(List<Character> getCharacterFileAsStream) {
        long getLannisterDeathsCount = getCharacterFileAsStream.stream()
                .filter(e -> !e.getBookOfDeath().isEmpty())
                .filter(e -> e.getAllegiances().equalsIgnoreCase("Lannister"))
                .count();
        System.out.println("Lannister`s dead Characters: " + getLannisterDeathsCount);
    }

    private static void getStarksDeathsCount(List<Character> getCharacterFileAsStream) {
        long getStarksDeathsCount = getCharacterFileAsStream.stream()
                .filter(e -> !e.getBookOfDeath().isEmpty())
                .filter(e -> e.getAllegiances().equalsIgnoreCase("Stark"))
                .count();
        System.out.println("Stark`s dead Characters: " + getStarksDeathsCount);
    }

    private static void getBookDeathAmountInStark(List<Character> getCharacterFileAsStream) {
        System.out.println("book die the most amount of characters from the Lannister allegiance: ");
        getCharacterFileAsStream.stream()
                .filter(e -> !e.getBookOfDeath().isEmpty())
                .filter(e -> e.getAllegiances().equalsIgnoreCase("Lannister"))
                .collect(Collectors.groupingBy(Character::getBookOfDeath, Collectors.counting()))
                .entrySet().stream()
                .filter(e -> !e.getKey().isEmpty())
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> "Book: " + e.getKey() + " | " + "Dead Characters: " + e.getValue())
                .findFirst().ifPresent(System.out::println);
    }

    private static void getBookDeathAmountInLannister(List<Character> getCharacterFileAsStream) {
        System.out.println("book die the most amount of characters from the Stark allegiance: ");
        getCharacterFileAsStream.stream()
                .filter(e -> !e.getBookOfDeath().isEmpty())
                .filter(e -> e.getAllegiances().equalsIgnoreCase("Stark"))
                .collect(Collectors.groupingBy(Character::getBookOfDeath, Collectors.counting()))
                .entrySet().stream()
                .filter(e -> !e.getKey().isEmpty())
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> "Book: " + e.getKey() + " | " + "Dead Characters: " + e.getValue())
                .findFirst().ifPresent(System.out::println);
    }

    private static void getNobilityCharactersPercentageDeaths(List<Character> getCharacterFileAsStream) {
        long collect = getCharacterFileAsStream.stream()
                .filter(e -> !e.getBookOfDeath().isEmpty())
                .filter(e -> e.getNobility().toString().equals("1"))
                .count() * 100 / getCharacterFileAsStream.stream()
                .filter(e -> !e.getBookOfDeath().isEmpty())
                .map(Character::getBookOfDeath)
                .count();
        System.out.println("percentage of deaths belong to nobility characters: " + collect + "%");
    }

    private static void getTwoAllegiancesBiggestDeadCount(List<Character> getCharacterFileAsStream) {
        List<String> collect = getCharacterFileAsStream.stream()
                .collect(Collectors.groupingBy(Character::getAllegiances, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(Map.Entry::getKey)
                .limit(2)
                .collect(Collectors.toList());
        System.out.println("\nTwo allegiances that have the biggest dead count: " + collect);
    }

    private static void getAllDeadCharacterInBook3(List<Character> getCharacterFileAsStream) {
        List<String> getDeadCharactersFromBook3 = getCharacterFileAsStream.stream()
                .collect(Collectors.groupingBy(Character::getName, Collectors.counting()))
                .entrySet().stream()
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(getDeadCharactersFromBook3);
    }

    private static void getBiggestDeathBook(List<Character> getCharacterFileAsStream) {
        Map<String, Long> collect = getCharacterFileAsStream.stream()
                .collect(Collectors.groupingBy(Character::getBookOfDeath, Collectors.counting()));
        collect.entrySet().stream()
                .filter(e -> !e.getKey().isEmpty())
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> "\nBook: " + e.getKey() + " | " + e.getValue() + " dead character." + "\nDead Characters: ")
                .findFirst().ifPresent(System.out::println);

    }

    private static void getDeadMenCharacterNumber(List<Character> getCharacterFileAsStream) {
        long count = getCharacterFileAsStream.stream()
                .filter(e -> !e.getBookOfDeath().isEmpty())
                .filter(e -> e.getGender().toString().contains("1"))
                .count();
        System.out.println("number of Dead Men: " + count + " | " + getAllDeadCharacterDeaths(getCharacterFileAsStream, count) + "%"
        );
    }

    private static void getDeadWomenCharacterNumber(List<Character> getCharacterFileAsStream) {
        long count = getCharacterFileAsStream.stream()
                .filter(e -> !e.getBookOfDeath().isEmpty())
                .filter(e -> e.getGender().toString().contains("0"))
                .count();
        System.out.println("number of Dead Women: " + count + " | " + getAllDeadCharacterDeaths(getCharacterFileAsStream, count) + "%"
        );
    }

    private static long getAllDeadCharacterDeaths(List<Character> getCharacterFileAsStream, long count) {
        return count * 100 / getCharacterFileAsStream.stream()
                .filter(e -> !e.getBookOfDeath().isEmpty())
                .map(Character::getBookOfDeath)
                .count();
    }

    private static void getAllDeadCharacters(List<Character> getCharacterFileAsStream) {
        long collect = getCharacterFileAsStream.stream()
                .filter(e -> !e.getBookOfDeath().isEmpty())
                .map(Character::getBookOfDeath)
                .count();
        System.out.println("Number of dead characters: " + collect);
    }

    private static void getAllCharNumberInBooks(List<Character> getCharacterFileAsStream) {
        long charactersCount = getCharacterFileAsStream.stream()
                .map(Character::getBookOfDeath)
                .count();
        System.out.println("Number of characters: " + charactersCount);
    }
}
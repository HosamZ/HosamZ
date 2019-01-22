package week10.ex1;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PokemonSummarizer {
    public static void main(String[] args) {
        List<Pokemon> pokemon = new PokemonReader().getPokemon();
        pokemonTotalNumber(pokemon);
        groupPokemonByType1(pokemon);
        sortByPokemonNameLength(pokemon);
        getNumberOfFlyingPokemon(pokemon);
    }

    private static void sortByPokemonNameLength(List<Pokemon> pokemons) {
        Map<Integer, List<Pokemon>> pokemonNamesLength = pokemons.stream()
                .collect(Collectors.groupingBy(e -> e.getName().length(), Collectors.toList()));
        System.out.println("//////////////");
        pokemonNamesLength.entrySet().stream()
                .sorted(Comparator.comparing(integerListEntry -> integerListEntry.getKey()))
                .map(e -> e.getKey() + " | " + getPokemonNames(e.getValue()))
                .forEach(s -> System.out.println("number of letters in Pokemon name: " + s));
    }

    private static void groupPokemonByType1(List<Pokemon> pokemon) {
        pokemon.stream()
                .collect(Collectors.groupingBy(Pokemon::getType1, Collectors.toList()))
                .entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry::getKey))
                .forEach(e -> System.out.println("type1 of Pokemon: " + e.getKey() + " | " + getPokemonNames(e.getValue())));
    }

    private static String getPokemonNames(List<Pokemon> pokemons) {
        return pokemons.stream()
                .map(Pokemon::getName)
                .collect(Collectors.joining(", "));
    }

    private static void pokemonTotalNumber(List<Pokemon> pokemonReader) {
        long pokemonNumber = pokemonReader.stream()
                .map(pokemon -> pokemon.getName())
                .count();
        System.out.println("total pokemon`s number: " + pokemonNumber);
    }

    private static void getNumberOfFlyingPokemon(List<Pokemon> pokemon) {
        pokemon.stream()
                .flatMap(t -> Stream.of(t))
                .collect(Collectors.groupingBy(pokemon1 -> pokemon1.getType2(), Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getKey().equals("Flying"))
                .forEach(e -> System.out.println("number of flying Pokemons " + e.getValue() + " times."));
    }
}
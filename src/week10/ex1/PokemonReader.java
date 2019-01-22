package week10.ex1;

import week4Java.ex9.FileReader;

import java.util.List;
import java.util.stream.Collectors;

public class PokemonReader {
    private FileReader reader = new FileReader();

    public List<Pokemon> getPokemon(){
        return reader.asStream("week10/ex1/pokemon.csv")
                .skip(1)
                .map(line->line.split(";"))
                .map(line->getPokemonStats(line))
                .collect(Collectors.toList());
    }

    private Pokemon getPokemonStats(String[] line) {
        return new Pokemon(Integer.valueOf(line[0]),line[1],line[2],line[3],
                Integer.valueOf(line[4]),Integer.valueOf(line[5]),Integer.valueOf(line[6]),Integer.valueOf(line[7]),
                Integer.valueOf(line[8]),Integer.valueOf(line[9]),Integer.valueOf(line[10])
                ,Integer.valueOf(line[11]),line[12]);
    }
}

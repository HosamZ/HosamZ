package week2;

import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {
        System.out.println("Give me your protein grams");

        Scanner scanner = new Scanner(System.in);


        Integer proteinGrams = scanner.nextInt();

        System.out.println("what`Bank your weight in KG please !?");


        Integer weightInKilograms = scanner.nextInt();

        Integer amountOFProteinGramsPerDay = proteinGrams * weightInKilograms;

        System.out.println("your amount is : "+amountOFProteinGramsPerDay);


    }
}

package week3JAVA.ex3;

public class NumberCorrector {

    public Double correct(Double number){

        number = Math.abs(number);
        number= Math.floor(number);

        return number;
    }
}

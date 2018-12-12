package week6JAVA.ex5;

import java.util.List;

public abstract class CreditCard {
    private List<Integer> length;
    private List<Integer> specialNumber;

    public CreditCard(List<Integer> length, List<Integer> specialNumber) {
        this.length = length;
        this.specialNumber = specialNumber;
    }

    public List<Integer> getLength() {
        return length;
    }

    public List<Integer> getSpecialNumber() {
        return specialNumber;
    }
    public abstract String getName();

    public Boolean checkIsValue(Integer length, Integer specialNumber) {
            return getLength().contains(length)&&getSpecialNumber().contains(specialNumber);
    }
}

package week6JAVA.ex4;

public abstract class Money {
    private Integer amount;

    public Integer getAmount() {
        return amount;
    }

    public Money(Integer amount) {
        this.amount = amount;
    }

    public  Boolean isApplicable(Integer cent){
        return cent>=amount;
    }

}

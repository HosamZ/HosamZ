package evaluation.week7Reflection;

import java.util.Objects;

public class Bank {
    private Integer salary;
    private String bankAcc;


    public Bank(Integer salary, String bankAcc) {
        this.salary = salary;
        this.bankAcc = bankAcc;
    }

    @Override
    public String toString() {
        return "Transfer successful: " + salary +" Euro "+ " to account " + bankAcc;
    }

    public Integer getSalary() {
        return salary;
    }

    public String getBankAcc() {
        return bankAcc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bank)) return false;
        Bank bank = (Bank) o;
        return Objects.equals(getSalary(), bank.getSalary()) &&
                Objects.equals(getBankAcc(), bank.getBankAcc());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSalary(), getBankAcc());
    }
}

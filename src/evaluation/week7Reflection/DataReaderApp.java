package evaluation.week7Reflection;

import week4Java.ex9.FileReader;

import java.util.*;

import static evaluation.week7Reflection.BankRecords.bankRecords;
import static evaluation.week7Reflection.BankRecords.totalSalariesPaid;

public class DataReaderApp {
    public static void main(String[] args) {
        FileReader reader = new FileReader();
        List<String> lines = reader.asLines("evaluation/week7Reflection/employees.csv");
        lines.remove(0);
        List<Bank> bankList = bankRecords(lines);
        Collections.sort(bankList, Comparator.comparing(Bank::getSalary));
        for (Bank bank : bankList) {
            System.out.println(bank);
        }
//        totalSalariesPaid();
    }
}
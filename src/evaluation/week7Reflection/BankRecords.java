package evaluation.week7Reflection;

import week4Java.ex9.FileReader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BankRecords {
    private static FileReader reader = new FileReader();



    public static List<Bank> bankRecords(List<String> lines) {
        List<Bank> bankList = new ArrayList<>();
        for (String line : lines) {
            Bank bankRecord = employeeDataPayments(line);
            bankList.add(bankRecord);
        }
        return bankList;
    }

    private static Bank employeeDataPayments(String line) {
        String[] split = line.split(";");
        List<String> columns = Arrays.asList(split);
        Integer employeeMoneyAmount = Integer.valueOf(columns.get(2));
        String employeeBankAcc = String.valueOf(columns.get(3));
        return new Bank(employeeMoneyAmount, employeeBankAcc);
    }
    public static void totalSalariesPaid() {
        List<String> lines = reader.asLines("evaluation/week7Reflection/employees.csv");
        List<Bank> totalMoneyPaid = new ArrayList<>();
        Integer totalAmountOfMoney = Integer.valueOf(lines.get(2));
//        for (Bank line : lines) {
//            if (line.getSalary())
//        }
            System.out.println(totalMoneyPaid);
        }
        public static void mostPayingDepartment(){
            List<String> lines = reader.asLines("evaluation/week7Reflection/employees.csv");

        }
}
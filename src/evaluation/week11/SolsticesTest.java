package evaluation.week11;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class SolsticesTest {

    @Test
    void getSummerSolsticeCountdown() {

        LocalDate date = LocalDate.parse("2019-05-12");
//        LocalDate dat1e = LocalDate.of(LocalDate.parse());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getMonthValue());
        System.out.println(date.getDayOfYear());
        System.out.println(date.getEra());
        System.out.println();
    }

    @Test
    void getWinterSolsticeCountDown() {


    }
}
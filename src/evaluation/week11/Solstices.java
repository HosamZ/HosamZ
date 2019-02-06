//package evaluation.week11;
//
//import java.time.LocalDate;
//import java.time.temporal.ChronoUnit;
//
//public class Solstices {
//
//
//    public LocalDate getSummerSolsticeCountdown(LocalDate currentDate) {
//        LocalDate summerSolstice = LocalDate.parse("2019-06-21");
//        if (currentDate.isBefore(summerSolstice)&&currentDate.isLeapYear()) {
//            return summerSolstice.minusDays(1);
//        } else {
//            return summerSolstice;
//        }
//        summerSolstice.getDayOfMonth();
//        summerSolstice.getDayOfYear();
//        long between = ChronoUnit.DAYS.between(currentDate, summerSolstice);
////        Output:
////        System.out.println("The Summer Solstice "+2019+" is on "+FRIDAY+","+JUNE 21+","+2019 +"("+"in"+144+"days";
//    }
//    public LocalDate getWinterSolsticeCountDown(LocalDate currentDate) {
//        LocalDate winterSolstice = LocalDate.parse("2019-12-22");
//        if (currentDate.isBefore(winterSolstice)&&currentDate.isLeapYear()) {
//            return winterSolstice.minusDays(1);
//        } else {
//            return winterSolstice;
//        }
//    }
//}
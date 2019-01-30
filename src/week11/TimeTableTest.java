package week11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.*;
import java.time.temporal.ChronoUnit;

import static org.junit.jupiter.api.Assertions.*;


class TimeTableTest {
    private static final int END_OF_ADVERTISEMENT = 29;
    private static final int FIFTEEN_SECONDS_LATER = 15;
    private static final double EXPECTED_PAYMENT = 25979.1;
    private static final int FANS_NUMBER = 173;
    private static final int TIME_FOR_EACH_FAN = 12;
    private LocalDate date = LocalDate.parse("2003-03-13");
    private LocalTime timeNow = LocalTime.parse("10:00:00");

    @Test
    void testWhatDayOfWeekAndTime() {
        DayOfWeek dayOfWeek = date.getDayOfWeek();

        LocalTime expectedTime = LocalTime.parse("10:00");
        DayOfWeek expectedDay = DayOfWeek.THURSDAY;

        assertEquals(expectedDay, dayOfWeek);
        assertEquals(expectedTime, timeNow);
    }

    @Test
    void testTimeTable() {
        LocalTime gettingReadyTime = timeNow.plusMinutes(37).plusSeconds(21);
        LocalTime expected = LocalTime.parse("10:37:21");
        //It takes him 37 minutes and 21 seconds to get ready
        assertEquals(expected, gettingReadyTime);
        //At what time do they arrive at the airport?
        LocalTime timeToBeInAirport = gettingReadyTime.plusHours(1).plusMinutes(30);
        LocalTime expectedArrival = expected.plusHours(1).plusMinutes(30);

        assertEquals(expectedArrival, timeToBeInAirport);

        //Mugatu checks the departureTimeFromLondon time of his flight and it says 11:04 am. Is this time before the current one?
        LocalTime flightDeparture = LocalTime.parse("11:04:00");

        assertFalse(timeToBeInAirport.isBefore(flightDeparture));

        //Did he miss his flight?
        LocalTime nextFlightTime = LocalTime.parse("18:45:00");

        Duration duration = Duration.between(timeToBeInAirport, nextFlightTime);
        Duration expected3 = Duration.parse("PT6H37M39S");
        //        System.out.println(duration);
        assertEquals(expected3, duration);

        LocalDateTime departureTimeFromLondon = LocalDateTime.of(date, nextFlightTime);
        LocalDateTime timeOfLandingInTokyo = departureTimeFromLondon.plusHours(11).plusMinutes(50);

        LocalDateTime exectedTime = LocalDateTime.parse("2003-03-14T06:35");
        assertEquals(exectedTime, timeOfLandingInTokyo);

        ZoneId london = ZoneId.of("Europe/London");
        ZonedDateTime arrivalLondonTime = timeOfLandingInTokyo.atZone(london);
        LocalDateTime timeInLondon = arrivalLondonTime.toLocalDateTime();
        System.out.println(timeInLondon);
        LocalDateTime expectedTimeInLondon = LocalDateTime.parse("2003-03-14T06:35");
        assertEquals(expectedTimeInLondon, timeInLondon);

        ZoneId tokyo = ZoneId.of("Asia/Tokyo");
        System.out.println("departureTimeFromLondon " + departureTimeFromLondon);
        ZonedDateTime arrivalTokyoTime = arrivalLondonTime.withZoneSameInstant(tokyo);
        //        System.out.println("Time in London "+timeInLondon);

        ZonedDateTime expectedTimeInTokyo = ZonedDateTime.parse("2003-03-14T15:35+09:00[Asia/Tokyo]");
        assertEquals(expectedTimeInTokyo, arrivalTokyoTime);
        System.out.println("Time when Arrived to Tokyo " + arrivalTokyoTime);
        LocalDateTime timeInTokyo = arrivalTokyoTime.plusHours(11).toLocalDateTime();
        System.out.println("Time in Tokyo before boss waking him up: " + timeInTokyo);
        LocalTime expectedWakingUpTime = LocalTime.parse("02:35");

        assertEquals(expectedWakingUpTime, timeInTokyo.toLocalTime());

        LocalDateTime advertisementTime = timeInTokyo.plusMinutes(47);
        System.out.println("Advertisement Time: " + advertisementTime);
        LocalDateTime expectedA = LocalDateTime.parse("2003-03-15T03:22");

        assertEquals(expectedA, advertisementTime);

        LocalDateTime timeNeededToBeReady = advertisementTime.minusSeconds(546);
        Duration duration1 = Duration.between(advertisementTime, timeNeededToBeReady);

        System.out.println(duration1);
        Duration expectedFinishingTime = Duration.parse("PT-9M-6S");
        assertEquals(expectedFinishingTime, duration1);
//        System.out.println(advertisementTime.getMinute()-minute+" minutes");
        System.out.println(timeNeededToBeReady.getSecond() - advertisementTime.getSecond() + " seconds");

        LocalDateTime afterShootingTime = advertisementTime.plusHours(7);
        System.out.println("after shooting Time: " + afterShootingTime);
        LocalDateTime launchTime = LocalDateTime.parse("2003-03-15T13:00");
        LocalDateTime dinnerTime = LocalDateTime.parse("2003-03-15T20:00");

//        long untilLaunch = afterShootingTime.until(launchTime, ChronoUnit.MINUTES);
        long untilLunch = ChronoUnit.MINUTES.between(afterShootingTime, launchTime);
//        System.out.println(untilLunch+" minutes.");
        long expectedLunchTime = 158L;
        long untilDinner = ChronoUnit.MINUTES.between(afterShootingTime, dinnerTime);
//        System.out.println(untildinner+" minutes.");
        long expectedDinnerTime = 578L;

        assertEquals(expectedLunchTime, untilLunch);
        assertEquals(expectedDinnerTime, untilDinner);

        //What time is it in Tokyo? What date is it in London?
        LocalDateTime after3DaysAnd12H = afterShootingTime.plusDays(3).plusHours(12);
        LocalDateTime timeOfLandingInLondon = after3DaysAnd12H.plusHours(11).plusMinutes(50);
        ZoneId tokyo1 = ZoneId.of("Asia/Tokyo");
        ZonedDateTime timeInTokyoZoneFromLondon = timeOfLandingInLondon.atZone(tokyo1);
        System.out.println("Time in London: " + timeOfLandingInLondon);
        System.out.println("Time in Tokyo from London: " + timeInTokyoZoneFromLondon);
        LocalDateTime expectedTimeInLondonNow = LocalDateTime.parse("2003-03-19T10:12");
        ZonedDateTime expectedTimeInTokyoNow = ZonedDateTime.parse("2003-03-19T10:12+09:00[Asia/Tokyo]");

        assertEquals(expectedTimeInLondonNow, timeOfLandingInLondon);
        assertEquals(expectedTimeInTokyoNow, timeInTokyoZoneFromLondon);

        //How many hours and minutes did he spend dispatching his fans?

        LocalDateTime timeWithFans = timeOfLandingInLondon.plusSeconds(FANS_NUMBER * TIME_FOR_EACH_FAN);
        Duration timeSpendedWithFans = Duration.between(timeOfLandingInLondon, timeWithFans);
        System.out.println("Time with fans in Duration Forum : " + timeSpendedWithFans);
        System.out.println(timeSpendedWithFans.toHours() + " hours." + timeSpendedWithFans.toMinutes() + " minutes.");
        Duration expectedTimeSpendedWithFans = Duration.parse("PT34M36S");

        assertEquals(expectedTimeSpendedWithFans, timeSpendedWithFans);

        //Can he at least manage to stay in the sauna for half an hour?
        LocalDateTime arrivedInHotel = timeWithFans.plusHours(1);
        System.out.println("Time he arrived to Hotel: " + arrivedInHotel);
        LocalDateTime saunaEndTime = LocalDateTime.parse("2003-03-19T14:00:00");
        Duration timeHeCanBeInSauna = Duration.between(arrivedInHotel, saunaEndTime);
        boolean canHeStay30MinutesInSauna = !timeHeCanBeInSauna.minusMinutes(30).isNegative();
//        System.out.println(timeHeCanBeInSauna.toMinutes()+" minutes");
        System.out.println("can he be 30 minutes inside sauna ? " + canHeStay30MinutesInSauna);

        assertTrue(canHeStay30MinutesInSauna);

        //Can Mugatu be lucky enough to get one massage?
        LocalDateTime timeAfterFinisingSauna = arrivedInHotel.plusMinutes(30);
        LocalDate timeAfterSauna = timeAfterFinisingSauna.toLocalDate();
        boolean isLeapYear = timeAfterSauna.isLeapYear();
//        System.out.println("is it leap year ? "+isLeapYear);
        boolean canHaveSpecialMassage = canHaveSpecialMassage(timeAfterSauna);
        assertFalse(canHaveSpecialMassage);

        //When does Mugatu have to turn on the TV in London to be able to see it?

        LocalDateTime oneWeekLater = arrivedInHotel.plusWeeks(1);
        System.out.println(oneWeekLater);
        LocalDateTime broadcastTime = LocalDateTime.parse("2003-03-26T18:30:00");
        Duration tillTheBroadcastTime = Duration.between(oneWeekLater, broadcastTime);
        System.out.println(tillTheBroadcastTime);
        ZonedDateTime tokyoBroadcastTime = broadcastTime.atZone(tokyo);
        System.out.println("brodcast in Tokyo Time: " + tokyoBroadcastTime);
        ZonedDateTime londonBroadcastTime = tokyoBroadcastTime.withZoneSameInstant(london);
        System.out.println("he must turn on TV at: " + londonBroadcastTime);
        ZonedDateTime expectedBroadCastTime = ZonedDateTime.parse("2003-03-26T09:30Z[Europe/London]");

        Assertions.assertEquals(expectedBroadCastTime, londonBroadcastTime);

        //At what time exactly does this happen? What day of the week is this?
        ZonedDateTime timeAndDateOfManagerCall = londonBroadcastTime.plusSeconds(END_OF_ADVERTISEMENT)
                .plusSeconds(FIFTEEN_SECONDS_LATER);
        LocalTime timeOfManagerCall = timeAndDateOfManagerCall.toLocalTime();
//        System.out.println("manager called him at: "+timeOfManagerCall);
        DayOfWeek dayOfWeekManagerCalled = timeAndDateOfManagerCall.getDayOfWeek();
        System.out.println("manager called him at this Day: " + dayOfWeekManagerCalled);
        LocalTime expectedTimeOfManagerCall = LocalTime.parse("09:30:44");
        DayOfWeek expectedDayOfWeekManagerCalled = DayOfWeek.WEDNESDAY;

        Assertions.assertEquals(expectedTimeOfManagerCall, timeOfManagerCall);
        Assertions.assertEquals(expectedDayOfWeekManagerCalled, dayOfWeekManagerCalled);

        //How many days have passed by since he woke up at the beginning of the timetable?
        LocalDate dateOfManagerCall = timeAndDateOfManagerCall.toLocalDate();
        System.out.println(dateOfManagerCall);
        Period timeBetweenFirstAndLastDay = Period.between(date, dateOfManagerCall);
        System.out.println(timeBetweenFirstAndLastDay.getDays() + " Days.");
        Period expectedDaysBetweenFirstAndLastDay = Period.ofDays(13); // PT4D;

        Assertions.assertEquals(expectedDaysBetweenFirstAndLastDay, timeBetweenFirstAndLastDay);

        //How much is he paid for this reportage?
        LocalDateTime localDateTimeOfManagerCall = timeAndDateOfManagerCall.toLocalDateTime();
        LocalDateTime dateAndTimeOfTheFirstDay = LocalDateTime.of(date, timeNow);

        Duration durationBetweenFirstAndLastDay = Duration.between(dateAndTimeOfTheFirstDay, localDateTimeOfManagerCall);
        long daysInBetween = durationBetweenFirstAndLastDay.toDays();
        System.out.println("total days he spend : " + daysInBetween);
        long totalMinutesCount = durationBetweenFirstAndLastDay.toMinutes();
        System.out.println("he must get " + totalMinutesCount * 1.39 + " Euros.");

        Assertions.assertEquals(EXPECTED_PAYMENT, totalMinutesCount * 1.39);

    }

    private boolean canHaveSpecialMassage(LocalDate afterSauna) {
        DayOfWeek today = afterSauna.getDayOfWeek();
        return today.equals(DayOfWeek.THURSDAY) ||
                today.equals(DayOfWeek.SUNDAY) ||
                (afterSauna.isLeapYear() && today.equals(DayOfWeek.SATURDAY));
    }
}
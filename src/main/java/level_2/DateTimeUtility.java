package level_2;

import java.time.*;

public class DateTimeUtility {

    public static void showCurrentTimes() {
        showCurrentLocalDate();
        showCurrentLocalTime();
        showCurrentLocalDateTime();
    }

    public static void showDiffBetweenDates(LocalDate startDate, LocalDate endDate) {
        Period period = Period.between(startDate, endDate);
        System.out.println("Difference between " + startDate + " and " + endDate + " in " + period + " (Period format)");
    }

    public static void showDiffBetweenDatesTime(LocalDateTime startDateTime, LocalDateTime endDateTime) {
        Duration duration = Duration.between(startDateTime, endDateTime);
        System.out.println("Difference between " + startDateTime + " and " + endDateTime + " in " + duration.toDays() + "days (Duration conversion)");
    }

    private static void showCurrentLocalDate() {
        LocalDate localDate = LocalDate.now();
        System.out.println("Current local date: " + localDate);
    }

    private static void showCurrentLocalTime(){
        LocalTime localTime = LocalTime.now();
        System.out.println("Current local time: " + localTime);
    }

    private static void showCurrentLocalDateTime(){
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Current local date time: " + localDateTime);
    }
}

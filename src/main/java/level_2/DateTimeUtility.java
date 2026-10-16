package level_2;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeUtility {
    private final static DateTimeFormatter FORMAT_DATE_STYLE_ISO = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private final static DateTimeFormatter FORMAT_DATE_TIME_STYLE_ISO = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
    private final static DateTimeFormatter FORMAT_DATE_STYLE_US = DateTimeFormatter.ofPattern("MM/dd/yyyy");
    private final static DateTimeFormatter FORMAT_FULL_WEEKDAY_DATE_STYLE = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy");

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

    public static void showInVariousFormats(LocalDateTime localDateTime){
        System.out.println("LocalDateTime: " + localDateTime);
        System.out.println("In Various formats:");
        System.out.println("-----------------");
        System.out.println("In date style ISO: " + localDateTime.format(FORMAT_DATE_STYLE_ISO));
        System.out.println("In date style US: " + localDateTime.format(FORMAT_DATE_STYLE_US));
        System.out.println("In date time style ISO: " + localDateTime.format(FORMAT_DATE_TIME_STYLE_ISO));
        System.out.println("In date fullweek style " + localDateTime.format(FORMAT_FULL_WEEKDAY_DATE_STYLE));
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

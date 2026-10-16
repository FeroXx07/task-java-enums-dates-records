package level_2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeUtility {

    public static void showCurrentTimes() {
        showCurrentLocalDate();
        showCurrentLocalTime();
        showCurrentLocalDateTime();
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

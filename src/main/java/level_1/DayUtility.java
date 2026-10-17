package level_1;

public class DayUtility {
    public static boolean isDayWeekend(Day day) {
        if (day == Day.SATURDAY || day == Day.SUNDAY) {
            System.out.println(String.valueOf(day) + " is weekend.");
            return true;
        }

        System.out.println(String.valueOf(day) + " is working day.");
        return false;
    }

    public static Day parseStringToEnum(String strDay){
        if (strDay == null || strDay.isBlank()) {
            throw new IllegalArgumentException("The day string is null or blank.");
        }

        try {
            return Day.valueOf(strDay);
        } catch (IllegalArgumentException e) {
            System.out.println(strDay + " is not a valid day.");
        }
        return null;
    }
}

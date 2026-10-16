package level_1;

public class DayUtility {
    public static void processDay(Day day) {
        if (day == Day.SATURDAY || day == Day.SUNDAY) {
            System.out.println(String.valueOf(day) + " is weekend.");
        }
        else {
            System.out.println(String.valueOf(day) + " is working day.");
        }
    }

    public static Day parseStringToEnum(String strDay){
        try {
            return Day.valueOf(strDay);
        } catch (IllegalArgumentException e) {
            System.out.println(strDay + " is not a valid day.");
        }
        return null;
    }
}

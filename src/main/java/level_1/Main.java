package level_1;

public class Main {

    TaskManager taskManager = new TaskManager();
    void main() {
        DayUtility.isDayWeekend(Day.WEDNESDAY);
        DayUtility.isDayWeekend(Day.SATURDAY);

        taskManager.doAllTasksByPriority();

        Day parsedDay = DayUtility.parseStringToEnum("MONDAY");
        DayUtility.isDayWeekend(parsedDay);

        DayUtility.parseStringToEnum("DOOMSDAY");
    }
}

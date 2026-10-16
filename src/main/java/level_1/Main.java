package level_1;

public class Main {

    TaskManager taskManager = new TaskManager();
    void main() {
        DayUtility.processDay(Day.WEDNESDAY);
        DayUtility.processDay(Day.SATURDAY);

        taskManager.doAllTasksByPriority();

        Day parsedDay = DayUtility.parseStringToEnum("MONDAY");
        DayUtility.processDay(parsedDay);

        DayUtility.parseStringToEnum("DOOMSDAY");
    }
}

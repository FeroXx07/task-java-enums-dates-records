package level_1;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    List<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>(List.of(
                new Task("House chores", Level.MEDIUM),
                new Task("Visit doctor", Level.HIGH),
                new Task("Buy candy", Level.LOW),
                new Task("Visit mother", Level.HIGH),
                new Task("Do homework", Level.MEDIUM)));
    }
    public void doAllTasksByPriority(){
        tasks.stream()
                .sorted((t1, t2) -> Integer.compare(t2.getLevel().ordinal(), t1.getLevel().ordinal()))
                .forEach(Task::doTask);
    }
}

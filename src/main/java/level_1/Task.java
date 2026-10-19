package level_1;

import java.util.StringJoiner;

public class Task {
    private final String name;
    private Level level;

    public Task(String name, Level level) {
        this.name = name;
        this.level = level;
    }

    public Level getLevel() {
        return level;
    }

    public void doTask() {
        level.sysOutPrintLn("Doing task " + name + " with level " + level);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Task.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("level=" + level)
                .toString();
    }
}

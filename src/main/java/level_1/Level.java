package level_1;

public enum Level {
    LOW(ConsoleColors.WHITE),
    MEDIUM(ConsoleColors.YELLOW),
    HIGH(ConsoleColors.RED);

    private final String color;

    Level(String color) {
        this.color = color;
    }

    public void sysOutPrintLn(String message) {
        System.out.println(this.color + message +
                ConsoleColors.RESET);    }
}

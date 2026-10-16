package level_3;

public record Person(String name, int age) {

    public Person {
        validateAge(age);
    }

    public void showInfo() {
        System.out.println(this);
    }

    private void validateAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age must be a positive integer");
        }
    }
}

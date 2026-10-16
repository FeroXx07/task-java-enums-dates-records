package level_3;

import java.util.Objects;
import java.util.StringJoiner;

public class TraditionalPerson {
    private final String name;
    private final int age;

    public TraditionalPerson(String name, int age) {
        validateAge(age);
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void showInfo() {
        System.out.println(this);
    }

    private void validateAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age must be a positive integer");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        TraditionalPerson that = (TraditionalPerson) o;
        return age == that.age && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", TraditionalPerson.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("age=" + age)
                .toString();
    }
}

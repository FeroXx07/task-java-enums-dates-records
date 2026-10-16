package level_3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    List<Person> people = new ArrayList<>();

    void main() {
        Person person = new Person("Juan", 25);
        person.showInfo();

        people.add(new Person("Miguel", 19));
        people.add(new Person("Rafael", 16));
        people.add(new Person("Antonio", 14));
        people.add(new Person("Sara", 20));
        people.add(person);

        System.out.println("Persons with 18 or more of age");
        people.stream()
                .filter(p -> p.age() >= 18)
                .forEach(Person::showInfo);
    }
}

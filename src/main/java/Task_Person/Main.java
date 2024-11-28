package Task_Person;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Создаем несколько объектов Person
        Person person1 = new Person("Alice", 30, "женщина", "Москва");
        Person person2 = new Person("Alice", 30, "женщина", "Санкт-Петербург");
        Person person3 = new Person("Bob", 25);

        // Проверяем equals
        person1.checkPerson(person1, person2); // Люди равны
        person1.checkPerson(person1, person3); // Люди не равны

        // Проверяем hashCode
        System.out.println();
        System.out.println("HashCode person1: " + person1.hashCode());
        System.out.println("HashCode person2: " + person2.hashCode());
        System.out.println("HashCode person3: " + person3.hashCode());

        // Проверка через HashSet
        Set<Person> people = new HashSet<>();
        people.add(person1);
        people.add(person2); // Должен игнорироваться, так как person1.equals(person2) == true
        people.add(person3);

        System.out.println();
        System.out.println("Содержимое HashSet: ");
        for (Person person : people) {
            System.out.println(person);
        }
    }
}

package Task_Person;

import java.util.Objects;

public class Person {

    private String name;
    private int age;
    private String gender;
    private String city;



    public Person(String name, int age, String gender, String city) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.city = city;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    /**
        Логика сравнения объектов
     ЗАЧЕМ ВООБЩЕ ПЕРЕОПРЕДЕЛЯЕМ МЕТОДЫ СРАВНЕНИЯ?
     ИМЕЕТ СМЫСЛ ЕСЛИ СРАВНИВАЕМ НАПРИМЕР ПО 2 из ПОЛЕЙ и МЕТОД ИЗ КОРОБКИ НЕ УВИДИТ ОДИНАКОВОСТЬ ОБЪЕКТОВ

     */

    //Переопределите методы equals и hashCode так, чтобы люди считались равными, если у них совпадают имя и возраст.
    //ИМЕЕТ СМЫСЛ ЕСЛИ СРАВНИВАЕМ НАПРИМЕР ПО 2 из ПОЛЕЙ и МЕТОД ИЗ КОРОБКИ НЕ УВИДИТ ОДИНАКОВОСТЬ ОБЪЕКТОВ
    @Override
    public boolean equals(Object o) {

        if (this == o) return true; //если сущ.объект равен переданному, то true -- объекты равны

        //если не равны их классы или null тогда false
        if (o == null || this.getClass() != o.getClass()) return false;

        //создаем персону
        Person person = (Person) o;

        //если классы совпадают идем проверять равенство полей объекта
        return this.age == person.age //сравним возраст
                && Objects.equals(this.name, person.name); // сравним имена

    }

    /**
     * Класс Object предоставляет базовые методы, которые делают Java удобной для работы с объектами. Эти методы часто переопределяются для улучшения функциональности. Например:
     *
     * toString() для удобного вывода информации об объекте.
     * equals() и hashCode() для сравнения объектов.
     * Использование getClass() для получения информации о классе.
     * Метод finalize() принадлежит классу Object и предназначен для выполнения операций перед удалением объекта сборщиком мусора (garbage collector).
     * Однако использование finalize() сильно ограничено и не рекомендуется в современных приложениях из-за проблем с производительностью и надежностью.
     * @return
     */


    //LOMBOK -- переопределяет сам эти методы

    //Переопределение хэша ПОТОМУ ЧТО ПО УМОЛЧАНИЮ ХЭШКОДЫ ВСЕГДА РАЗНЫЕ И СРАВНЕНИЕ НЕ СРАБОТАЕТ
    //ДАЖЕ ПРИ ОДИНАКОВЫХ ФИО
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    // Сравнение людей с переопределенным equals()
    public void checkPerson(Person person1, Person person2) {
        if (person1.equals(person2)) {
            System.out.println();
            System.out.println("Люди " + person1.toString() + " и " + person2.toString() +  " равны.");
        } else {
            System.out.println();
            System.out.println("Люди " + person1.toString() + " и " + person2.toString() +  " не равны.");
        }
    }
}

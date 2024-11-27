package Task4_Person;

import java.util.Objects;

public class Person {

    private String name;
    private String surnname;
    private int age;

    public String getName() {
        return name;
    }

    public String getSurnname() {
        return surnname;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurnname(String surnname) {
        this.surnname = surnname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, String surnname, int age) {
        this.name = name;
        this.surnname = surnname;
        this.age = age;
    }

    /**
        Логика сравнения объектов
     ЗАЧЕМ ВООБЩЕ ПЕРЕОПРЕДЕЛЯЕМ МЕТОДЫ СРАВНЕНИЯ?
     ИМЕЕТ СМЫСЛ ЕСЛИ СРАВНИВАЕМ НАПРИМЕР ПО 2 из ПОЛЕЙ и МЕТОД ИЗ КОРОБКИ НЕ УВИДИТ ОДИНАКОВОСТЬ ОБЪЕКТОВ

     */

    //переопределяем методы .equals и hashcode
    //ИМЕЕТ СМЫСЛ ЕСЛИ СРАВНИВАЕМ НАПРИМЕР ПО 2 из ПОЛЕЙ и МЕТОД ИЗ КОРОБКИ НЕ УВИДИТ ОДИНАКОВОСТЬ ОБЪЕКТОВ
    @Override
    public boolean equals(Object o) {

        if (this == o) return true; //если сущ.объект равен переданному, то true

        //если не равны их классы или null тогда false
        if (o == null || this.getClass() != o.getClass()) return false;

        //создаем персону
        Person person = (Person) o;

        //если классы совпадают идем проверять равенство полей объекта
        return this.age == person.age //сравним возраст
                && Objects.equals(this.name, person.name) //сравним имена
                && Objects.equals(this.surnname, person.surnname); // сравним фамилии

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
        return Objects.hash(name, surnname, age);
    }




    // Сравнение людей
    void checkPerson(Person person1, Person person2){

    }
}

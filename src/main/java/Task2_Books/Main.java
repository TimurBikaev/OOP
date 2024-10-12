package Task2_Books;

/**
 * Задача "Книга":
 * Создать класс Book с полями для хранения названия, автора и года издания
 * Реализовать методы для получения и установки этих полей
 * Создать интерфейс Displayable с методом display(), который реализуется в классе Book для отображения всей инфы
 */

public class Main {

    public static void main(String[] args) {

        Book book1 = new Book();

        book1.setTitle("Хулиномика");
        book1.setAuthor("Алексей Марков");
        book1.setYear(2017);

        book1.display();


    }

}

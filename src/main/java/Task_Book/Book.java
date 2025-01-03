package Task_Book;

/**
 * Задача 9: Библиотека
 * Описание задачи:
 * Создайте класс Book, который будет представлять книгу в библиотеке. Класс должен иметь следующие свойства:
 * Название книги (title) — строка.
 * Автор книги (author) — строка.
 * Год издания (yearPublished) — целое число.
 * Статус книги (isAvailable) — логическое значение (доступна или нет).
 * Класс должен содержать следующие методы:
 * Конструктор, который инициализирует все поля.
 * Метод borrowBook(), который помечает книгу как недоступную.
 * Метод returnBook(), который помечает книгу как доступную.
 * Метод getBookInfo(), который возвращает строку с информацией о книге (например: "Название: Название книги, Автор: Автор книги, Год издания: 2020, Доступна: true").
 * Дополнительное задание:
 * Создайте класс Library, который будет управлять несколькими книгами. Реализуйте методы:
 * Добавление книги в библиотеку.
 * Поиск книги по названию.
 * Вывод всех доступных книг.
 */

public class Book {

    private String title;
    private String author;
    private int yearPublished;
    private boolean isAvailable;

    public Book(String title, String author, int yearPublished, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.isAvailable = isAvailable;
    }

    public void borrowBook() {
        this.isAvailable = false;
        System.out.println("\nКнига <" + this.title + "> стала недоступна");
    }

    public void returnBook() {
        this.isAvailable = true;
        System.out.println("\nКнига <" + this.title + "> стала доступна");
    }

    public void getBookInfo() {
        String info = "\nНазвание: <" + title +
                ">, Автор: <" + author +
                ">, Год публикации: <" + yearPublished + ">" +
                ">, Статус книги: <" + isAvailable + ">";

        System.out.println(info);
    }

    public boolean isAvailable() {
        return isAvailable;
    }

}

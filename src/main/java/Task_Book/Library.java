package Task_Book;


import java.util.HashMap;
import java.util.Map;

//Управление несколькими книгами (НАСЛЕДОВАТЬСЯ ОТ BOOK НЕ НАДО)
public class Library {

    private Map<String, Book> library; // Хранилище книг, где ключ — название

    //Конструктор с инициализацией пустой коллекции
    public Library() {
        this.library = new HashMap<>();
    }

    //Добавление книги в библиотеку.
    public void addBook(String title, String author, int year, boolean isAvailable) {
        Book book = new Book(title, author, year, isAvailable);
        library.put(title, book); //добавляем в мапу ключ(название книги) и сам созданный объект
    }

    //Поиск книги по названию.
    public void findBook(String title) {
        System.out.println("\nПоиск книги по названию " + title);
        //создаем экз.книги, вытащив её из библиотеки по ключу(название)
        Book targetBook = library.get(title);
        //выводим инфу о ней уже готовым методом
        targetBook.getBookInfo();
    }

    //Вывод всех доступных книг.
    public void displayAvailableBooks() {
        System.out.println("\nДоступные книги в библиотеке:");
        for (Book book : library.values()) {
            if (book.isAvailable()) { // Проверяем доступность
                book.getBookInfo(); // Выводим информацию о книге
            }
        }
    }


    @Override
    public String toString() {
        return "Library{" +
                "library=" + library +
                '}';
    }
}

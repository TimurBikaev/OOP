package Task_Book;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Мастер и Маргарита", "М. Булгаков", 1910, true);
        book.getBookInfo();

        book.borrowBook();
        book.returnBook();


        //создание библиотеки книг
        Library library = new Library();
        library.addBook("Мастер и Маргарита", "М. Булгаков", 1910, true);
        library.addBook("1984", "Дж. Оруэлл", 1949, true);
        library.displayAvailableBooks();

        library.findBook("1984");

    }
}

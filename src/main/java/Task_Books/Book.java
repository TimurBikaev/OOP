package Task_Books;

public class Book implements Displayable {
    private String title;
    private String author;
    private int year;

    //сеттеры
    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setYear(int year){
        this.year = year;
    }

    //геттеры
    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return author;
    }
    public int getYear() {
        return year;
    }

    @Override
    public void display() {
        System.out.println("Книга " + getTitle()  + ". Автор " + getAuthor() + ". Год издания: " + getYear());
    }
}

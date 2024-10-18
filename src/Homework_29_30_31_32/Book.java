package Homework_29_30_31_32;

public class Book {

    private String bookName;
    private String author;
    private Integer year;

    public Book(String book, String author, Integer year) {
        this.bookName = book;
        this.author = author;
        this.year = year;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }


    /**
     * Метод выводит в консоль информацию о книге, авторе и дате написания
     *
     * @return выводит в консоль всю информацию по книге, авторе и дате написания
     */

    @Override
    public String toString() {
        return "Книга" + " " + bookName + " была написана автором " + getAuthor() + " в " + year + " году";
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public Integer getYear() {
        return year;
    }
}

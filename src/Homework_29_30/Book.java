package Homework_29_30;

public class Book {

    private String book;
    private Author author;
    private Integer year;

    public void setBook(String book) {
        this.book = book;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getBook() {
        return book;
    }

    public Author getAuthor() {
        return author;
    }

    public Integer getYear() {
        return year;
    }


    /**
     * Метод выводит и отображает информацию о книге, авторе и дате написания
     */
    public void showInformation() {

        System.out.println("Книга " + book + " была написана автором " + author.getAuthor() + " в " + year + " году");
    }
}

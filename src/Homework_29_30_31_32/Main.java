package Homework_29_30_31_32;

public class Main {

    public static void main(String[] args) {

        Book book1 = new Book("Война и Мир", "Лев Николаевич Толстой", 1863);
        Book book2 = new Book("Мертвые души", "Николай Васильевич Гоголь", 1835);
        Author author1 = new Author("Лев Николаевич Толстой");
        Author author2 = new Author("Николай Васильевич Гоголь");

        System.out.println(book1);
        System.out.println(book2);

        book1.setBookName(book2.getBookName());
        book1.setYear(book2.getYear());
        book2.setAuthor(author1.getAuthor());

        System.out.println();

        System.out.println(book1);
        System.out.println(book2);

    }
}

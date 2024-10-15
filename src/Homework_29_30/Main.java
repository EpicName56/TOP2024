package Homework_29_30;

public class Main {

    public static void main(String[] args) {

        Book book1 = new Book();
        Book book2 = new Book();
        Author author1 = new Author();
        Author author2 = new Author();


        author1.setAuthor("Лев Николаевич Толстой");
        author2.setAuthor("Николай Васильевич Гоголь");


        book1.setBook("Война и мир");
        book2.setBook("Мертвые души");
        book1.setAuthor(author1);
        book2.setAuthor(author2);


        book1.setYear(1863);
        book2.setYear(1835);


        book1.showInformation();
        System.out.println();
        book2.showInformation();

    }
}

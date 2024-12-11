package Homework_59_60;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Book book1 = new Book(1, "Война и мир", "Лев Николаевич Толстой", true);
        Book book2 = new Book(2, "Тестовая книга", "Тестовый автор", false);
        Book book3 = new Book(3, "Мертвые души", "Николай Васильевич Гоголь", false);
        Book book4 = new Book(4, "Мастер и Маргарита", "Булгаков Михаил Афанасьевич", true);
        Book book5 = new Book(5, "Анна Каренина", "Лев Николаевич Толстой", true);

        Library library = new Library();
        library.putBookInStorage(book1);
        library.putBookInStorage(book2);
        library.putBookInStorage(book3);
        library.putBookInStorage(book4);
        library.putBookInStorage(book5);

        System.out.println("-----------------------------------------------------------------------------------------");

        List libraryList = library.getBook();

        for (Object lib : libraryList)
            System.out.println(lib);

        System.out.println(library.getBook(4));
        System.out.println(library.getAuthors());
        System.out.println(library.bookCount());
        System.out.println(library.getBook(book4));
    }
}

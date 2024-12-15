package Homework_59_60_61_62;

import java.util.*;
import java.util.stream.Collectors;

public class Library {

    public static Map<Integer, Book> books = new HashMap<>();

    public Library() {
        books = new HashMap<>();
    }

    /**
     * Метод добавляет книгу в библиотеку
     *
     * @param book содержит данные о книге
     */
    public void putBookInStorage(Book book) {
        books.put(book.getId(), book);
    }

    /**
     * Метод извлечения книги из библиотеки
     *
     * @param id содержит ключ книги
     * @return возвращает книгу по заданному ключу
     */
    public Book getBook(int id) {
        return books.get(id);
    }

    /**
     * Метод проверяет доступность книги в библиотеке
     *
     * @param book принимает данные о книге
     * @return если книга доступна в библиотеке, то возвращает саму книгу
     */
    public List getBook(Book book) {
        if (book.isAvailable()) {
            return Collections.singletonList(book + " находится в библиотеке");
        } else {
            return Collections.singletonList("Книга не найдена");
        }
    }

    /**
     * Метод возвращает лист с книгами
     *
     * @return возвращает лист с книгами
     */
    public List getBook() {
        return books.values().stream().sorted(Comparator.comparing(Book::getTitle)).toList();
    }

    /**
     * Второй метод для работы с листами
     *
     * @param b принимает данные о книге
     * @return возвращает отсортированный лист
     */
    public List getBook(Boolean b) {
        if (b) {
            return books.values().stream().filter(Book::isAvailable).toList();
        }
        return Collections.singletonList((long) books.values().size());
    }

    /**
     * Метод для получения количества всех книг
     *
     * @return возвращает количество книг
     */
    public int bookCount() {
        return books.size();
    }

    /**
     * Метод для получения количества доступных книг
     *
     * @param b принимает данные о книге
     * @return возвращает количество книг
     */
    public int bookCount(Boolean b) {
        if (b) {
            return Math.toIntExact(books.values().stream().filter(Book::isAvailable).count());
        }
        return Math.toIntExact(books.values().stream().filter(book -> !book.isAvailable()).count());
    }

    /**
     * Метод для получения списка авторов без дубликатов
     *
     * @return возвращает список авторов
     */
    public List getAuthors() {
        List<String> Authors = new ArrayList<>();
        books.values().forEach(book -> Authors.add(book.getAuthor()));
        return Authors.stream().sorted(Comparator.naturalOrder()).distinct().toList();
    }

    public Map<Boolean, List<Book>> testMap() {
        return books.values().stream().collect(Collectors.partitioningBy(Book::isAvailable));
    }

    public Map<String, List<Book>> testAuthorMap() {
        return books.values().stream().collect(Collectors.groupingBy(Book::getAuthor));
    }

    @Override
    public String toString() {
        return "Список книг: " + books;
    }
}

package Old_Homework.Homework_57_58;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Реализация через анонимный класс
        Printer printer = new Printer() {
            @Override
            public void print() {
                System.out.println("Распечатываю...");
            }
        };
        printer.print();


        //Реализация через лямбда-выражение
        Printer printer2 = () -> System.out.println("Распечатываю... опять");
        printer2.print();


        //Вторая реализация через лямбда-выражение с выводом длины сообщения
        AnotherPrinter printer3 = n -> {
            System.out.println("Распечатываю: " + n);
            System.out.println("Длина сообщения:  " + n.length() + " символов");
        };
        printer3.print("Сообщение!");

        System.out.println("-----------------------------------------------------------------------------------------");

        List<String> names = Arrays.asList("Владимир", "Василий", "Максим", "Артем", "Анна", "Евгения", "Борис");
        System.out.println(names);

        names.sort(Comparator.naturalOrder());
        System.out.println(names);


        //Сортировка в обратном порядке через анонимный класс
        NameSorter newSorter = new NameSorter() {
            @Override
            public void sorter() {
                System.out.println(names.reversed());
            }
        };
        newSorter.sorter();


        //Сортировка в обратном порядке через лямбду
        Collections.sort(names, (n1, n2) -> {
            return n2.compareTo(n1);
        });
        System.out.println(names);

        System.out.println("-----------------------------------------------------------------------------------------");

        List<String> words = Arrays.asList("apple", "banana", "fig", "date", "kiwi", "grape");
        List<String> newWords = new ArrayList<>();
        System.out.println(words);

        newWords = words.stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println(newWords);

        newWords = words.stream()
                .filter(n -> n.length() > 4)
                .toList();
        System.out.println(newWords);

        newWords = words.stream()
                .sorted(Comparator.comparingInt(String::length))
                .toList();
        System.out.println(newWords);

    }
}

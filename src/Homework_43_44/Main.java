package Homework_43_44;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<String> students = new ArrayList<>();
    static List<String> newStudents = new ArrayList<>();

    public static void main(String[] args) {

        students.add("Роман");
        students.add("Евгений");
        students.add("Лев");
        students.add("Оксана");
        students.add("Семен");

        newStudents.add("Сергей");
        newStudents.add("Игорь");
        newStudents.add("Олег");

        System.out.println(students);

        students.addAll(newStudents);

        System.out.println(students);

        // Удаление студента по имени и по индексу
        students.remove("Лев");
        students.remove(5);
        System.out.println(students);

        // Проверка студентов в списке
        System.out.println(students.contains("Оксана"));
        System.out.println(students.contains("Тамара"));
        System.out.println(students.containsAll(newStudents));

        // Получение размера и проверка на пустоту
        System.out.println(students.size());
        System.out.println(students.isEmpty());

        // Очистка списка
        students.clear();
        System.out.println(students);
    }
}

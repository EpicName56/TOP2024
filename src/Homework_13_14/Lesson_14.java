package Homework_13_14;

public class Lesson_14 {

    public static void main(String[] args) {

        // Задача 3. Таблица умножения
        // Условие: Напишите программу, которая выводит таблицу умножения от 1 до 10 (1 * 1, 1* 2 и
        // т.д. до 10 * 10)

        for (int i = 1; i < 10; i++) {
            for (int n = 1; n < 10; n++) {
                System.out.print(" " + i * n + " ");
            }

            // я немного не понял как сделать так, чтобы результат выводился как в реальной таблице умножения
            // не в строчку, а столбиками для каждого значения

        }
    }
}
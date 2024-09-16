package Homework_13_14;

public class Lesson_13 {

    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();

    }

    static void task1() {

        // Задача 1. Вывод чётных чисел от 1 до n
        // Условие: Напишите программу, которая выводит все НЕчётные числа от 1 до заданного числа
        // n

        int n = 30;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                System.out.print(" " + i);
            }
        }
    }

    static void task2() {

        // Задача 2. Произведение чисел от 1 до n
        // Условие: Напишите программу, которая вычисляет произведение всех чисел от 1 до
        // заданного числа n

        int n = 4;
        int multiplication = 1;

        for (int i = 1; i <= n; i++) {
            multiplication *= i;
            System.out.print(" " + multiplication);
        }
    }
}
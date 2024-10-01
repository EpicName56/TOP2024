package Homework_21_22;

import java.util.Scanner;

public class Methods {

    // Создайте метод square, который принимает одно целое число и возвращает его квадрат, затем
    // вызовите его с разными значениями и выведите результат

    static int square(int i) {
        return i * i;

    }

    static String stringFullName(String full) {

        // Создайте метод printFullName, который принимает два параметра типа String — имя и
        // фамилию — и выводит полное имя в формате: "Full name: Имя Фамилия"

        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        String surname = scan.nextLine();
        full = name + " " + surname;
        return full;

    }

    static String cornerValuesArray() {

        // Создайте метод cornerValuesArray, который принимает массив строк, а возвращает массив
        // строк из двух элементов – самая короткая и самая длинная строка в исходном массиве

        double[] cornerValue = {4, 8, 15, 16, 23, 42};
        double min = cornerValue[0];
        double max = cornerValue[0];

        for (int i = 1; i < cornerValue.length; i++) {
            if (cornerValue[i] > max) max = cornerValue[i];
            else if (cornerValue[i] < min) min = cornerValue[i];
        }

        String result = min + " " + max;

        // тут я не стал особо запариваться и просто перенес код из 19-20 домашки

        return result;
    }
}

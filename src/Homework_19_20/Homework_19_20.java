package Homework_19_20;

import java.util.Arrays;

public class Homework_19_20 {

    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
        System.out.println();
        task5();

    }

    static void task1() {

        // Напишите программу, которая вычисляет среднее значение элементов массива целых чисел int[]

        int[] numbers = {10, 20, 30, 40, 50};
        int result = 0;

        for (int numbersSum : numbers) {
            result += numbersSum;
        }

        System.out.println(result / numbers.length);

    }

    static void task2() {

        // Напишите программу, которая находит минимальное и максимальное значение в массиве вещественных чисел double[]

        double[] numbers = {3.5, 5.2, -1.4, 7.8, 2.2};
        double min = numbers[0];
        double max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) max = numbers[i];
            else if (numbers[i] < min) min = numbers[i];
        }

        System.out.println(min);
        System.out.println(max);
    }


    static void task5() {

        // Напишите программу, которая разделяет строку на части по заданному разделителю (например, запятая)
        // и сохраняет эти части в массив строк String[]

        String str = "apple,banana,grape,orange";
        String[] strSplit = str.split("[,\\s]+");
        System.out.println(Arrays.toString(strSplit));
    }

    static void task4() {

        // Напишите программу, которая преобразует строку в массив символов char[], а затем заменяет все символы,
        // которые являются пробелами, на символ подчеркивания

        String text = "Hello World This Is Java";
        String result = "";
        char[] splitText = text.toCharArray();

        for (int i = 0; i < splitText.length; i++) {
            if (splitText[i] == ' ') {
                splitText[i] = '_';

            }
        }

        for (char c : splitText) {
            result += Character.toString(c);
        }

        System.out.println(result);

    }

    static void task3() {

        // Напишите программу, которая подсчитывает количество гласных букв в массиве символов char[]

        String[] letters = {"a", "B", "i", "t", "E", "r"};
        int vowelsLetters = 0;

        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < letters[i].length(); j++) {
                switch (letters[i].charAt(j)) {

                    case 'a':
                        vowelsLetters++;
                        break;

                    case 'i':
                        vowelsLetters++;
                        break;

                    case 'E':
                        vowelsLetters++;
                        break;
                }
            }
        }
        System.out.println("Количество гласных в массиве: " + vowelsLetters);

        // ооооооооооооооооооооооооооооооочень костыльно, но, в прицнипе, работает
    }
}

package Old_Homework.Homework_27_28;

import java.util.Arrays;

public class Methods {

    /** Метод выводит сумму столбцов многомерного массива по элементам
     *
     * @param array хранит в себе двумерный массив
     */

    static void elementsArray(int[][] array) {

        for (int i = 0; i < array[0].length; i++) {

            int sum = 0;
            for (int j = 0; j < array.length; j++) {
                sum += array[j][i];
            }
            System.out.println("Сумма столбца " + (i + 1) + " по элементам равна: " + sum);
        }
    }

    /** Метод выводит сумму столбцов многомерного массива по строкам
     *
     * @param array хранит в себе двумерный массив
     */

    static void lineArray(int[][] array) {

        for (int i = 0; i < array[0].length; i++) {

            int sum = 0;
            for (int j = 0; j < array.length; j++) {
                sum += array[i][j];
            }
            System.out.println("Сумма сторбца " + (i + 1) + " по строкам равна: " + sum);
        }
    }

    /** Метод выводит элементы массива в виде матрицы
     *
     * @param array хранит в себе двумерный массив
     */

    static void matrixlArray(int[][] array) {

        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }

    /** Метод для работы с копиями массива
     *
     * @param array хранит в себе начальный массив
     */

    static void massCopy(int[] array) {

        System.out.println(Arrays.toString(array));
        int[] copyArray = Arrays.copyOf(array, array.length + 1);
        System.out.println(Arrays.toString(copyArray));
        System.out.println(Arrays.toString(array));
        copyArray[array.length] = 0;
        copyArray[array.length - 1] = 0;
        System.out.println(Arrays.toString(copyArray));

        // технически это может считаться методом. Решение в лоб. Но главное, что работает ¯\_(ツ)_/¯
    }
}

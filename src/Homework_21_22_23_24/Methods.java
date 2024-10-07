package Homework_21_22_23_24;

public class Methods {

    /**
     * Метод возводит заданное пользователем число в квадрат
     * @param i - само число указываемое заранее
     * @return - умножает число на само себя
     */

    static int square(int i) {
        return i * i;

    }


    /** Метод выводит полное имя и фамилию указанные пользователем
     * @param name и surename хранят в себе данные указанные пользователем
     * @return возвращает полные имя и фамилию
     */

    static String stringFullName(String name, String surename) {

        String fullName = name + " " + surename;

        return fullName;

        // исправил

    }


    /** Метод находит и выводит наименьшее и наибольшее число, указанное пользователем в заданном массиве
     * @param value - массив (значение) цифр через который выполняется поиск
     * @return result - возвращаемое меньшее и большее число из массива
     */

    static String cornerValuesArray(int... value) {

        int min = value[0];
        int max = value[0];

        for (int i = 0; i < value.length; i++) {
            if (value[i] > max) max = value[i];
            else if (value[i] < min) min = value[i];
        }
        String result = min + " " + max;
        return result;

        // я по прежнему не могу преобразовать static String в int
        // потому, что получаю ошибку формата NumberFormatException

    }


    /** Метод находит и выводит наибольший и наименьший символ, указанный в заданном массиве (сравнение идет
     * через порядковый номер символа по таблицы UNICODE)
     * @param letters - массив (значение) символов через который выполняется поиск
     * @return result - возвращает меньший и больший символ в массиве
     */

    static String cornerValuesArray(char... letters) {

        char min = letters[0];
        char max = letters[0];

        for (char i = 0; i < letters.length; i++) {
            if (letters[i] > max) max = letters[i];
            else if (letters[i] < min) min = letters[i];
        }
        String result = min + " " + max;
        return result;
    }

}

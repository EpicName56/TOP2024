package Old_Homework.Homework_21_22_23_24_25_26;

public class Methods {

    /**
     * Метод возводит заданное пользователем число в квадрат
     *
     * @param i - само число указываемое заранее
     * @return - умножает число на само себя
     */

    static int square(int i) {

        return i * i;
    }


    /**
     * Метод выводит полное имя и фамилию указанные пользователем
     *
     * @param name и surename хранят в себе данные указанные пользователем
     * @return возвращает полные имя и фамилию
     */

    static String stringFullName(String name, String surename) {

        String fullName = name + " " + surename;

        return fullName;

    }


    /**
     * Метод находит и выводит наименьшее и наибольшее число, указанное пользователем в заданном массиве
     *
     * @param value - массив (значение) цифр через который выполняется поиск
     * @return возвращаемое меньшее и большее число из массива
     */

    static int[] cornerValuesArray(int... value) {

        if (value.length == 0) {
            System.out.print("Массив пустой: ");
            return value;
        }

        int min = value[0];
        int max = value[0];

        for (int i = 0; i < value.length; i++) {
            if (value[i] > max) max = value[i];
            else if (value[i] < min) min = value[i];
        }

        return new int[]{min, max};

        // теперь, вроде, выводит int, а не String

    }


    /**
     * Метод находит и выводит наибольший и наименьший символ, указанный в заданном массиве (сравнение идет
     * через порядковый номер символа по таблицы UNICODE)
     *
     * @param letters - массив (значение) символов через который выполняется поиск
     * @return возвращает наибольший и наименьший символы
     */

    static String cornerValuesArray(char... letters) {

        if (letters.length == 0) {
            System.out.print("Массив пустой: ");
            return null;
        }

        char min = letters[0];
        char max = letters[0];

        for (char i = 0; i < letters.length; i++) {
            if (letters[i] > max) max = letters[i];
            else if (letters[i] < min) min = letters[i];
        }
        String result = min + " " + max;

        return result;
    }


    /**
     * Метод сравнивает строки заранее указанные пользователем по количеству знаков и выдает равенство или не равенство
     * строк
     *
     * @param strValue       - хранит в себе первую строку
     * @param secondStrValue - хранит в себе вторую строку
     * @return считает количество символов в строке и возвращает равенство или не равенство строк
     */

    static String cornerValues(String strValue, String secondStrValue) {

        int firstCheck = strValue.length();
        int secondCheck = secondStrValue.length();

        String result = "Длина первой строки: " + firstCheck + " " + "Длина второй строки: " + secondCheck;
        if (firstCheck == secondCheck) {
            System.out.println("Строки равны");
        } else {
            System.out.println("Строки не равны");
        }

        return result;
    }

    // надеюсь, что это верный метод сравнения строк


    /**
     * Метод выводит факториал из заданного заранее пользователем числа
     *
     * @param l хранит в себе число заранее заданное пользователем
     * @return возвращает факторил из заданного числа
     */

    static long factorialRecursion(long l) {

        if (l < 2) return 1;

        return l * factorialRecursion(l - 1);

    }
}

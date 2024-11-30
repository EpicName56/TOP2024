package Homework_53_54;

import java.util.*;

public class Methods {

    /**
     * Метод выполняет обработку массива int и проверяет наличие уникальных значений
     *
     * @param num хранит в себе массив
     * @return возвращает уникальные, не повторяющиеся, значения
     */
    public static Set<Integer> getUniqueElements(int[] num) {

        Set<Integer> numbers = new HashSet<>();

        for (Integer number : num) {
            numbers.add(number);
        }
        return numbers;
    }


    /**
     * Метод выполняет обработку массива String и проверяется наличие уникальных значений
     *
     * @param letters хранит в себе массив
     * @return возвращает уникальные, не повторяющиеся, значения
     */
    public static Set<String> getOrderedUniqueElements(String[] letters) {

        Set<String> lett = new LinkedHashSet<>();

        for (String str : letters) {
            lett.add(str);
        }
        return lett;
    }


    /**
     * Метод принимает массив чисел и число-цель и выводит ближайший меньший и ближайший больший к числу-цели элемент
     *
     * @param num    хранит в себе массив
     * @param target хранит в себе число-цель
     * @return возвращает ближайший меньший и ближайший больший к числу-цели элемент
     */
    public static Set<String> findClosestNumbers(int[] num, int target) {

        NavigableSet<Integer> values = new TreeSet<>();

        for (Integer value : num) {
            values.add(value);
        }
        return Collections.singleton(values.lower(target) + ", " + values.higher(target));
    }
}

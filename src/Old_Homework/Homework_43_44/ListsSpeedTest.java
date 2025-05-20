package Old_Homework.Homework_43_44;

import java.util.ArrayList;
import java.util.List;

public class ListsSpeedTest {

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new ArrayList<>();

        System.out.println("ArrayList, добавление элементов в мс: " + addElement(arrayList));
        System.out.println("LinkedList, добавление элементов в мс: " + addElement(linkedList));

        System.out.println();

        System.out.println("ArrayList, получение элементов в мс: " + getElement(arrayList));
        System.out.println("LinkedList, получение элементов в мс: " + getElement(linkedList));

    }


    /**
     * Метод добавляет миллион элементов в выбранный лист
     *
     * @param list содержит в себе добавленные элементы
     * @return возвращает время выполнения программы в миллисекундах
     */
    public static long addElement(List<Integer> list) {

        long start = System.currentTimeMillis();

        for (int i = 0; i < 1_000_000; i++) {
            list.add(i);
        }

        long finish = System.currentTimeMillis();
        return finish - start;
    }


    /**
     * Метод выбирает сто тысяч элементов из указанного листа
     *
     * @param list выполняет операцию по выбору элемента из листа
     * @return возвращает время выполнения программы в миллисекундах
     */
    public static long getElement(List<Integer> list) {

        long start = System.currentTimeMillis();

        for (int i = 0; i < 100_000; i++) {
            list.get(i);
        }

        long finish = System.currentTimeMillis();
        list.clear();
        return finish - start;
    }
}

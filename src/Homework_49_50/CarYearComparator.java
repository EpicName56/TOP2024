package Homework_49_50;

import java.util.Comparator;

public class CarYearComparator implements Comparator<Car> {

    /**
     * Метод выполняет сортировку автомобилей по году выпуска
     *
     * @param o1 является первым объектом для сравнивания
     * @param o2 является вторым объектом для сравнивания
     * @return возвращает отсортированный список
     */
    @Override
    public int compare(Car o1, Car o2) {
        if (Integer.compare(o1.getYear(), o2.getYear()) == 0) {
            return o1.getModel().compareTo(o2.getModel());
        }
        return Integer.compare(o1.getYear(), o2.getYear());
    }
}

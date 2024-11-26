package Homework_49_50;

import java.util.Comparator;

public class CarModelComparator implements Comparator<Car> {

    /**
     * Метод выполняет сортировку автомобилей по модели
     *
     * @param o1 является первым объектом для сравнивания
     * @param o2 является вторым объектом для сравнивания
     * @return возвращает отсортированный список
     */
    @Override
    public int compare(Car o1, Car o2) {
        if (o1.getModel().compareTo(o2.getModel()) == 0) {
            return Integer.compare(o1.getYear(), o2.getYear());
        }
        return o1.getModel().compareTo(o2.getModel());
    }
}

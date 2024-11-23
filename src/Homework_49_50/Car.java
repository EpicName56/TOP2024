package Homework_49_50;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Car implements Comparable<Car> {

    private String model;
    private int year;

    public static void main(String[] args) {


        // Можно считать, что цифра после марки и года машины - рейтинг автомобиля
        Map<Car, Integer> cars = new TreeMap<>();

        cars.put(new Car("Lada", 1990), 4);
        cars.put(new Car("Lada", 1992), 3);
        cars.put(new Car("Audi", 1999), 7);
        cars.put(new Car("Toyota", 2001), 5);

        System.out.println("Исходный список: " + cars);


        Map<Car, Integer> carsModel = new TreeMap<>(new CarModelComparator());

        carsModel.put(new Car("Lada", 1990), 4);
        carsModel.put(new Car("Lada", 1992), 3);
        carsModel.put(new Car("Audi", 1999), 7);
        carsModel.put(new Car("Toyota", 2001), 5);

        System.out.println("Сортировка по модели автомобиля: " + carsModel);


        Map<Car, Integer> carsYear = new TreeMap<>(new CarYearComparator());

        carsYear.put(new Car("Lada", 1990), 4);
        carsYear.put(new Car("Lada", 1992), 3);
        carsYear.put(new Car("Audi", 1999), 7);
        carsYear.put(new Car("Toyota", 2001), 5);

        System.out.println("Сортировка по году автомобиля: " + carsYear);

    }


    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Машина марки: " + model + ", " + year + " года выпуска";
    }

    public String getModel() {
        return model;
    }

    public Integer getYear() {
        return year;
    }

    @Override
    public int compareTo(Car o) {
        return Comparator.comparing(Car::getModel)
                .thenComparing(Car::getYear)
                .compare(this, o);
    }
}

package Homework_55_56;

import java.util.List;

public class CarList {

    private List<Car> cars;


    public CarList(List<Car> cars) {
        this.cars = cars;
    }

    /**
     * Метод выполняет поиск машины по заданным параметрам
     *
     * @param model хранит в себе модель искомой машины
     * @param year  хранит в себе дату производства искомой машины
     * @return возвращает искомую машину, если она есть в списке
     */
    public Car getCar(String model, int year) {

        for (Car car : cars) {
            if (car.getModel().equals(model) && car.getYear() == year) {
                return car;
            }
        }
        throw new CarNotFountException("Ошибка поиска машины");
    }
}

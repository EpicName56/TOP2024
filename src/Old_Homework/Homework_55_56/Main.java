package Old_Homework.Homework_55_56;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static Old_Homework.Homework_55_56.ArithmeticException.*;
import static Old_Homework.Homework_55_56.PasswordCheck.passCheck;

public class Main {

    public static void main(String[] args) {

        System.out.println(arithmeticException(6, 2));
        System.out.println(arithmeticException(1, 0));

        System.out.println("----------------------------------------------------------------------------------------");

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Лада", 1990));
        cars.add(new Car("Тойота", 2010));
        cars.add(new Car("Мерседес", 1987));

        CarList car = new CarList(cars);

        try {
            System.out.println(car.getCar("Ауди", 2011));
        } catch (CarNotFountException e) {
            System.out.println("Ошибка поиска машины");
        }

        try {
            System.out.println(car.getCar("Лада", 1990));
        } catch (CarNotFountException e) {
            System.out.println("Ошибка поиска машины");
        }

        System.out.println("----------------------------------------------------------------------------------------");

        String[] passwords = {"MyPassword123", "ffffff66", "ShlechtPass", "aSdf3h", "avalanche gt2020"};

        passCheck(Arrays.toString(passwords));
    }
}

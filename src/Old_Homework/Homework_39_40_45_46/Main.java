package Old_Homework.Homework_39_40_45_46;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    static List<String> houses = new ArrayList<>();
    static List<Car> cars = new ArrayList<>();

    public static void main(String[] args) {

        House house1 = new House.Builder()
                .floors(3)
                .rooms(12)
                .garage(1)
                .build();

        House house2 = new House.Builder()
                .floors(6)
                .rooms(18)
                .build();

        House house3 = new House.Builder()
                .floors(2)
                .rooms(12)
                .garage(4)
                .build();

        House house4 = new House.Builder()
                .floors(4)
                .rooms(16)
                .garage(2)
                .build();

        House house5 = new House.Builder()
                .floors(1)
                .rooms(3)
                .garage(0)
                .build();


        houses.add(String.valueOf(house1));
        houses.add(String.valueOf(house2));
        houses.add(String.valueOf(house3));
        houses.add(String.valueOf(house4));

        // Проверка наличия двух домов в списке с помощью метода contains
        System.out.println(houses.contains(house1.toString()));
        System.out.println(houses.contains(house2.toString()));
        System.out.println(houses.contains(house5.toString()));

        // Проверка наличия двух домов в списке с помощью метода indexOf
        System.out.println(houses.indexOf(house3.toString()));
        System.out.println(houses.indexOf(house4.toString()));
        System.out.println(houses.indexOf(house5.toString()));


        System.out.println("-----------------------------------------------------------------------------------------");


        Car car1 = new Car.Builder()
                .model("Lada")
                .year(2024)
                .color("Black")
                .build();

        Car car2 = new Car.Builder()
                .model("Lada")
                .year(2024)
                .color("White")
                .build();

        Car car3 = new Car.Builder()
                .model("Lada")
                .year(2024)
                .color("Red")
                .build();

        Car car4 = new Car.Builder()
                .model("Lada")
                .year(2023)
                .color("Gray")
                .build();

        Car car5 = new Car.Builder()
                .model("Volga")
                .year(2024)
                .color("Black")
                .build();

        Car car6 = new Car.Builder()
                .model("Volga")
                .year(2023)
                .color("White")
                .build();

        Car car7 = new Car.Builder()
                .model("Volga")
                .year(2022)
                .color("Red")
                .build();

        Car car8 = new Car.Builder()
                .model("Audi")
                .year(2020)
                .color("Red")
                .build();


        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car7);
        cars.add(car8);

        System.out.println(cars);
        Collections.sort(cars);
        System.out.println(cars);
    }
}

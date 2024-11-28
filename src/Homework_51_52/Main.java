package Homework_51_52;

import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        CustomMutableClass cmc1 = new CustomMutableClass(1);

        ImmutableClass imc1 = new ImmutableClass("Первый класс", Collections.singletonList(20), cmc1);


        System.out.println(imc1);
        cmc1.setValue(30);
        System.out.println(cmc1);
        System.out.println(imc1);

        System.out.println("----------------------------------------------------------------------------------------");


        Box<String> firstBox = new Box<>(" ");
        Box<Integer> secondBox = new Box<>(1);
        Box<Integer> thirdBox = new Box<>(null);

        System.out.println(firstBox);
        System.out.println(secondBox);
        System.out.println(thirdBox);


        firstBox.setData("Не пустая строка");
        System.out.println(firstBox.getData());
    }
}

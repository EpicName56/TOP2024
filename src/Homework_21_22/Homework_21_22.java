package Homework_21_22;


import static Homework_21_22.Methods.*;

public class Homework_21_22 {

    public static void main(String[] args) {

        int i1 = 5;

        System.out.println(square(i1));

        System.out.println();
        System.out.print("Введите Ваше имя, а затем фамилию: ");
        System.out.println("Ваше полное имя и фамилия: " + stringFullName(""));

        System.out.println();
        System.out.println("Минимальное и максимальное число в массиве: " + cornerValuesArray());


    }
}

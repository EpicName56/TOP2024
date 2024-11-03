package Old_Homework;

import java.util.Scanner;

public class Lesson_7 {

    public static void main(String[] args) {

        Scanner firstScan = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int number = firstScan.nextInt();

        System.out.print("Введите второе число: ");
        int secondNumber = firstScan.nextInt();

        System.out.print("Сумма введенных чисел: ");
        System.out.print(number + secondNumber);
    }
}

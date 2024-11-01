package Old_Homework;

import java.util.Scanner;

public class Lesson_11_2 {

    public static void main(String[] args) {

        Scanner newScan = new Scanner(System.in);

        System.out.print("Укажите номер месяца: ");

        int monthNumber = newScan.nextInt();

        String secondMonthNumber = switch (monthNumber) {
            case 1, 2, 3, 11, 12 -> monthNumber + " является зимним месяцем в году";
            case 4, 5, 6 -> monthNumber + " является весенним месяцем в году";
            case 7, 8 -> monthNumber + " является летним месяцем в году";
            case 9, 10 -> monthNumber + " является осенним месяцем в году";
            default -> "Введен неверный месяц";
        };

        System.out.println(secondMonthNumber);
    }
}
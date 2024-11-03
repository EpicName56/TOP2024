package Old_Homework;

import java.util.Scanner;

public class Lesson_12 {

    public static void main(String[] args) {

        Scanner firstScan = new Scanner(System.in);

        System.out.print("Пожалуйста, укажите Ваш возраст: ");
        int ageNumber = firstScan.nextInt();

        if (ageNumber >= 2 && ageNumber < 7) {
            System.out.println("Если возраст человека " + ageNumber + ", то ему необходимо идти в детский сад");
            return;
        }
        if (ageNumber >= 7 && ageNumber < 19) {
            System.out.println("Если возраст человека " + ageNumber + ", то ему необходимо посещать школу");
            return;
        }
        if (ageNumber >= 19 && ageNumber < 24) {
            System.out.println("Если возраст человека " + ageNumber + ", то ему необходимо посещать университет");
            return;
        }
        if (ageNumber >= 24) {
            System.out.println("Если возраст человека " + ageNumber + ", то ему необходимо идти на работу");
        } else {
            System.out.println("Возраст неверно указан");
        }
    }
}
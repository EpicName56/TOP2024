import java.util.Scanner;

public class Lesson_11 {

    public static void main(String[] args) {

        Scanner newScan = new Scanner(System.in);

        System.out.print("Укажите номер месяца: ");

        int monthNumber = newScan.nextInt();

        switch (monthNumber) {
            case 1, 2, 3, 11, 12:
                System.out.println(monthNumber + " месяц в году является зимним месяцем");
                break;

            case 4, 5, 6:
                System.out.println(monthNumber + " месяц в году является весенним месяцем");
                break;

            case 7, 8:
                System.out.println(monthNumber + " месяц в году является летним месяцем");
                break;

            case 9, 10:
                System.out.println(monthNumber + " месяц в году является осенним месяцем");
                break;

            default:
                System.out.println("Введен неверный номер месяца");
        }
    }
}
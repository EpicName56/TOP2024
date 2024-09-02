import java.util.Random;
import java.util.Scanner;

public class Lesson_7 {

    public static void main(String[] args) {

        byte firstByte = 1;
        short firstShort = 2;
        int firstInt = 3;
        long firstLong = 4L;
        float firstFloat = 5;
        double firstDouble = 6;
        char firstChar = 'A';
        boolean firstBoolean = true;

        System.out.println("byte: " + firstByte);
        System.out.println("short: " + firstShort);
        System.out.println("int: " + firstInt);
        System.out.println("long: " + firstLong);
        System.out.println("float: " + firstFloat);
        System.out.println("double: " + firstDouble);
        System.out.println("char: " + firstChar);
        System.out.println("boolean: " + firstBoolean);

        System.out.println();

        System.out.println("Сложение: " + (firstByte + firstShort));
        System.out.println("Умножение: " + (firstInt * firstLong));

        Scanner newScanner = new Scanner(System.in);

        Random newRandom = new Random();
        char secondChar = (char) newRandom.nextInt(1, 4);
        System.out.println();
        System.out.println(secondChar);
    }
}

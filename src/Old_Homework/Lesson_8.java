package Old_Homework;

import java.util.Random;

public class Lesson_8 {

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
        System.out.println();

        // скорее всего, это все можно уместить в одну или две строки и даже не обязательно писать четыре рандома //
        // но я не ищу легких путей, я по ним иду //

        Random firstRandom = new Random();

        int testRandom = (char) firstRandom.nextInt(0, 65535);
        int secondTestRandom = (char) firstRandom.nextInt(0, 65535);
        int thirdTestRandom = (char) firstRandom.nextInt(0, 65535);
        int fourTestRandom = (char) firstRandom.nextInt(0, 65535);

        char randomChar = (char) (testRandom);
        char secondRandomChar = (char) (secondTestRandom);
        char thirdRandomChar = (char) (thirdTestRandom);
        char fourRandomChar = (char) (fourTestRandom);

        System.out.print("Символы: ");
        System.out.print(randomChar);
        System.out.print(secondRandomChar);
        System.out.print(thirdRandomChar);
        System.out.print(fourRandomChar);

        // я не понимамю, как я это делаю, но это, вроде, работает :D //

    }
}
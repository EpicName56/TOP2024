public class Lesson_5 {

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

        // первая попытка вызвать переполнение //

        long firstOverflow = Integer.MAX_VALUE;
        long secondOverflow = Integer.MAX_VALUE;
        long finalOverflow = (int) (firstOverflow * secondOverflow);
        System.out.println(finalOverflow);

        System.out.println();

        // вторая попытка //

        long testOverflow = Integer.MAX_VALUE + 1;
        System.out.println(testOverflow);
    }
}

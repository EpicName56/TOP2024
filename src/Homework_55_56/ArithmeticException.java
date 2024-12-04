package Homework_55_56;

public class ArithmeticException {

    public static String arithmeticException(int firstNumber, int secondNumber) {

        try {
            int result = firstNumber / secondNumber;
            return String.valueOf(result);

        } catch (java.lang.ArithmeticException e) {

        }
        return "Ошибка деления на 0";
    }
}

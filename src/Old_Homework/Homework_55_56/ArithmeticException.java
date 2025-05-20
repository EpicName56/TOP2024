package Old_Homework.Homework_55_56;

public class ArithmeticException {

    /**
     * Метод делит первое число на второе
     *
     * @param firstNumber  хранит в себе первое число
     * @param secondNumber хранит в себе второе число
     * @return возвращает результат деления и обходит ошибку типа ArithmeticException, если она присутствует
     */
    public static String arithmeticException(int firstNumber, int secondNumber) {

        try {
            int result = firstNumber / secondNumber;
            return String.valueOf(result);

        } catch (java.lang.ArithmeticException e) {

        }
        return "Ошибка деления на 0";
    }
}

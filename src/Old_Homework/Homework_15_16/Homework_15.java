package Old_Homework.Homework_15_16;

import java.util.Locale;

public class Homework_15 {

    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();

    }

    static void task1() {

        String text = "0123456789qweASD";

        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) {
                System.out.print("upperLetter ");

            } else if (Character.isLowerCase(text.charAt(i))) {
                System.out.print("lowerLatter ");

            } else if (Character.isDigit(text.charAt(i))) {
                System.out.print("digit ");
            }
        }

        // я не понял как создать условие для подсчета цифр от 0 до 4 и от 5 до 9 отдельно
        // точнее я не понял поставленной задачи

    }

    static void task2() {

        String text = new String("I like Java!!!");

        boolean firstCheck;
        boolean secondCheck;
        boolean thirdCheck;

        //  Распечатать последний символ строки. Используем метод String.charAt()
        System.out.println(text.charAt(13));

        // Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем
        // метод String.endsWith()
        firstCheck = text.endsWith("!!!");
        System.out.println(firstCheck);

        // Проверить, начинается ли ваша строка подстрокой “I like”. Используем
        // метод String.startsWith()
        secondCheck = text.startsWith("I like");
        System.out.println(secondCheck);

        // Проверить, содержит ли ваша строка подстроку “Java”. Используем метод
        // String.contains()
        thirdCheck = text.contains("Java");
        System.out.println(thirdCheck);

        // Найти позицию подстроки “Java” в строке “I like Java!!!”
        System.out.println(text.indexOf("Java"));

        // Заменить все символы “а” на “о”
        System.out.println(text.replace('a', 'o'));

        // Преобразуйте строку к верхнему регистру
        System.out.println(text.toUpperCase(Locale.of("I like Java!!!")));

        // Преобразуйте строку к нижнему регистру
        System.out.println(text.toLowerCase(Locale.of("I like Java!!!")));
    }
}

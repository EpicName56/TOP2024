package Homework_17_18;

public class Homework_17_18 {

    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();

    }

    static void task1() {

        // С помощью СтрингБилдера получить реверс строки (строку в обратном
        // порядке символов) и сравнить её с исходной строкой

        String text = "I like Java!";
        String reversedText = new StringBuilder(text).reverse().toString();

        System.out.println(reversedText);
        System.out.println(text.equals(reversedText));

    }

    static void task2() {

        // Анализировать посимвольно строку – сравнивать первый символ с
        // последним, второй с предпоследним и т.д

        String text = "I like Java!";
        boolean palindromCheck = true;

        for (int i = 0; i < (text.length() / 2); i++) {
            int checkStart = i;
            char c = text.charAt(checkStart);

            int checkEnd = text.length() - 1;
            char c1 = text.charAt(checkEnd);

            if (c != c1) {
                palindromCheck = false;
                break;
            }
        }
        if (palindromCheck) {
            System.out.println("Является палиндромом");
        } else {
            System.out.println("Не является палиндромом");
        }

        // надеюсь я правильно понял задание
        // просто сравнить строку как мы делали на паре
    }

    static void task3() {

        // может ли быть подобное решение второй задачи, если нам заранее известна длина строки?

        String text = "qwerty";

        System.out.println(text.charAt(0) == text.charAt(5));
        System.out.println(text.charAt(1) == text.charAt(4));
        System.out.println(text.charAt(2) == text.charAt(3));
        System.out.println(text.charAt(0) == text.charAt(4));
        System.out.println(text.charAt(2) == text.charAt(4));

        // технически так, руками, можно сравнить все символы в строке :D
    }
}

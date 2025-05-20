package Old_Homework.Homework_15_16;

public class Homework_16 {

    public static void main(String[] args) {

        // Даны строки разной длины (длина - четное число), необходимо вернуть два
        // средних знака

        String name = "String";
        int midName = name.length() / 2;

        String secondName = "Practice";
        int secondMidName = secondName.length() / 2;

        String result = name.substring(midName - 1, midName + 1);
        String secondResult = secondName.substring(secondMidName - 1, secondMidName + 1);

        System.out.println(result);
        System.out.println(secondResult);
    }
}

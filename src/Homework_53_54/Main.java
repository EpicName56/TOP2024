package Homework_53_54;

import static Homework_53_54.Methods.*;

public class Main {

    public static void main(String[] args) {

        int[] numbersMass = {1, 2, 3, 2, 1, 4};
        System.out.println(getUniqueElements(numbersMass));

        System.out.println("----------------------------------------------------------------------------------------");

        String[] words = {"apple", "banana", "apple", "cherry", "banana"};
        System.out.println(getOrderedUniqueElements(words));

        System.out.println("----------------------------------------------------------------------------------------");

        int[] numbers = {10, 20, 30, 40, 50};
        int target = 35;
        System.out.println(findClosestNumbers(numbers, target));
    }
}

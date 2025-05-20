package spring_homework_5_6;

public class Lesson_5_6 {
    public static void main(String[] args) {
        int[] arr = {-5, 0, 1, 1, 2, 3, 6, 8, 22, 45, 678};
        int[] arr2 = {-10, 2, 3, 6, 7, 7, 7, 9, 11, 1000, 1010, 1100};

        int[] mergedArray = mergeSortedArrays(arr, arr2);

        for (int n : mergedArray) {
            System.out.print(n + " ");
        }
    }

    public static int[] mergeSortedArrays(int[] first, int[] second) {
        int lengthFirst = first.length;
        int lengthSecond = second.length;
        int totalLength = lengthFirst + lengthSecond;
        int[] mergedArray = new int[totalLength];

        int indexFirst = 0;
        int indexSecond = 0;
        int currentIndex = 0;

        while (indexFirst < lengthFirst && indexSecond < lengthSecond) {
            if (first[indexFirst] <= second[indexSecond]) {
                mergedArray[currentIndex++] = first[indexFirst++];
            } else {
                mergedArray[currentIndex++] = second[indexSecond++];
            }
        }

        while (indexFirst < lengthFirst) {
            mergedArray[currentIndex++] = first[indexFirst++];
        }

        while (indexSecond < lengthSecond) {
            mergedArray[currentIndex++] = second[indexSecond++];
        }

        return mergedArray;
    }
}
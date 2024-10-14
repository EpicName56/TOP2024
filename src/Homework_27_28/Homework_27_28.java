package Homework_27_28;

import java.util.Arrays;

import static Homework_27_28.Methods.*;

public class Homework_27_28 {

    public static void main(String[] args) {

        int[][] firstColumn = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] secondColumn = {1, 2, 3, 4, 5, 6};

        matrixlArray(firstColumn);
        lineArray(firstColumn);
        elementsArray(firstColumn);
        massCopy(secondColumn);

    }
}

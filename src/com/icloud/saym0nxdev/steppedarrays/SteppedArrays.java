package com.icloud.saym0nxdev.steppedarrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SteppedArrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N (number of lines): ");
        int N = scanner.nextInt();
        System.out.print("Enter M (the maximum number of elements in the string): ");
        int M = scanner.nextInt();

        int[][] steppedArray = createSteppedArray(N, M);
        printSteppedArray(steppedArray);

        sortSteppedArray(steppedArray);
        System.out.println("Sorted array: ");
        printSteppedArray(steppedArray);

        int sum = calculateSum(steppedArray);
        System.out.println("The sum of all the elements: " + sum);

        int[] minElements = findMinElements(steppedArray);
        System.out.println("The minimum elements of each line: " + Arrays.toString(minElements));

        int absoluteMin = findAbsoluteMin(minElements);
        System.out.println("The absolute minimum: " + absoluteMin);

        if (absoluteMin != 0) {
            divideByAbsoluteMin(steppedArray, absoluteMin);
            System.out.println("Array after dividing by the absolute minimum: ");
            printSteppedArray(steppedArray);
        } else {
            System.out.println("Division by absolute minimum is not possible (absolute minimum = 0)");
        }
    }

    private static int[][] createSteppedArray(int N, int M) {
        Random random = new Random();
        int[][] steppedArray = new int[N][];
        for (int i = 0; i < N; i++) {
            steppedArray[i] = new int[random.nextInt(M)];
            for (int j = 0; j < steppedArray[i].length; j++) {
                steppedArray[i][j] = random.nextInt(100);
            }
        }
        return steppedArray;
    }

    private static void printSteppedArray(int[][] steppedArray) {
        for (int[] row : steppedArray) {
            System.out.println(Arrays.toString(row));
        }
    }

    private static void sortSteppedArray(int[][] steppedArray) {
        for (int i = 0; i < steppedArray.length; i++) {
            Arrays.sort(steppedArray[i]);
            if ((i + 1) % 2 != 0) {
                reverseArray(steppedArray[i]);
            }
        }
    }

    private static void reverseArray(int[] array) {
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    private static int calculateSum(int[][] steppedArray) {
        int sum = 0;
        for (int[] row : steppedArray) {
            for (int element : row) {
                sum += element;
            }
        }
        return sum;
    }

    private static int[] findMinElements(int[][] steppedArray) {
        int[] minElements = new int[steppedArray.length];
        for (int i = 0; i < steppedArray.length; i++) {
            if (steppedArray[i].length > 0) {
                minElements[i] = Arrays.stream(steppedArray[i]).min().getAsInt();
            }
        }
        return minElements;
    }

    private static int findAbsoluteMin(int[] minElements) {
        return Arrays.stream(minElements).min().getAsInt();
    }

    private static void divideByAbsoluteMin(int[][] steppedArray, int absoluteMin) {
        for (int i = 0; i < steppedArray.length; i++) {
            for (int j = 0; j < steppedArray[i].length; j++) {
                steppedArray[i][j] /= absoluteMin;
            }
        }
    }
}
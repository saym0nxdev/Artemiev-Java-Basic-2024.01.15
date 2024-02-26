package com.icloud.saym0nxdev.lottery;

import java.util.Arrays;
import java.util.Random;

public class Lottery {
    public static void main(String[] args) {
        int[] lotteryNumbers = generateRandomNumbers(7);
        int[] playerNumbers = generateRandomNumbers(7);

        Arrays.sort(lotteryNumbers);
        Arrays.sort(playerNumbers);

        System.out.println("The numbers that were guessed: " + Arrays.toString(lotteryNumbers));
        System.out.println("Player numbers: " + Arrays.toString(playerNumbers));

        int matchingCount = countMatchingNumbers(lotteryNumbers, playerNumbers);
        System.out.println("Number of matches: " + matchingCount);
    }

    public static int[] generateRandomNumbers(int length) {
        Random random = new Random();
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = random.nextInt(10);
        }
        return numbers;
    }

    public static int countMatchingNumbers(int[] arr1, int[] arr2) {
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == arr2[i]) {
                count++;
            }
        }
        return count;
    }
}
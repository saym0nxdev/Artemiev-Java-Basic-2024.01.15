package com.icloud.saym0nxdev.shuttlenumbers;

import java.util.ArrayList;
import java.util.List;

public class ShuttleNumbers {
    public static void main(String[] args) {
        generateShuttleNumbers(100);
    }

    public static void generateShuttleNumbers(int numberOfShuttles) {
        List<Integer> luckyNumbers = new ArrayList<>();
        int lastNumber = 0;

        while (luckyNumbers.size() < numberOfShuttles) {
            lastNumber++;
            if (isLuckyNumber(lastNumber)) {
                luckyNumbers.add(lastNumber);
            }
        }
        printLuckyNumbers(luckyNumbers);
    }

    public static boolean isLuckyNumber(int number) {
        return !String.valueOf(number).contains("4") && !String.valueOf(number).contains("9");
    }

    public static void printLuckyNumbers(List<Integer> luckyNumbers) {
        System.out.println("All lucky space shuttle numbers:");
        int counter = 0;

        for (Integer luckyNumber : luckyNumbers) {
            counter++;
            System.out.print(luckyNumber + ", ");
            if (counter > 9) {
                System.out.println();
                counter = 0;
            }
        }
    }
}
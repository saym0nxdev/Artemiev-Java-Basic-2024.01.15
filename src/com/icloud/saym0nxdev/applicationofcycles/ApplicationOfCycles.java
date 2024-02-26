package com.icloud.saym0nxdev.applicationofcycles;

import java.util.Scanner;

public class ApplicationOfCycles {

    public static class DivisibleBySum {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the starting value (A): ");
            int A = scanner.nextInt();

            System.out.print("Enter the final value (B): ");
            int B = scanner.nextInt();

            System.out.println("The result for the while loop: ");
            countDivisibleBySumWhile(A, B);

            System.out.println("The result for the do-while loop: ");
            countDivisibleBySumDoWhile(A, B);

            System.out.println("The result for for loop: ");
            countDivisibleBySumFor(A, B);
        }

        private static void countDivisibleBySumWhile(int A, int B) {
            int count = 0;
            int current = A;

            while (current <= B) {
                if (isDivisibleBySum(current)) {
                    count++;
                }
                current++;
            }

            System.out.println("The number of numbers that are completely divisible by the sum of their digits: " + count);
        }

        private static void countDivisibleBySumDoWhile(int A, int B) {
            int count = 0;
            int current = A;

            do {
                if (isDivisibleBySum(current)) {
                    count++;
                }
                current++;
            } while (current <= B);

            System.out.println("The number of numbers that are completely divisible by the sum of their digits: " + count);
        }

        private static void countDivisibleBySumFor(int A, int B) {
            int count = 0;

            for (int current = A; current <= B; current++) {
                if (isDivisibleBySum(current)) {
                    count++;
                }
            }

            System.out.println("The number of numbers that are completely divisible by the sum of their digits: " + count);
        }

        private static boolean isDivisibleBySum(int number) {
            int sum = 0;
            int temp = number;

            while (temp != 0) {
                sum += temp % 10;
                temp /= 10;
            }

            return number % sum == 0;
        }
    }
}
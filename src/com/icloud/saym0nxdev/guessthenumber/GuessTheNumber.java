package com.icloud.saym0nxdev.guessthenumber;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        int minNumber = 0;
        int maxNumber = 10;

        int randomNumber = random.nextInt(maxNumber - minNumber + 1) + minNumber;

        int attemptsLeft = 3;

        System.out.println("Guess the number from " + minNumber + " to " + maxNumber + ".");

        while (attemptsLeft > 0) {
            System.out.print("Please enter your number: ");
            int userGuess = scanner.nextInt();

            if (userGuess == randomNumber) {
                System.out.println("That's right, you guessed it!");
                break;
            } else {
                System.out.println("Wrong. There are only " + (--attemptsLeft) + " attempts left.");
            }
        }

        if (attemptsLeft == 0) {
            System.out.println("You guessed wrong. The guessed number was: " + randomNumber + ".");
        }

        scanner.close();
    }
}
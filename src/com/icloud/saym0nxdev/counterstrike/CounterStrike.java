package com.icloud.saym0nxdev.counterstrike;

import java.util.Scanner;

public class CounterStrike {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("If you want to close the program then type 'quit'!");

        String nameTerroristTeam = readNameTeam("Terrorist");

        int scoresFirstPlayerTerrorist = readPlayerScore(1, nameTerroristTeam);
        int scoresSecondPlayerTerrorist = readPlayerScore(2, nameTerroristTeam);
        int scoresThirdPlayerTerrorist = readPlayerScore(3, nameTerroristTeam);
        int scoresFourthPlayerTerrorist = readPlayerScore(4, nameTerroristTeam);
        int scoresFifthPlayerTerrorist = readPlayerScore(5, nameTerroristTeam);

        sc.nextLine();

        String namePoliceTeam = readNameTeam("Police");

        int scoresFirstPlayerPolice = readPlayerScore(1, namePoliceTeam);
        int scoresSecondPlayerPolice = readPlayerScore(2, namePoliceTeam);
        int scoresThirdPlayerPolice = readPlayerScore(3, namePoliceTeam);
        int scoresFourthPlayerPolice = readPlayerScore(4, namePoliceTeam);
        int scoresFifthPlayerPolice = readPlayerScore(5, namePoliceTeam);

        sc.close();

        double averageScoresTerroristTeam = (double) (scoresFirstPlayerTerrorist + scoresSecondPlayerTerrorist + scoresThirdPlayerTerrorist + scoresFourthPlayerTerrorist + scoresFifthPlayerTerrorist) / 5;
        double averageScoresPoliceTeam = (double) (scoresFirstPlayerPolice + scoresSecondPlayerPolice + scoresThirdPlayerPolice + scoresFourthPlayerPolice + scoresFifthPlayerPolice) / 5;

        System.out.println(averageScoresTerroristTeam);
        System.out.println(averageScoresPoliceTeam);

        if (Math.abs(averageScoresTerroristTeam - averageScoresPoliceTeam) < 0.001) {
            System.out.println("Draw!");
        } else if (averageScoresTerroristTeam > averageScoresPoliceTeam) {
            System.out.println("The winning team was " + nameTerroristTeam + " gained " + String.format("%.2f", averageScoresTerroristTeam) + " scores.");
        } else {
            System.out.println("The winning team was " + namePoliceTeam + " gained " + String.format("%.2f", averageScoresPoliceTeam) + " scores.");
        }
    }

    private static String readNameTeam(String teamName) {
        System.out.println("Enter the name of the " + teamName + " team: ");

        String input = sc.nextLine();

        checkQuit(input);

        System.out.println();

        return input;
    }

    private static int readPlayerScore(int playerNumber, String teamName) {
        int value = -1;
        boolean isValid = false;

        while (!isValid) {
            try {
                System.out.println("Enter the scores of the " + playerNumber + " player of the \"" + teamName + "\" team: "); // Використовуємо playerNumber та teamName замість prompt
                String input = sc.next();

                checkQuit(input);

                value = Integer.parseInt(input);

                if (value < 0) {
                    System.out.println();
                    System.out.println("Invalid input. Integer must be more or equal than 0!");
                } else {
                    isValid = true;
                }
            } catch (NumberFormatException e) {
                System.out.println();
                System.out.println("Invalid input. Please enter an integer.");
            }
        }
        System.out.println();
        return value;
    }

    private static void checkQuit(String input) {
        if ("quit".equalsIgnoreCase(input)) {
            System.out.println();
            System.out.println("Exiting the program...");
            System.exit(0);
        }
    }
}
package com.icloud.saym0nxdev.rugby;

import java.util.Random;

public class Rugby {
    public static void main(String[] args) {
        int numOfPlayers = 25;

        int minAge = 18;
        int maxAge = 40;

        int[] firstTeamAges = new int[numOfPlayers];
        int[] SecondTeamAges = new int[numOfPlayers];

        Random random = new Random();
        for (int i = 0; i < numOfPlayers; i++) {
            firstTeamAges[i] = random.nextInt(maxAge - minAge + 1) + minAge;
            SecondTeamAges[i] = random.nextInt(maxAge - minAge + 1) + minAge;
        }

        System.out.println("Age of players in team 1: ");
        for (int age : firstTeamAges) {
            System.out.print(age + " ");
        }
        System.out.println();

        System.out.println("Age of players in team 2: ");
        for (int age : SecondTeamAges) {
            System.out.print(age + " ");
        }
        System.out.println();

        double team1AverageAge = calculateAverageAge(firstTeamAges);
        double team2AverageAge = calculateAverageAge(SecondTeamAges);

        System.out.println("Average age of team 1 players: " + team1AverageAge);
        System.out.println("Average age of team 2 players: " + team2AverageAge);
    }

    private static double calculateAverageAge(int[] ages) {
        int sum = 0;
        for (int age : ages) {
            sum += age;
        }
        return (double) sum / ages.length;
    }
}
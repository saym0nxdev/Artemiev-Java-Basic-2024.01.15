package com.icloud.saym0nxdev.transposematrices;

import java.util.Scanner;

public class TransposeMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number of lines (M): ");
        int M = scanner.nextInt();
        System.out.print("Enter the number of columns (N): ");
        int N = scanner.nextInt();

        int[][] matrix = new int[M][N];

        System.out.println("Enter the elements of the matrix: ");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.printf("Element [%d][%d]: ", i, j);
                matrix[i][j] = scanner.nextInt();
            }
        }

        int[][] transposedMatrix = transposeMatrix(matrix);

        System.out.println("Original matrix: ");
        printMatrix(matrix);

        System.out.println("Transposed matrix: ");
        printMatrix(transposedMatrix);

        scanner.close();
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int M = matrix.length;
        int N = matrix[0].length;
        int[][] transposedMatrix = new int[N][M];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        return transposedMatrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
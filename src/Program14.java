//Lab Program 14 -Write a program to perform the matrix addition & multiplication by allocation memory for an array dynamically

import java.util.Scanner;

public class Program14 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input dimensions of matrices
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        // Dynamic memory allocation for matrices
        int[][] matrixA = new int[rows][cols];
        int[][] matrixB = new int[rows][cols];
        int[][] sumMatrix = new int[rows][cols];

        // Input elements for Matrix A
        System.out.println("Enter elements of Matrix A:");
        inputMatrix(matrixA, sc);

        // Input elements for Matrix B
        System.out.println("Enter elements of Matrix B:");
        inputMatrix(matrixB, sc);

        // Performing Matrix Addition
        matrixAddition(matrixA, matrixB, sumMatrix);
        
        // Displaying the sum matrix
        System.out.println("Matrix Addition Result:");
        displayMatrix(sumMatrix);

        // Performing Matrix Multiplication (Only if valid)
        if (rows == cols) { // Ensuring multiplication is possible
            int[][] productMatrix = new int[rows][cols];
            matrixMultiplication(matrixA, matrixB, productMatrix);

            // Displaying the product matrix
            System.out.println("Matrix Multiplication Result:");
            displayMatrix(productMatrix);
        } else {
            System.out.println("Matrix multiplication is not possible for non-square matrices.");
        }

        sc.close();
    }

    // Method to input matrix elements
    public static void inputMatrix(int[][] matrix, Scanner sc) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    // Method for matrix addition
    public static void matrixAddition(int[][] A, int[][] B, int[][] result) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
    }

    // Method for matrix multiplication
    public static void matrixMultiplication(int[][] A, int[][] B, int[][] result) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
    }

    // Method to display matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}

package Session5;

import java.util.Random;
import java.util.Scanner;

public class MatrixSearch {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 500; i++) {
//            System.out.print(r.nextInt(20) + " ");
        }
        System.out.println();
    int[][] matrix = new int[4][4];
//        Random r = new Random();

        // Fill the matrix with random integers
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = r.nextInt(500); // Random integers between 0 and 20
            }
        }

        // Print the matrix
        System.out.println("Generated 4x4 matrix:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Ask user to provide a number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to search for in the matrix: ");
        int searchValue = scanner.nextInt();

        // Search for the number in the matrix and replace with -10
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matrix[i][j] == searchValue) {
                    matrix[i][j] = -10;
                }
            }
        }

        // Print the resulting matrix
        System.out.println("Resulting matrix:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();

        // Check if the number was found in the matrix or not found at all
        boolean found = false;
        if (!found) {
            System.out.println("Number not found in the matrix");
        }
    }
}
//Create method to print the matrix
//Calculate sum of all numbers in matrix
//Calculate sum for each column
//Create another matrix where rows will be columns of the original one
//
//Create a matrix of size 4x4 using Random
//Print result
//
//Ask user to provide a number
//Search for that number in matrix and replace with -10
//Print resulting matrix
//
//If number was not found show message "Number not found in the matrix"



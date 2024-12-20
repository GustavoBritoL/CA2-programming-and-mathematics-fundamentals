/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
// Link GitHub Bellow:
//https://github.com/GustavoBritoL/CA2-programming-and-mathematics-fundamentals

package ca2.diagonal.sum.matrix;
import java.util.Scanner;

/**
 *
 * @author gustavobrito22icloud.com
 */
public class CA2DiagonalSumMatrix {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        try ( 
                Scanner scanner = new Scanner(System.in)) {
            // Input size of the matrix
            System.out.print("Enter size of matrix: "); 
            int size = scanner.nextInt(); // Read the size of the square matrix entered by the user.
            
            // Initialize the matrix
            int[][] matrix = new int[size][size];
            
            // Input elements of the matrix row by row
            System.out.println("Enter elements row by row:");
            for (int i = 0; i < size; i++) { // outer loop rows 
                for (int j = 0; j < size; j++) { // inner loop columuns 
                    matrix[i][j] = scanner.nextInt(); // Read input and assign to matrix
                }
            }
            
            // Calculate the sums of the diagonals
            int mainDiagonalSum = 0; // interger variable to store sum o main diagonal 
            int secondaryDiagonalSum = 0; // interger variable to store sum o secondary diagonal
            
            for (int i = 0; i < size; i++ ) {  
                mainDiagonalSum += matrix[i][i]; // Main diagonal element
                secondaryDiagonalSum += matrix[i][size - i - 1]; // Secondary diagonal element
            }

            // Print the results
            System.out.println("Matrix:");
            for (int i = 0; i < size; i++) { // Loop through each row of the matrix
                for (int j = 0; j < size; j++) { // Loop through each column of the current row
                    System.out.print(matrix[i][j] + " "); // Print the element at position [i][j] in the matrix

                }
                System.out.println(); // Move to the next line after printing all columns of the current row
            }
            
            // Print the sum of the main diagonal elements
            System.out.println("Sum of main diagonal: " + mainDiagonalSum);
            
            // Print the sum of the secondary diagonal elements
            System.out.println("Sum of secondary diagonal: " + secondaryDiagonalSum);
        }
    }
    
}

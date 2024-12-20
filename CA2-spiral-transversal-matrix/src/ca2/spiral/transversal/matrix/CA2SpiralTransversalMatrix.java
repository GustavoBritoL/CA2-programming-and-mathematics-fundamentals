/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ca2.spiral.transversal.matrix;
import java.util.Scanner;

/**
 *
 * @author gustavobrito22icloud.com
 */
public class CA2SpiralTransversalMatrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of rows and columns for the matrix
        System.out.print("Enter rows and columns of matrix: ");
        int rows = scanner.nextInt(); // Read number of rows
        int cols = scanner.nextInt(); // Read number of columns

        int[][] matrix = new int[rows][cols]; // Initialize the matrix with given dimensions

        // Input elements of the matrix
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < rows; i++) { // Loop through each row
            for (int j = 0; j < cols; j++) { // Loop through each column
                matrix[i][j] = scanner.nextInt();  // Read matrix element
            }
        }

        // Perform spiral traversal
        System.out.print("Spiral Traversal: ");
        spiralTraversal(matrix, rows, cols);
    }
    
    // Method to perform spiral traversal of the given matrix 
    private static void spiralTraversal(int[][] matrix, int rows, int cols) {
        int top = 0;// 1 // Initialize the top boundary
        int bottom = rows - 1; // Initialize the bottom boundary
        int left = 0; // Initialize the left boundary
        int right = cols - 1; // -1// Initialize the right boundary

        // Continue traversal while the boundaries are valid
        while (top <= bottom && left <= right) {
            
            // Traverse from left to right on the top row
            for (int i = left; i <= right; i++) { 
                System.out.print(matrix[top][i] + " ");
            }
            top++; // Move the top boundary down

            // Traverse from top to bottom on the right column
            for (int i = top; i <= bottom; i++) { 
                System.out.print(matrix[i][right] + " ");
            }
            right--; // Move the right boundary left

            // Traverse from right to left on the bottom row (if rows remain)
            for (int i = right; i >= left; i--) {
                System.out.print(matrix[bottom][i] + " ");
            }
            bottom--; // Move the bottom boundary up

            // Traverse from bottom to top on the left column (if columns remain)
            for (int i = bottom; i >= top; i--) {
                System.out.print(matrix[i][left] + " ");
            }
            left++; // Move the left boundary right
        }
    }
    
}

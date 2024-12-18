/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ca2.multiplicationt.table;
import java.util.Scanner; // importing snanner class

/**
 *
 * @author gustavobrito22icloud.com
 */
public class CA2MultiplicationtTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Try method statement closes the Scanner after use
        try ( 
                Scanner scanner = new Scanner(System.in)) {
            // Prompt user to enter the size of the multiplication table
            System.out.print("Enter size of multiplication table: ");
            
            // Read the size as an integer from user input
            int size = scanner.nextInt();
            
            // Initialize a 2D array for the multiplication table
            int[][] table = new int[size][size];
            
             // Populate the 2D array with multiplication values
            // Outer loop from 1 to 'size' for the first dimension
            for (int i = 1; i <= size; i++) {
                // Inner loop from 1 to 'size' for the second dimension
                for (int j = 1; j <= size; j++) {
                    // Calculate multiplication and store in the array
                   // (i - 1) and (j - 1) because array indices start at 0, but our loops start at 1
                    table[i - 1][j - 1] = i * j;
                }
            }   

            // Display the multiplication table in matrix form
            System.out.println("Multiplication Table:");
            
            // Loop through each row of the table
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    // Print each element followed by a tab character for spacing
                    System.out.print(table[i][j] + "\t");
                }
                // Move to the next line after printing one row
                System.out.println();
            }
            // Scanner will be automatically closed here
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
// GitHub repository link below:
// https://github.com/GustavoBritoL/CA2-programming-and-mathematics-fundamentals

package ca2.javaapplication;
import java.util.HashSet;// This imports the HashSet class, which is used to store unique elements and perform fast lookups to check for duplicates
import java.util.Scanner;// This imports the Scanner class, which is used to read user input from the console.

/**
 *
 * @author gustavobrito22icloud.com
 */
public class CA2JavaApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {// This initializes a Scanner object to read user input and ensures it is automatically closed after use due to the try-with-resources statement
            // Step 1: Get the size of the array
            System.out.print("Enter the size of the array: "); // Prompt the user to input the size of the array
            int size = scanner.nextInt();// Read the size of the array as an integer input from the user
            // Step 2: Get the elements of the array
            int[] array = new int[size]; // Initialize the array to hold the input elements
            System.out.print("Enter the elements of the array: ");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }   // Step 3: Find the first repeated element
            HashSet<Integer> seen = new HashSet<>(); // This HashSet is used to track elements already encountered in the array
            int firstRepeated = -1; // Sentinel value to indicate no repeated element found
            for (int i = 0; i < size; i++) {
                if (seen.contains(array[i])) { // Check if the current element has already been seen
                    firstRepeated = array[i]; // Assign the first repeated element and break the loop
                    break;
                }
                seen.add(array[i]);
            }   // Step 4: Output the result
            if (firstRepeated != -1) {
                System.out.println("The first repeated element is: " + firstRepeated);
            } else {
                System.out.println("No repeated elements found.");
            }
        } 
    }
    
}

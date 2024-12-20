/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
// Link GitHub Bellow:
//https://github.com/GustavoBritoL/CA2-programming-and-mathematics-fundamentals

package ca2.bubble.sort.array;
import java.util.Scanner; // importing Scanner class

/**
 *
 * @author gustavobrito22icloud.com
 */
public class CA2BubbleSortArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input from the user

        // Step 1: Accept the size of the array
        System.out.print("Enter the size of the array: "); // Prompt user to enter array size
        int size = scanner.nextInt(); // Read the size of the array

        // Initialize the array
        int[] array = new int[size]; // Create an array of the specified size

        // Step 2: Accept the elements of the array
        System.out.println("Enter the elements of the array: "); // Prompt user to enter array elements
        for (int i = 0; i < size; i++) { // Loop through each index of the array
            array[i] = scanner.nextInt(); // Read and store each element in the array
        }

        // Display the array before sorting
        System.out.println("Array before sorting: "); // Inform the user the array will be displayed
        displayArray(array); // Call the method to print the array

        // Perform Bubble Sort and count swaps
        int totalSwaps = bubbleSort(array); // Call the sorting method and store the total swaps

        // Display the array after sorting
        System.out.println("Array after sorting: "); // Inform the user the sorted array will be displayed
        displayArray(array); // Call the method to print the sorted array

        // Display the total number of swaps performed
        System.out.println("Total swaps performed: " + totalSwaps); // Print the total swap count
    }
    
    // Method to perform Bubble Sort and return the total number of swaps
    private static int bubbleSort(int[] array) {
        int n = array.length; // Store the length of the array
        int swapCount = 0; // Initialize a counter to track the number of swaps

        // Outer loop for each pass through the array
        for (int i = 0; i < n - 1; i++) {
            // Inner loop to compare adjacent elements
            for (int j = 0; j < n - i - 1; j++) {
                // Check if the current element is greater than the next element
                if (array[j] > array[j + 1]) {
                    // Swap the elements if they are in the wrong order
                    int temp = array[j]; // Store the current element in a temporary variable
                    array[j] = array[j + 1]; // Assign the next element to the current position
                    array[j + 1] = temp; // Assign the temporary variable to the next position

                    swapCount++; // Increment the swap counter
                }
            }
        }
        return swapCount; // Return the total number of swaps
    }

    // Method to display the elements of the array
    private static void displayArray(int[] array) {
        for (int num : array) { // Loop through each element in the array
            System.out.print(num + " "); // Print each element followed by a space
        }
        System.out.println(); // Move to the next line after printing all elements
    }

    
}

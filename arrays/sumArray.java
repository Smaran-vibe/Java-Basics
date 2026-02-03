package arrays;

import java.util.Scanner;
public class sumArray {
    public static void main(String[] args) {

        // Create double array
        double[] numbers = {13.55, 81.19, 31.6, -44.8};

        // Initial total
        double total = 0;

        // Access array elements using the for loop
        for (int index = 0; index < 4; ++index) {
            // Add each element to total
            total = total + numbers[index];
        }

        // Print total
        System.out.println("Total: " + total);
    }
}


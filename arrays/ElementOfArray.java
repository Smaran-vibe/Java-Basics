package arrays;

import java.util.Scanner;
public class ElementOfArray {


        public static void main(String[] args) {

            // Create integer array
            int[] primeNumber = {2, 3, 5, 7};

            // Get integer input
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the prime number: ");
            int number = input.nextInt();

            // Assign number to the fourth element of primeNumber
            primeNumber[3] = number;

            // Print array elements
            for (int i = 0 ;i<4;i++) {
                System.out.println(primeNumber[i]);
            }

            input.close();
        }
    }


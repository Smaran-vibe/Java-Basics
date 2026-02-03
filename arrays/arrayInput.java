package arrays;

import java.util.Scanner;
public class arrayInput {


        public static void main(String[] args) {

            // Create object of Scanner
            Scanner input = new Scanner(System.in);

            int[] numbers = new int[4];

            System.out.println("Enter Array Elements: ");
            for (int i = 0; i < numbers.length; ++i) {
                numbers[i] = input.nextInt();
            }

            // Access array elements
            System.out.println("Array Elements:");
            for (int i = 0; i < numbers.length; ++i) {
                System.out.println(numbers[i]);
            }

            input.close();
        }
    }

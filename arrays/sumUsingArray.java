package arrays;
import java.util.Scanner;

public class sumUsingArray {


        public static void main(String[] args) {

            // Create object of Scanner
            Scanner input = new Scanner(System.in);

            int[] numbers = new int[5];

            System.out.println("Enter Array Elements:");
            for (int index = 0; index < numbers.length; ++index) {
                numbers[index] = input.nextInt();
            }

            int total = 0;

            // Add all array elements
            for (int index = 0; index < numbers.length; ++index) {
                total = total + numbers[index];
            }
            double average = total / numbers.length;

            System.out.println("Average: "+average);
            System.out.println("Sum: " + total);

            input.close();
        }
    }

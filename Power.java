import java.util.Scanner;


public class Power {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            // get input value for number and power
            System.out.println("Enter the number: ");
            int number = input.nextInt();

            System.out.println("Enter the power of number: ");
            int power = input.nextInt();

            // variable to store the power of number
            int result = 1;

            // run a loop from 1 to power
            for (int i = 1; i <= power ; i++) {

                // inside the loop multiply number with result
                result = number * result;
            }

            // print the result
            System.out.println("The result is: " +result);

            input.close();
        }
    }


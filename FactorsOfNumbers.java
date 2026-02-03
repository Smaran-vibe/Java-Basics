import java.util.Scanner;

public class FactorsOfNumbers {

        public static void main(String[] args) {


            Scanner input = new Scanner(System.in);

            System.out.println("Enter the number: ");
            int number = input.nextInt();

            // run a loop from i = 1 to i < number
            for (int i=1; i<number; i++) {

                // check if number is divisible by i
                if (number%i==0) {
                    System.out.println(i);
                }
            }

            input.close();
        }
    }


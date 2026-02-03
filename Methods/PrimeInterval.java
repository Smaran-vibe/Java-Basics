package Methods;

import java.util.Scanner;
public class PrimeInterval {

    boolean CheckPrime(int number) {

        if (number <= 1) {

            return false;

        }

        for (int i = 2; i <= number - 1; ++i) {
            if (number % i == 0) {

                return false;

            }
        }
        return true;


    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = input.nextInt();

        PrimeInterval pri = new PrimeInterval();

                System.out.println("The Prime number between "+ num1+ " and " +num2+ " is: ");
        for (int i = num1; i <= num2; ++i) {


            boolean result = pri.CheckPrime(i);


            if (result == true) {

                System.out.println(i+" ");


            }
        }
        input.close();
    }
}

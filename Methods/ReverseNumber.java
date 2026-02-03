package Methods;

import java.util.Scanner;
public class ReverseNumber {

    int reversenumber(int number) {
        int reversed = 0;
        int remainder;

        while (number != 0) {

            remainder = number % 10;

            reversed = (reversed * 10) + remainder;

            number = number / 10;

        }
        return reversed;

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number to be reversed: ");
        int num = scanner.nextInt();

        ReverseNumber obj = new ReverseNumber();

        int result =  obj.reversenumber(num);

        System.out.println("The reversed number is: "+result);

        scanner.close();

    }
}



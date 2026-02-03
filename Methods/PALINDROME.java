package Methods;

import java.util.Scanner;
public class PALINDROME {

    int checkNumbers(int number){

        int original_number = number;
        int reversed_number = 0;

        int remainder;

        while(number!= 0){

            remainder = number % 10;

            reversed_number = (reversed_number * 10) + remainder;

            number = number / 10;

        }
        if (original_number == reversed_number){
            System.out.println("The number is palindrome.");

        }else{
            System.out.println("The number is not palindrome.");
        }
       return reversed_number;
    }

    public static void main(String[] args ) {

        Scanner scanner = new Scanner(System.in);

        PALINDROME pal = new PALINDROME();

        System.out.println("Enter the number.");
        int num = scanner.nextInt();

       pal.checkNumbers(num);






        scanner.close();

    }
}





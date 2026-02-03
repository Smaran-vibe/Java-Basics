import java.util.Scanner;
public class HarshadNumber {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = input.nextInt();

         int number = num;

        int sum = 0;

        while (number!=0){

            int digit = number % 10;

            sum = sum + digit;

            number = number / 10;


        }
        if (num % sum ==0){

        System.out.println("The number is harshad number.");
        }
        else{
            System.out.println("The number is not harshad number.");
        }

        input.close();

    }
}

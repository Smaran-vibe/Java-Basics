import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int original_number = input.nextInt();

        int number = original_number;

        int sum = 0;

        int remainder;

        while (number!=0){

            // use originalNumber % 10 to get the last digit
            remainder = number % 10;

            // add the cube of the last digit to sum
            sum = sum + remainder * remainder * remainder;

            // use originalNumber / 10 to change the value of originalNumber

            number = number/10;

        }
        if (sum == original_number){
            System.out.println("The number is armstrong number.");
        }
        else {
            System.out.println("The number is not armstrong.");

        }
        input.close();
    }

}

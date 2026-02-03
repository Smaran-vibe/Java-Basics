import java.util.Scanner;
public class SumOFallDigitsOfNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = input.nextInt();

        int digit;

        int sum = 0;

        while (num != 0) {
            digit = num % 10;
            sum = digit + sum;
            num = num / 10;

        }
        System.out.println("The sum is: " + sum);

        input.close();
    }
}

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int count = 0;

        // Handle negative numbers
        if (number < 0) {
            number = -number;
        }

        // Special case for 0
        if (number == 0) {
            count = 1;
        } else {
            while (number != 0) {
                number = number / 10;  // remove last digit
                count++;
            }
        }

        System.out.println("Number of digits: " + count);

        input.close();
    }
}



package arrays;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ComparingArrayElement {
    public static void main() {

        int numbers[] = new int[6];

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 6 numbers: ");
        for (int i = 0; i < numbers.length; ++i) {
            numbers[i] = input.nextInt();
        }

        int first_number = numbers[0];
        int last_number = numbers[numbers.length - 1];

        if (first_number == last_number) {
            System.out.println("The number is equal ");

        } else {
            System.out.println("The number is not equal.");
        }
            input.close();

    }
}

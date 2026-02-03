package arrays;

import java.util.Scanner;
public class onlyEvenNumbers {
    public static void main() {

        Scanner input = new Scanner(System.in);

        int numbers[] = new int[10];

        System.out.println("Enter the number: ");
        for (int i= 0; i<= numbers.length - 1; ++i) {
            numbers[i] = input.nextInt();
        }
        for (int i= 0;i<= numbers.length - 1;++i){
        if (numbers[i] % 2 == 0){
            System.out.println("The even numbers are:  " +numbers[i]);
        }
        }
        input.close();
    }
}

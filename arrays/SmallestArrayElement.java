package arrays;

import java.util.Scanner;
public class SmallestArrayElement {
    public static void main() {

        Scanner input = new Scanner(System.in);

        int numbers[] = new int[5];

        System.out.println("Enter the numbers: ");
        for (int i = 0; i< numbers.length ;++i){
            numbers[i] = input.nextInt();
        }
        int smallest = numbers[0];
        for (int i=1;i< numbers.length; ++i){
            if (smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("The smallest number is: "+smallest);

        input.close();
    }
}

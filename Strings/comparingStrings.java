package Strings;

import java.util.Scanner;
public class comparingStrings {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
        System.out.println("Enter the first String: ");
        String first = input.nextLine();

        System.out.println("Enter the second String: ");
        String second = input.nextLine();

        if (first == second){
            System.out.println("The string is equal.");
        }
        else{
            System.out.println("The string is not equal.");
        }
        input.close();
    }



}

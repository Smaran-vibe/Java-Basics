package Strings;

import java.util.Scanner;
public class StringConcatenation {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter the First Name: ");
        String firstName = input.nextLine();

        System.out.println("Enter the Second Name: ");
        String lastName = input.nextLine();

        String joinedString = firstName.concat(" ").concat(lastName);

        System.out.println(joinedString);

        input.close();
    }
}


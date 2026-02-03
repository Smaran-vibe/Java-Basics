package Strings;

import java.util.Scanner;

public class FindLongerString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the text1: ");
        String text1 = sc.nextLine();
        int length = text1.length();

        System.out.println("Enter the text2: ");
        String text2 = sc.nextLine();
        int length1 = text2.length();

        if (length > length1) {
            System.out.println("The text1 is greater.");
        } else {
            System.out.println("The text2 is greater.");
        }

        sc.close();


    }
}

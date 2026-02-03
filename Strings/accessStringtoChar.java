package Strings;

import java.util.Scanner;

public class accessStringtoChar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text: ");
        String txt = sc.nextLine();

        for (int i = 0; i < txt.length(); ++i) {

            char ch = txt.charAt(i);

            System.out.println("The character of the letter are: " + ch);
        }
        sc.close();

    }
}

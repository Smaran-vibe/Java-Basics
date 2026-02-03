package Strings;

import java.util.Scanner;
public class AccessAcharacter {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            // Get String input
            System.out.println("Enter the text: ");
            String text = input.nextLine();
            int length = text.length();

            // Find the last character of the string
            char last = text.charAt(length-1);
            System.out.println("The last text of the text " +text+ " is " +last);

            input.close();
        }
    }


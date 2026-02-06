package Strings;

import java.util.Scanner;
public class firs_letter_to_uppercase {

        public static void main(String[] args) {


            Scanner input = new Scanner(System.in);

            System.out.println("Enter the text: ");
            String text = input.nextLine();

            // use substring() to split the input string to two strings
            // first substring contains the first letter
            // hint: to access first letter, use indexes 0 and 1
            String firstLetter = text.substring(0,1);

            // second substring contains the remaining letters
            // hint: to use remaining letters, use indexes 1 and string.length()
            String remainingLetters = text.substring(1);

            // change the first letter to uppercase
            firstLetter = firstLetter.toUpperCase();

            // join the two substrings
            text = firstLetter + remainingLetters;
            System.out.println(text);

            input.close();
        }
    }


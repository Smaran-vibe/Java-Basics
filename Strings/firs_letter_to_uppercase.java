package Strings;

import java.util.Scanner;
public class firs_letter_to_uppercase {

        public static void main(String[] args) {


            Scanner input = new Scanner(System.in);

            System.out.println("Enter the text: ");
            String text = input.nextLine();


            String firstLetter = text.substring(0,1);


            String remainingLetters = text.substring(1);


            firstLetter = firstLetter.toUpperCase();


            text = firstLetter + remainingLetters;
            System.out.println(text);

            input.close();
        }
    }


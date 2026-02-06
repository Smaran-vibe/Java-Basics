package Strings;

import java.util.Scanner;
public class NonAlphabetCharacters {

     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

         System.out.println("Enter the text: ");
         String text = input.nextLine();

         for (int i = 0 ; i < text.length() ; i++ ) {

             // access each character using charAt()
             char x = text.charAt(i);


             if (x >= 'a' && x <='z' || x >='A' && x <= 'Z') {

                 // if true, skip the current iteration of loop
                 continue;
             }


             System.out.println("The non character thing is: " +x);
         }

         input.close();
     }
}




package Strings;

import java.util.Scanner;

public class countVowels {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the text: ");
        String text = scanner.nextLine();

        String lower = text.toLowerCase();
        System.out.println("The text is: " + lower);

        int count = 0;

        for (int i = 0; i < text.length(); ++i) {

            char ch = text.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }

        }

        System.out.println("The total count of the vowel letter is: " + count);
        scanner.close();


    }
}

package Strings;

public class replaceString {
    public static void main(String[] args) {
        String str1 = "Fool Mouse";

        System.out.println("Before: " + str1);

        // Replace F with W
        String str2 = str1.replace('F', 'W');

        // Replace M with H
        str2 = str2.replace('M', 'H');

        System.out.println("After: " + str2);
        String str3 = "Fool Mouse";

        System.out.println("Before: " + str1);

        // Replace "Fool Mouse" with "Wool House"
        String str4 = str1.replace("Fool Mouse", "Cool House");

        System.out.println("After: " + str4);

        String text = "I LOVE JAVA PROGRAMMING";

        // Convert text string to lowercase
        String lower = text.toLowerCase();
        System.out.println(lower);

        // Convert lowercase string to uppercase
        String upper = lower.toUpperCase();
        System.out.println(upper);
    }
}

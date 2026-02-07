package Strings;

import java.util.Scanner;

public class nested_loop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of the University: ");
        String uni = sc.nextLine();


        System.out.println("Enter the marks of student: ");
        int marks = sc.nextInt();

        if (uni.equals("East Blue University")) {

            if (marks >= 80) {
                System.out.println("The student is pass.");
            } else {
                System.out.println("The student is fail.");
            }
        } else {

            if (marks >= 40) {
                System.out.println("The student is pass.");
            } else {
                System.out.println("The student is fail.");
            }
        }
        sc.close();

    }


}

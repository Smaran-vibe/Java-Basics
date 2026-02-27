package OOPS;

import java.util.Scanner;

class Calculator {
    static String Name = "Calculator";

    static int add(int n1, int n2) {

        return n1 + n2;


    }


}

public class staTic_Calc {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(Calculator.Name);
        System.out.println("Enter the two numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        System.out.println("The total sum is: " + Calculator.add(n1, n2));

        sc.close();
    }
}

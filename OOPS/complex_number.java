package OOPS;

import java.util.Scanner;

public class complex_number {

    int real_number;
    double imag_number;

    complex_number(int real_number, double imag_number) {

        this.real_number = real_number;
        this.imag_number = imag_number;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the real number: ");
        int n1 = sc.nextInt();

        System.out.println("Enter the second  number: ");
        double n2 = sc.nextDouble();

        System.out.println("Enter the third number: ");
        int n3 = sc.nextInt();

        System.out.println("Enter the fourth real number: ");
        double n4 = sc.nextDouble();

        complex_number c1 = new complex_number(n1, n2);

        complex_number c2 = new complex_number(n3, n4);

        double realSum = c1.real_number + c2.real_number;

        double imagSum = c1.imag_number + c2.imag_number;

        System.out.println("The complex number is: " + realSum + " + " + imagSum + "i");

        sc.close();


    }
}

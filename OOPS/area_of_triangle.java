package OOPS;

import java.util.Scanner;

public class area_of_triangle {

    class Triangle {
        int base;
        int height;

        Triangle(int base, int height) {
            this.base = base;
            this.height = height;
        }

        double compute_area() {

            double area = 0.5 * (base * height);

            return area;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        area_of_triangle obj = new area_of_triangle();

        System.out.println("Enter the base: ");
        int b = sc.nextInt();

        System.out.println("Enter the height: ");
        int h = sc.nextInt();

        Triangle traingle = obj.new Triangle(b, h);

        traingle.compute_area();

        System.out.println("The area of triangle is: " + traingle.compute_area());

        sc.close();


    }
}

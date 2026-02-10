package OOPS;

import java.util.Scanner;

interface polygon {

    abstract public void getarea(double base , double height );

}

class triangle implements polygon {

    public void getarea(double base, double height){

        double area = 0.5 * base * height;
        System.out.println("The Area is: " +area);
    }
}
public class int_AreaOfTriangle {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    triangle triangle = new triangle();

        System.out.println("Enter the base: ");
        double b = sc.nextDouble();

        System.out.println("Enter the height: ");
        double h = sc.nextDouble();

        triangle.getarea(b,h);

        sc.close();

    }
}


package Methods;

import java.util.Scanner;
public class CircleArea {

    public double AreaofCircle(double pi,double r ){

        double area = pi * r * r;

        return area;


    }

    public static void main() {

        Scanner input = new Scanner(System.in);
        double pi = 3.14;

        System.out.println("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        CircleArea obj = new CircleArea();

        double area = obj.AreaofCircle(pi,radius);

        System.out.println("The area of circle is: " +area);

        input.close();




    }


}

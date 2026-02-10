package OOPS;

import java.util.Scanner;

interface Polygon {
    // abstract method
    abstract public void getArea(int length, int breadth);
}

class Rectangle implements Polygon {

    // implement abstract method
    public void getArea(int length, int breadth) {
        int area = length * breadth;
        System.out.println("Area: " + area);
    }
}


public class int_area_of_Rectangle {
    public static void main(String[] args) {

        Rectangle rect1 = new Rectangle();

        // get length and breadth input for rectangle
        System.out.println("Enter length and breadth:");
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        int breadth = input.nextInt();

        // find the area of rectangle
        rect1.getArea(length, breadth);
    }
}

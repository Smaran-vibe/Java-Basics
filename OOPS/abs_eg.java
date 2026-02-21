package OOPS;

import java.util.Scanner;


abstract class poly_gon {
    abstract public void calculateArea();
}


class rectangle extends poly_gon {
    int length;
    int breadth;


    rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }


    public void calculateArea() {
        int area = length * breadth;
        System.out.println("The area of rectangle is: " +area);
    }

}

class abs_eg {
    public static void main(String[] args) {

        // get input value for length and breadth
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int length = input.nextInt();

        System.out.println("Enter the breadth: ");
        int breadth = input.nextInt();


        rectangle rect = new rectangle(length, breadth);


        rect.calculateArea();

        input.close();
    }
}


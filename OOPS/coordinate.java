package OOPS;

import java.util.Scanner;

public class coordinate {

    class Coordinate {

        // fields to store coordinates
        int x;
        int y;

        // constructor to initialize value of x and y

        Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get input values fo 4 coordinates
        System.out.println("Enter the coordinate for x1: ");
        int x1 = input.nextInt();

        System.out.println("Enter the coordinate for y1: ");
        int y1 = input.nextInt();

        System.out.println("Enter the coordinate for x2: ");
        int x2 = input.nextInt();

        System.out.println("Enter the coordinate for y2: ");
        int y2 = input.nextInt();

        coordinate obj = new coordinate();

        // create an object of Coordinate with arguments x1 and y1
        Coordinate c1 = obj.new Coordinate(x1, y1);

        // create another object of Coordinate with arguments x2 and y2
        Coordinate c2 = obj.new Coordinate(x2, y2);


        int xDiff = c1.x - c2.x;


        int yDiff = c1.y - c2.y;


        System.out.println("The difference for x-coordinate is: " + xDiff);
        System.out.println("The difference for y-coordinate is: " + yDiff);

        input.close();
    }
}


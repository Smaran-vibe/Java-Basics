package Methods;

class Area {

    // Calculate area of Rectangle
    void computeArea(double length, double breadth) {
        double area = length * breadth;
        System.out.println("Rectangle Area: " + area);
    }

    // Compute area of Square
    void computeArea(double length) {
        double area = Math.pow(length, 2);
        System.out.println("Square Area: " + area);
    }
}

public class cmpt_area {
    public static void main(String[] args) {
        Area a1 = new Area();


        a1.computeArea(2, 3);


        a1.computeArea(3);
    }
}


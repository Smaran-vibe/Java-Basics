package arrays;

public class findSquare {

        void Square(int number) {
            int result = number * number;
            System.out.println("Square of " + number + " is " + result);
        }

        public static void main(String[] args) {

            // Creating object of Main class
            findSquare obj = new findSquare();

            // Method call
            obj.Square(12);
            obj.Square(8);
            obj.Square(21);
        }
    }


package OOPS;



import java.util.Scanner;


class Sqr {


    private int length;


    public void setLength(int length) {

        if (length>0){
            this.length = length;
        }


        else{
            System.out.println("Length of a square cannot be less than 0.");
        }
    }


    public void calculateArea(){
        int area = length * length;
        System.out.println("The area of square is: " +area);
    }
}

class square {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the square: ");
        if (input.hasNextInt()) {
            int length = input.nextInt();


            Sqr s = new Sqr();


            s.setLength(length);


            s.calculateArea();
        }

        input.close();
    }
}

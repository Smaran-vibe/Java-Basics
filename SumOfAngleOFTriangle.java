import java.util.Scanner;

public class SumOfAngleOFTriangle  {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get 3 input values for angles
        System.out.println("Enter the value for x: ");
        int x = input.nextInt();
        System.out.println("Enter the value for y: ");
        int y = input.nextInt();
        System.out.println("Enter the value for z: ");
        int z = input.nextInt();

        // find the sum of all angles
        int sum = x+y+z;

        // check if sum is equal to 180 and print either true or false
        if (sum == 180){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

        input.close();
    }
}

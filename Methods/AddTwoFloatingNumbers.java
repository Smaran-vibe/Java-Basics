package Methods;
import java.util.Scanner;
public class AddTwoFloatingNumbers {

    void addNumbers (double n1, double n2){

        double sum = n1 + n2;

        System.out.println("The sum of the numbers: "+sum);
    }

     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         System.out.println("Enter the first number: ");
        double number1 = input.nextDouble();

         System.out.println("Enter the second number: ");
        double number2 = input.nextDouble();


         AddTwoFloatingNumbers obj = new AddTwoFloatingNumbers();

         obj.addNumbers(number1,number2);


         input.close();





     }
}

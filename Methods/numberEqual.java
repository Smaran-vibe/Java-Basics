package Methods;

import java.util.Scanner;
 public class numberEqual {

    void myMethod(int num1,int num2){

        if (num1 == num2) {
            System.out.println("The argruments are eqaual.");
        } else {
            System.out.println("The arguments are not equal.");
        }
    }


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            numberEqual eqs = new numberEqual();

            System.out.println("Enter the number1.");
            int number1 = scanner.nextInt();
            System.out.println("Enter the number2.");
            int number2 = scanner.nextInt();

             eqs.myMethod(number1,number2);



            scanner.close();

        }
}

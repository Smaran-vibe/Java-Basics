package Methods;

import java.util.Scanner;
public class GCD {

    int findGCD( int num1 , int num2){
        int gcd = 1;

        for (int i = 1; i<=num1 && i<=num2; ++i){

            if (num1 % i==0 && num2 %i==0 ){
                gcd = i;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int number1 = input.nextInt();

        System.out.println("Enter the second number: ");
        int number2 = input.nextInt();

        GCD obj = new GCD();

        int gcd = obj.findGCD(number1,number2);

        System.out.println("The GCD is: "+gcd);

        input.close();

    }
}

package Methods;

import java.util.Scanner;
public class LCM {

    int findLCM (int num1,int num2){
        int lcm = Math.max(num1, num2);

        while (true){
            if (lcm% num1==0 && lcm % num2 ==0){
            return lcm;
            }
            lcm++;
        }

    }
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int number1 = input.nextInt();
        System.out.println("Enter the second number: ");
        int number2 = input.nextInt();

        System.out.println("Debug: I received this number: "+number1);
        System.out.println("Debug: I received this number: "+number2);


        LCM obj = new LCM();


        int lcm = obj.findLCM(number1,number2);

        System.out.println("The lcm of the given number is: "+lcm);

        input.close();
    }
}


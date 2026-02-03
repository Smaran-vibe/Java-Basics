package Methods;

import java.util.Scanner;
public class SelfDividingNumber {

    boolean selfdividing_no(int number){

        int num = number;
        int digit;

        while(number!=0){

            digit = number % 10;

            if (digit == 0 || num % digit != 0){
                return false;

            }
            number = number / 10;


        }
        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number = input.nextInt();

        SelfDividingNumber obj = new SelfDividingNumber();

        boolean result = obj.selfdividing_no(number);

        if (result == true){
            System.out.println("It is self dividing number.");
        }else{
            System.out.println("It is not self dividing number.");
        }

        input.close();


    }
}

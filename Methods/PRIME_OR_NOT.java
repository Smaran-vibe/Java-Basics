package Methods;

import java.util.Scanner;
public class PRIME_OR_NOT {

    int Primenumbers (int number){

        int flag = 0;

        for(int i=2;i<=number-1;++i) {

            if (number % i == 0) {
                flag = 1;
                break;
            }
        }
            if (flag == 1){
                System.out.println("The number is not a prime number.");
            }else{
                System.out.println("The number is a prime number.");
            }

     return 0;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = scanner.nextInt();

        PRIME_OR_NOT pr = new PRIME_OR_NOT();

        pr.Primenumbers(num);

        scanner.close();

    }
}

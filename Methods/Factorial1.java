package Methods;
import java.util.Scanner;
public class Factorial1 {

    int computeFactorial(int number){

        int fact = 1;

        for (int i = 1;i<=number;++i){
            fact = fact * i;


        }
        return fact;
     }
        public static void main(String[] args) {


            Factorial1 facts = new Factorial1();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number: ");
            int number = scanner.nextInt();

            int total = facts.computeFactorial(number);
            System.out.println("The total is: "+total);



         scanner.close();
         }
     }


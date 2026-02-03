import java.util.Scanner;
public class AbudantNumber {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the positive number: ");
        int number = input.nextInt();

        int sum = 0;

        for (int i=1; i<=number; ++i){
            if (number%i ==0){

                sum = sum + i;
            }
        }
            if (sum >= number){
                System.out.println(" Yay This is the Abudant number.");
            }
            else{
                System.out.println("Sorry this is not an Abudant number :(.");
            }
         input.close();
    }
}

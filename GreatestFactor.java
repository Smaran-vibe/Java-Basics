import java.util.Scanner;
public class GreatestFactor {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number = input.nextInt();



        for (int i=number-1; i>=1; --i){

            if (number%i==0){
                System.out.println("The greatest factor is: "+i);

                break;
            }
            if (number<=0){

            System.out.println("No factor found.");
            }


        }
        input.close();
    }
}

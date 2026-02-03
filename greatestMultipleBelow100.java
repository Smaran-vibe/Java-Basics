import java.util.Scanner;
public class greatestMultipleBelow100 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number = input.nextInt();

        for (int i = 100; i>= 1; --i){
            if (i%number == 0){
                System.out.println("The number is: " +i);
                break;
            }

        }
        input.close();
    }

}

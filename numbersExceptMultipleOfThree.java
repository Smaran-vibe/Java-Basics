import java.util.Scanner;
public class numbersExceptMultipleOfThree {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the positive number: ");
        int num = input.nextInt();

        for (int i=1 ;i<=num; ++i){
            if (i%3==0){
            continue;

            }
        System.out.println("The result is: "+i);
        }
        input.close();
    }
}

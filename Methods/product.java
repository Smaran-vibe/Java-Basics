package Methods;



import java.util.Scanner;
public class product {

    int getProduct (int number1,int number2){

        int product = number1 * number2;

        return product;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int numbers1 = input.nextInt();
        System.out.println("Enter the second number: ");
        int numbers2 = input.nextInt();

        product obj = new product();

       int result =  obj.getProduct(numbers1,numbers2);

        System.out.println("The product of the given number is: " +result);

        input.close();


    }
}

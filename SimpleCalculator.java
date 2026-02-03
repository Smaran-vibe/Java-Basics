import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double first = input.nextDouble();

        System.out.println("Enter the second number: ");
        double second = input.nextDouble();

        System.out.print("Enter the operator: ");
        String op = input.next();

        switch (op){

            case "+":
                System.out.println(first + second);
                break;
            case "-":
                System.out.println(first - second);
                break;
            case "*":
                System.out.println(first * second);
                break;
            case "/":
                System.out.println(first / second);
                break;

            case "%":
                System.out.println(first % second);
                break;

            default:
                System.out.println("Invalid number/ operator.");




        }
        input.close();
    }
}

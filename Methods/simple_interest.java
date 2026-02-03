package Methods;

import java.util.Scanner;
public class simple_interest {

    public double Simple_Interest(double principle,int time, double rate){

        double Interest = (principle * time * rate) / 100;

        return Interest;
    }

    public static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the principle amount: ");
        double principle = scanner.nextDouble();

        System.out.println("Enter the time: ");
        int time = scanner.nextInt();

        System.out.println("Enter the rate to calculate: ");
        double rate = scanner.nextDouble();

        simple_interest obj = new simple_interest();

        double SimpleInterest = obj.Simple_Interest(principle,time,rate);

        System.out.println("The Simple Interest is: " +SimpleInterest);

        scanner.close();

    }
}

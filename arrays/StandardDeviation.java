package arrays;

import java.util.Scanner;

public class StandardDeviation {

    double calculateSD(double data[]) {
        double sum = 0.0;

        for (int i = 0; i < data.length; i++) {
            sum = sum + data[i];

        }
        double mean = sum / data.length;

        double result = 0.0;
        for (int i = 0; i < data.length; ++i) {
            double difference = data[i] - mean;
            double squaredDifference = Math.pow(difference, 2);
            result += squaredDifference;
        }

        double variance = result / data.length;

        double StandardDeviation = Math.sqrt(variance);

        return StandardDeviation;
    }

     public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double numbers[] = new double[5];

         System.out.println("Enter the numbers: ");
         for (int num= 0; num< numbers.length; ++ num ) {
             numbers[num] = input.nextDouble();
         }
             StandardDeviation obj = new StandardDeviation();
             double sd = obj.calculateSD (numbers);

             System.out.println("Standard deviation is: "+sd);




input.close();




    }

}

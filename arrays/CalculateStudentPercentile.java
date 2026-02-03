package arrays;
import java.util.Scanner;

public class CalculateStudentPercentile {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int totalPossibleMarks = 800;


        double[] marks1 = new double[8];
        double sum1 = 0;
        System.out.println("Enter 8 marks for Student 1:");
        for (int i = 0; i < marks1.length; i++) {
            marks1[i] = input.nextDouble();
            sum1 += marks1[i];
        }
        double percent1 = (sum1 / totalPossibleMarks) * 100;


        double[] marks2 = new double[8];
        double sum2 = 0;
        System.out.println("Enter 8 marks for Student 2:");
        for (int i = 0; i < marks2.length; i++) {
            marks2[i] = input.nextDouble();
            sum2 += marks2[i];
        }
        double percent2 = (sum2 / totalPossibleMarks) * 100;


        System.out.println("Percentile of Student 1: " + percent1 + "%");
        System.out.println("Percentile of Student 2: " + percent2 + "%");

        input.close();
    }
}
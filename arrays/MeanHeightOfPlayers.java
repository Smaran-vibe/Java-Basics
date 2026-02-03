package arrays;

import java.util.Scanner;
public class MeanHeightOfPlayers {
     public static void main() {

         double heights[] = new double[11];

         Scanner input = new Scanner(System.in);

         System.out.println("Enter the heights of the player: ");
         for (int i = 0 ; i< heights.length ; ++i){
             heights[i] = input.nextDouble();

         }
         double sum = 0.0;
         for (double height : heights){
             sum += height;
         }
         double mean = sum / heights.length;

         System.out.println("The mean height of player is: "+mean);

      input.close();

    }
}

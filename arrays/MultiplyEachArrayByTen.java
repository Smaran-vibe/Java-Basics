package arrays;

public class MultiplyEachArrayByTen {
    public static void main(String[] args){

        int numbers[] = {12,89,34,56,78,64};

        int newNumbers[] = new int [numbers.length];

        for ( int num = 0 ;num < numbers.length ; num++ ) {

            newNumbers[num] = numbers[num] * 10;
        }

         for ( int num : newNumbers) {


             System.out.print(num);
         }


        }

    }


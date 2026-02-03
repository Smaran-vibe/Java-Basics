import java.util.Scanner;

class PassFailOrInvalid{
    public static void main(String[] args){
       Scanner input = new Scanner (System.in);
       System.out.println("Enter the student marks: ");
       int marks = input.nextInt();

       if(marks>100 || marks<0){
           System.out.println("Invalid marks please enter the valid marks.");

       }else if(marks>40){
           System.out.println("The student has passed.");
       }else{
           System.out.println("The student has failed.");
       }
       input.close();
    }
}
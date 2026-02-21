package OOPS;


import java.util.Scanner;

class Addition {


    public void add(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("The sum of number is: " + sum);
    }


    public void add(String first, String second) {
        String sum = first + second;
        System.out.println("The joined word is: " + sum);
    }
}

class method_overloading {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int number1 = input.nextInt();

        System.out.println("Enter the second number: ");
        int number2 = input.nextInt();

        System.out.println("Enter the first String: ");
        String first = input.next();

        System.out.println("Enter the second String: ");
        String second = input.next();


        Addition obj = new Addition();


        obj.add(number1, number2);


        obj.add(first, second);

        input.close();
    }
}

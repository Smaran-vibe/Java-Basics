package OOPS;

import java.util.Scanner;

class Company{
    static String name;

    static void printName(){
        System.out.println("The name is: " +name);
    }
}
public class staTic {
    static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name: ");
        String name = sc.nextLine();

        Company.name = name;

        Company.printName();

        sc.close();
    }
}

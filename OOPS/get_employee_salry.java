package OOPS;

import java.util.Scanner;


class Employee {


    private double salary;


    public void setSalary(double salary) {
        this.salary = salary;
    }


    public double getSalary() {
        return this.salary;
    }
}

class get_employee_salry {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the salary of employee: ");
        double salary = input.nextDouble();


        Employee e = new Employee();


        e.setSalary(salary);


        double result = e.getSalary();


        System.out.println("The salary of employee is: " + result);

        input.close();
    }
}

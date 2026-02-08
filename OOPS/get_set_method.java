package OOPS;

import java.util.Scanner;

public class get_set_method {

    class Person {
        private String name;

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

    }

    public static void main(String[] args) {
        get_set_method obj = new get_set_method();

        Scanner sc = new Scanner(System.in);

        Person person1 = obj.new Person();

        person1.setName("Smaran");

        System.out.println("The name is: " + person1.getName());


    }

}

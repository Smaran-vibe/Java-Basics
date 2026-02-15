import java.util.Scanner;


class Greeting {
    void greet(String name) {
        System.out.println("Hello " + name);
    }
}

//create a LocalGreeting class that inherits Greeting
class LocalGreeting extends Greeting {
    @Override

    public void greet(String name) {
        System.out.println("Namaste " + name);
    }
}

public class greetings {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = input.nextLine();


        Greeting obj = new Greeting();

        LocalGreeting obj1 = new LocalGreeting();


        obj.greet(name);


        obj1.greet(name);
    }
}





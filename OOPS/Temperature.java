package OOPS;

import java.util.Scanner;

public class Temperature {

    int hot;
    int cold;


    Temperature(int hot, int cold) {
        this.hot = hot;
        this.cold = cold;
    }


    void checkIcyHot() {


        if (hot >= 100 && cold <= 0) {
            System.out.println("IcyHot");
        } else {
            System.out.println("Normal temperature");
        }
    }
}

class main {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value for hot temperature: ");
        int hot = input.nextInt();

        System.out.println("Enter the value for cold temperature: ");
        int cold = input.nextInt();


        Temperature t1 = new Temperature(hot, cold);


        t1.checkIcyHot();

        input.close();
    }
}





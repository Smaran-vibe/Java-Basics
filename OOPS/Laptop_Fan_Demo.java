package OOPS;

import java.util.Scanner;

class CoolingFan {
    private boolean isRunning = false;
    private final int THRESHOLD = 80;

    public void checkTemperature(int currentTemp) {
        System.out.println("Current Temperature: " + currentTemp + "°C");


        if (currentTemp > THRESHOLD) {
            if (!isRunning) {
                startFan();
            } else {
                System.out.println("Fan is already running to cool down the system.");
            }
        } else {
            if (isRunning) {
                stopFan();
            } else {
                System.out.println("Temperature is safe. Fan remains OFF.");
            }
        }
    }

    private void startFan() {
        isRunning = true;
        System.out.println(">>> WARNING: High Temp! Starting Fan now...");
    }

    private void stopFan() {
        isRunning = false;
        System.out.println(">>> System Cooled. Stopping Fan to save power.");
    }
}

public class Laptop_Fan_Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CoolingFan myFan = new CoolingFan();

        System.out.println("--- Automated Cooling System Demo ---");

        while (true) {
            System.out.print("\nEnter system temperature (or 0 to exit): ");
            int temp = sc.nextInt();

            if (temp == 0) break;

            myFan.checkTemperature(temp);
        }

        System.out.println("Shutting down monitoring system.");
        sc.close();
    }
}

package OOPS;

import java.util.Scanner;
import java.io.IOException;

class CoolingFan {
    private boolean isRunning = false;
    private final int THRESHOLD = 80;
    private final int CRITICAL_THRESHOLD = 95; // New limit

    public void checkTemperature(int currentTemp) {
        System.out.println("Current Temperature: " + currentTemp + "°C");

        // 1. Check for Critical Emergency First
        if (currentTemp >= CRITICAL_THRESHOLD) {
            shutdownSystem();
            return;
        }


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

    private void shutdownSystem() {
        System.out.println("!!! CRITICAL ERROR: Temperature exceeded 95°C !!!");
        System.out.println("Emergency Shutdown Initiated...");

        try {
            String os = System.getProperty("os.name").toLowerCase();

            if (os.contains("win")) {
                // Windows command: shutdown /s (shutdown) /t 0 (zero seconds delay)
                 Runtime.getRuntime().exec("shutdown -s -t 0");

               // System.out.println(">>> OS COMMAND EXECUTED: [shutdown -s -t 0]");
                System.out.println(">>> Your laptop would be turning off right now!");

            } else if (os.contains("nix") || os.contains("nux") || os.contains("mac")) {
                // Linux/Mac command
                Runtime.getRuntime().exec("shutdown -h now");
            }
        } catch (IOException e) {
            System.out.println("Failed to trigger shutdown. Please turn off manually!");
        }
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
package Strings;

import java.util.Scanner;

public class Rock_Paper_Scissors {

    String getComputerChoice() {

        String ComputerChoice;
        int random_number = (int) (Math.random() * 3 + 1);

        if (random_number == 1) {
            ComputerChoice = "rock";
        } else if (random_number == 2) {
            ComputerChoice = "paper";
        } else {
            ComputerChoice = "scissor";
        }
        return ComputerChoice;

    }

    String getUser_input() {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rock,paper,or scissor: ");
        String input = sc.nextLine();

        input = input.toLowerCase().trim();

        return input;
    }

    String getResult(String ComputerChoice, String User_input) {

        if (User_input.equals(ComputerChoice)) {
            return "draw";

        } else if (User_input.equals("paper") && ComputerChoice.equals("rock")) {
            return "win";

        } else if (User_input.equals("rock") && ComputerChoice.equals("scissor")) {
            return "win";
        } else if (User_input.equals("scissors") && ComputerChoice.equals("paper")) {
            return "win";
        } else {
            return "lose";
        }

    }

    public static void main(String[] args) {

        Rock_Paper_Scissors game = new Rock_Paper_Scissors();

        String user_input;
        while (true) {
            user_input = game.getUser_input();

            if (user_input.equals("rock") || user_input.equals("paper") || user_input.equals("scissor")) {
                break;

            }
        }

        String Computerchoice = game.getComputerChoice();

        String result = game.getResult(user_input, game.getComputerChoice());

        System.out.println("Computer choice: " + Computerchoice);
        System.out.println("Your choice: " + user_input);

        System.out.println("Result: " + result);


    }
}

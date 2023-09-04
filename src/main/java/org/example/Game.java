package org.example;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Game {


    public static void main(String[] args) {
        User user1 = new User("Aruba");
        String name = user1.setNameFromInput();

        System.out.println("Hi " + name + " Welcome to the game! Please tell me what you pick, is it Rock, Paper or Scissors?");

        ArrayList<String> rps = new ArrayList<>();
        rps.add("Rock");
        rps.add("Paper");
        rps.add("Scissors");

        String choice;
        String randomElement;
        do {

            Scanner rpsOption = new Scanner(System.in);
            choice = rpsOption.nextLine();

            Random rndm = new Random();
            int randomitem = rndm.nextInt(rps.size());
            randomElement = rps.get(randomitem);

            if (choice.equals(RpsOptions.Rock.toString()) && randomElement.equals(choice)) {
                System.out.println("Computer picks: " + randomElement + " It's a draw!");
            } else if (choice.equals(RpsOptions.Paper.toString()) && randomElement.equals(choice)) {
                System.out.println("Computer picks: " + randomElement + " It's a draw!");
            } else if (choice.equals(RpsOptions.Scissors.toString()) && randomElement.equals(choice)) {
                System.out.println("Computer picks: " + randomElement + " It's a draw!");

            } else if (choice.equals(RpsOptions.Rock.toString()) && randomElement.equals(RpsOptions.Scissors.toString())) {
                System.out.println("Computer picks: " + randomElement + " You win!");
            } else if (choice.equals(RpsOptions.Rock.toString()) && randomElement.equals(RpsOptions.Paper.toString())) {
                System.out.println("Computer picks: " + randomElement + " Oh no! You Lose");
            } else if (choice.equals(RpsOptions.Paper.toString()) && randomElement.equals(RpsOptions.Rock.toString())) {
                System.out.println("Computer picks: " + randomElement + " You win!");
            } else if (choice.equals(RpsOptions.Paper.toString()) && randomElement.equals(RpsOptions.Scissors.toString())) {
                System.out.println("Computer picks: " + randomElement + " Oh no! You Lose");
            } else if (choice.equals(RpsOptions.Scissors.toString()) && randomElement.equals(RpsOptions.Paper.toString())) {
                System.out.println("Computer picks: " + randomElement + " You win!");
            } else if (choice.equals(RpsOptions.Scissors.toString()) && randomElement.equals(RpsOptions.Rock.toString())) {
                System.out.println("Computer picks: " + randomElement + " Oh no! You Lose");
            } else {
                System.out.println("Sorry please pick either Rock, Paper or Scissors!");
            }

        } while (choice == randomElement);


    }
}

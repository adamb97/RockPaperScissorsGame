package com.adam;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String choiceLC, choice;
        int num = 0;
        Random r = new Random();
        num = r.nextInt(3);

        System.out.println("choose: Rock, Paper, or Scissors.");

        Scanner userInput = new Scanner(System.in);

        choice = userInput.next();
        choiceLC = choice.toLowerCase();




        switch (num){
            case 0:

                String numPlay1 = "rock";
                System.out.println("Computer Chose rock");
                if (choiceLC.matches(numPlay1)) {
                    System.out.println("Its a tie!");
                }
                else if (choiceLC.matches("paper")) {
                    System.out.println("you win");
                }
                else if (choiceLC.matches("scissors")) {
                    System.out.println("You lose");
                }

                else {
                    System.out.println();
                    System.out.println("ERROR: Please choose rock, paper,or scissors");
                }
                break;



            case 1:
                String numPlay2 = "paper";
                System.out.println("Computer Chose Paper");

                if (choiceLC.matches(numPlay2)) {
                    System.out.println("It's a tie");
                }

                else if (choiceLC.matches("rock")) {
                   System.out.println("you lose");
                }

                else if(choiceLC.matches("scissors")) {
                    System.out.println("you win");
                }

                else {
                    System.out.println();
                    System.out.println("ERROR: Please choose rock, paper,or scissors");
                }
                break;


            case 2:
                String numPlay3 = "scissors";
                System.out.println("computer chose Scissors");

                if (choiceLC.matches(numPlay3)) {
                    System.out.println("Its a tie");
                }

                else if (choiceLC.matches("rock")) {
                    System.out.println("You win");
                }

                else if (choiceLC.matches("paper")) {
                    System.out.println("You lose");
                }

                else {
                    System.out.println();
                    System.out.println("ERROR: Please choose rock, paper,or scissors");
                }
                break;






        }

    }
}

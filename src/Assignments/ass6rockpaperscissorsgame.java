package Assignments;

import java.util.Random;
import java.util.Scanner;

public class ass6rockpaperscissorsgame {
    public static void main(String[] args) {
        Random random = new Random();
        int randomChoice = random.nextInt(1, 4);
        int Rock = 1;
        int Paper = 2;
        int Scissors = 3;

        Scanner RPSgame;
        System.out.println("Welcome to the rock paper scissors game");
        System.out.println("Pick:");
        System.out.println("1.Rock");
        System.out.println("2.Paper");
        System.out.println("3.Scissors");
        int Userchoice = new Scanner(System.in).nextInt();
        System.out.println("USER: "+ Userchoice);
        System.out.println("COMPUTER : "+ randomChoice);
        if (Userchoice == randomChoice){
            System.out.println("Its a draw");
        } else if (Userchoice == Rock && randomChoice == 2) {
            System.out.println("YOU LOSE");
        } else if (Userchoice == Rock && randomChoice == 3 ) {
            System.out.println("YOU WIN");
        } else if (Userchoice == Paper && randomChoice == 3) {
            System.out.println("YOU LOSE");
        } else if (Userchoice == Paper && randomChoice == 1) {
            System.out.println("YOU WIN");
        } else if (Userchoice == Scissors && randomChoice == 1) {
            System.out.println("YOU LOSE");
        } else if (Userchoice == Scissors && randomChoice == 2) {
            System.out.println("YOU WIN");
        }else {
            System.out.println("INVALID INPUT");
        }

    }
}

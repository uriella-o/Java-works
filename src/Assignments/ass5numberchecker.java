package Assignments;

import java.util.Scanner;

public class ass5numberchecker {
    public static void main(String[] args) {
        System.out.println("WELCOME\n Would you like to?....");
        while(true){
            System.out.println("1)numberchecker\n2)exit?");
            int userChoice = new Scanner(System.in).nextInt();
            {
                if (userChoice == 1) {
                    System.out.println("pick a number");
                    int userNum = new Scanner(System.in).nextInt();
                    if (userNum % 2 == 0) {
                        System.out.println(userNum + " is an even number");
                    } else {
                        System.out.println(userNum + " is an odd number");
                    }
                    continue;

                } else if (userChoice==2) {
                    System.out.println("bye");}
            } break;
        }
    }
}

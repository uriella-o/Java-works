package Assignments;

import java.util.Scanner;

public class ass4multiplicationprogram {
    public static void main(String[] args) {
        System.out.println("Welcome to the multiplication table:");
        outerLoop: while(true){
            int num = 0;
            System.out.println("1.Choose a number\n2.Exit");
            String choice = new Scanner(System.in).nextLine();
            switch (choice){
                case "1" -> {
                    System.out.println("Enter a number");
                    int userNum = new Scanner(System.in).nextInt();
                    while (num <=12){
                        System.out.println(userNum + " * " + num + " = " + userNum*num);
                        num++;
                    }
                }
                case "2" ->{
                    break outerLoop;
                }
                default -> System.out.println("Invalid input");
            }
        }
    }
}

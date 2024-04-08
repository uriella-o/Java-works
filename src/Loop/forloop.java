package Loop;

import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {
        System.out.println("Welcome to the multiplication table:");
        while (true) {
            System.out.println("1.Choose a number\n2.Exit");
            String choice = new Scanner(System.in).nextLine();
            if (choice.equals("1")) {
                System.out.println("Enter a number");
                int userNum = new Scanner(System.in).nextInt();
                for (int num = 0; num <= 12; num++) {
                    System.out.println(userNum + " * " + num + " = " + userNum * num);
                }
            } else {
                System.out.println("invalid input");
                break;
            }
        }
    }
}

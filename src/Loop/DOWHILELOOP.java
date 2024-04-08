package Loop;

import java.util.Scanner;

public class DOWHILELOOP {
    public static void main(String[] args) {
//        int i = 5;
//        do {
//            System.out.println("VIRUS!!!");
//        }while (i < 5);

        int choice;
        System.out.println("enter 0 to exit");
        do {
            System.out.println("1. Withdraw \n2. Bal \n3. Transfer");
            choice = new Scanner(System.in).nextInt();
            switch (choice) {
                case 1 -> System.out.println("Withdraw option");
                case 2 -> System.out.println("checking balance..");
                case 3 -> System.out.println("Transferring....");
                default -> System.out.println("i don't know!");
            }
        }while(choice != 0);

    }
}

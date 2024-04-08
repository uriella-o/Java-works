package Assignments;

import java.util.Scanner;

public class assignment1 {
    public static void main(String[] args) {

        String admin = "Samantha";
        String student = "Mark";
        String cleaner = "Elise";
        String assistant = "Tyler";
        String Teacher = "Caroline";

        Scanner scanner = new Scanner (System.in);
        System.out.println("input your name!");
        String name = scanner.nextLine();
        System.out.println("checking if admin....");
        scanner.close();


        if (name.equals(admin)) {
            System.out.println("This is an admin..");
        } else if (name.equals(student)) {
            System.out.println("This is a student...");
        } else if (name.equals(cleaner)) {
            System.out.println("This is a cleaner");
        } else if (name.equals(assistant)) {
            System.out.println("Ths is an assistant");
        } else if (name.equals(Teacher)) {
            System.out.println("This is a teacher");
        }else {
            System.out.println("this is nothing");
        }
    }


}

package Assignments;

import java.util.Scanner;

public class Ass3Calc {
    public static void main(String[] args) {
        System.out.println("Welcome to my calculator");
        Scanner p = new Scanner(System.in);
        int pin = 6789;
        System.out.println("Calculator code");
        String password = p.nextLine();
        System.out.println("input a number");
        Scanner others = new Scanner( System.in);
        int firstnumber = others.nextInt();
        System.out.println("Input second number");
        int secondnumber = others.nextInt();
        Scanner o = new Scanner ( System.in);
        System.out.println("Which operator");
        String operator = o.nextLine();
        System.out.println("calculating....");
        String checkpassword = p.nextLine();


        if (checkpassword.equals(pin)){
            System.out.println("You're allowed");
        }
        else if (password.equals("others")) {
            System.out.println("Try again later");
        }
        else if (operator.equals("+")){
            System.out.println(firstnumber + secondnumber);
        }
        else if (operator.equals("-")){
            System.out.println(firstnumber - secondnumber);
        }
        else if (operator.equals("/")){
            System.out.println(firstnumber / secondnumber);
        }
        else if (operator.equals("+")){
            System.out.println(firstnumber * secondnumber);
        }
        else {
            System.out.println("error");
        }
    }
}

package Classexercises;

import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        //CYLINDER COMPUTATION
//        System.out.println("Enter the radius");
//        double radius = new Scanner(System.in).nextDouble();
//        System.out.println("Enter the height");
//        double height = new Scanner(System.in).nextDouble();
//        double baseArea = Math.PI*radius*radius;
//        double surfaceArea = 2*Math.PI*radius*height+2*baseArea;
//        double volume = baseArea * height;
//        System.out.println("The base area, surface area and volume are " + baseArea + ", " + surfaceArea + " and " + volume + " respectively ");
        //SWAP INTEGERS
//        System.out.println("Enter the first number");
//        int num1 = new Scanner(System.in).nextInt();
//        System.out.println("Enter the second number");
//        int num2 = new Scanner(System.in).nextInt();
//        System.out.println("The first integer is " + num2 + " and the second integer is " + num1);
        //SUMAVERAGE
//        double sum = 0;
//        double average = 0;
//        System.out.println("Enter the lowerbound");
//        int lowerbound = new Scanner(System.in).nextInt();
//        System.out.println("Enter the upperbound");
//        int upperbound = new Scanner(System.in).nextInt();
//        for(int num = lowerbound; num <= upperbound; ++num){
//            sum += num;
//        }
//        average = sum /((upperbound-lowerbound) + 1);
//        System.out.println("The sum is " + sum);
//        System.out.println("The average is " + average);
        //FACTORIAL
//        int factorial = 1;
//        System.out.println("Input an integer");
//        int n  = new Scanner(System.in).nextInt();
//        if (n<=12) {
//            int start;
//            for (start = 1; start <= n; ++start) {
//                factorial *= start;
//            }
//           System.out.println("The factorial of " + n + " = " + factorial);
//        } else {
//            System.out.println("Out of range!!");
//        }
        //FACTORIAL IN LONG
//        System.out.println("Input an integer");
//        int n = new Scanner(System.in).nextInt();
//        long factorial = 1;
//        int start;
//            for (start = 1; start <= n; ++start) {
//                factorial *= start;
//            }
//        System.out.println(factorial);
        //INCOME TAX CALCULATOR
        int taxableincome;
        double incometaxpayable;
        System.out.println("Enter the taxable income: ");
        taxableincome = new Scanner(System.in).nextInt();
        incometaxpayable = taxableincome*0.005;

    }
}

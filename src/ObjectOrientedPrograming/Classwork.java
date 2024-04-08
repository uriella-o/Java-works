package ObjectOrientedPrograming;

import java.util.Scanner;

public class Classwork {
    public void Add2Integers(int num1, int num2) {
        System.out.println(num1 + "+" + num2 + "=" + num1 + num2);
    }

    public void OddEven (int num){
        if (num % 2 == 0){
            System.out.println("This is an even number");
        }else {
            System.out.println("This is an odd number");
        }
    }

    public void Multiple (int num1, int num2){
        if (num1 % num2 == 0){
            System.out.println("The first number is a mutiple of the second");
        } else {
            System.out.println("The first number is NOT a mutiple of the second");
        }
    }

    public void SumProductMinMax3(int num1, int num2, int num3){
        System.out.println("The sum is " + " " +(num1 + num2 + num3));
        System.out.println("The product is " +num1 * num2 * num3);
        int small = 0;
        if (num2 < num1 && num2 < num3){
            small = num2;
        } else if (num1 < num2 && num1 < num3) {
            small = num1;
        } else if (num3 < num1 && num3 < num2){
            small = num3;
        }else {
            System.out.println("They're equal");
        }
        System.out.println(small + " is the smallest number");
        int big = 0;
        if (num2 > num1 && num2 > num3){
            big = num2;
        } else if (num3 > num1 && num3 > num2) {
            big = num3;
        } else if (num1 > num2 && num1 > num3) {
            big = num1;
        } else {
            System.out.println("The numbers are equal");
        }
        System.out.println(big + " is the biggest number");
    }

    public void SumProductMinMax5(int num1, int num2, int num3, int num4, int num5){
        System.out.println("The sum is " + " " + (num1 + num2 + num3 + num4 + num5));
        System.out.println("The product is " + num1 * num2 * num3 * num4 * num5);
        int small = 0;
        if (num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5){
            small = num1;
        } else if (num2 < num1 && num2 < num3 && num2 < num4 && num2 < num5) {
            small = num2;
        } else if (num3 < num1 && num3 < num2 && num3 < num4 && num3 < num5){
            small = num3;
        } else if (num4 < num1 && num4 < num2 && num4 < num3 && num4 < num5) {
            small = num4;
        } else if (num5 < num1 && num5 < num2 && num5 < num3 && num5 < num4) {
            small = num5;
        }
        else {
            System.out.println("Theyre equal");
        }
        System.out.println(small + " is the smallest number");
        int big = 0;
        if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5){
            big = num1;
        } else if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5) {
            big = num2;
        } else if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5){
            big = num3;
        } else if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5) {
            big = num4;
        } else if (num5 > num1 && num5 > num2 && num5 > num3 && num5 > num4) {
            big = num5;
        }
        else {
            System.out.println("They're equal");
        }
        System.out.println(big + " is the biggest number");
    }

    public void PrintDayInWord(int num){
        switch (num){
            case 0:
                System.out.println("ZERO"); break;
            case 1:
                System.out.println("ONE"); break;
            case 2:
                System.out.println("TWO"); break;
            case 3:
                System.out.println("THREE"); break;
            case 4:
                System.out.println("FOUR"); break;
            case 5:
                System.out.println("FIVE"); break;
            case 6:
                System.out.println("SIX"); break;
            case 7:
                System.out.println("SEVEN"); break;
            case 8:
                System.out.println("EIGHT"); break;
            case 9:
                System.out.println("NINE"); break;
            default:
                System.out.println("OTHER");
        }
    }

    public void RectangleComputation(int length, int width){
        System.out.println("The area is " + (length*width));
        System.out.println("The perimeter is " + (2*(length+width)));
    }

    public void CircleComputation(double radius){
        System.out.println("The diameter is " + ((radius*2)/100));
        System.out.println("The circumference is " + (2*Math.PI*radius)/100);
        System.out.println("The area is " + (Math.PI*(radius*radius))/100);
    }

    public void SphereComputation(double radius){
        System.out.println("The volume is " + (((4/3)*Math.PI*(radius*radius*radius))/100));
        System.out.println("The surface area is " + ((4*Math.PI*(radius*radius)))/100);

    }


    public static void main(String[] args) {
        Classwork answer = new Classwork();
        System.out.println("Welcome USER, What do you want to do today?");
        System.out.println("""
                1. ADD 2 integer
                2. Check for odd or even
                3. Check for multiple\n4. Check for sum,product, min and max n 3 numbers
                5. Check for sum,product, min and max n 5 numbers
                6. Print numbers in words
                7. Compute a rectangle
                8. Compute a Circle
                9. Compute a Sphere""");
        String Userinput = new Scanner(System.in).nextLine();
        switch (Userinput){
            case "1":
                System.out.println("Enter the first Number");
                int num1 = new Scanner(System.in).nextInt();
                System.out.println("Enter the second Number");
                int num2 = new Scanner(System.in).nextInt();
                answer.Add2Integers(num1, num2);
                break;
            case "2":
                System.out.println("Enter a Number");
                int num = new Scanner(System.in).nextInt();
                answer.OddEven(num);
                break;
            case "3":
                System.out.println("Enter a Number");
                int mult1 = new Scanner(System.in).nextInt();
                System.out.println("Enter a Number");
                int mult2 = new Scanner(System.in).nextInt();
                answer.Multiple(mult1, mult2);
                break;
            case "4":
                System.out.println("Enter a Number");
                int number1 = new Scanner(System.in).nextInt();
                System.out.println("Enter a Number");
                int number2 = new Scanner(System.in).nextInt();
                System.out.println("Enter a Number");
                int number3 = new Scanner(System.in).nextInt();
                answer.SumProductMinMax3(number1, number2, number3);
                break;
            case "5":
                System.out.println("Enter a Number");
                int Num1 = new Scanner(System.in).nextInt();
                System.out.println("Enter a Number");
                int Num2 = new Scanner(System.in).nextInt();
                System.out.println("Enter a Number");
                int Num3 = new Scanner(System.in).nextInt();
                System.out.println("Enter a Number");
                int Num4 = new Scanner(System.in).nextInt();
                System.out.println("Enter a Number");
                int Num5 = new Scanner(System.in).nextInt();
                answer.SumProductMinMax5(Num1,Num2,Num3,Num4,Num5);
                break;
            case "6":
                System.out.println("Enter a number");
                int numtoword = new Scanner(System.in).nextInt();
                answer.PrintDayInWord(numtoword);
                break;
            case "7":
                System.out.println("Enter the length");
                int length = new Scanner(System.in).nextInt();
                System.out.println("Enter the breadth");
                int breadth = new Scanner(System.in).nextInt();
                answer.RectangleComputation(length, breadth);
                break;
            case "8":
                System.out.println("Enter the radius");
                int radius = new Scanner(System.in).nextInt();
                answer.CircleComputation(radius);
                break;
            case "9":
                System.out.println("Enter the radius");
                int radius2 = new Scanner(System.in).nextInt();
                answer.SphereComputation(radius2);
                break;
            default:
                System.out.println("Wrong Input!!!");
        }
    }
}

package ObjectOrientedPrograming;

import java.util.Scanner;

public class Instances {
    public void calculate(int num1, int num2, String operator) {
        if (operator.equals("+")) {
            System.out.println(num1 + num2);
        } else if (operator.equals("-")) {
            System.out.println(num1 - num2);
        } else if (operator.equals("*")) {
            System.out.println(num1 * num2);
        } else if (operator.equals("/")) {
            System.out.println(num1 / num2);
        } else if (operator.equals("%")) {
            System.out.println(num1 % num2);
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to my Calculator: \nPick a First number");
        int firstNum = new Scanner(System.in).nextInt();
        System.out.println("Enter a second number");
        int secondNum = new Scanner(System.in).nextInt();
    }

    public void cylinder(int radius, int height) {
    }

    public void circle(int radius) {
    }

    public void rectangle(int length, int breadth) {
    }

    public void square(int length) {
    }
}

//    public void greet(String name, String lastname, int age){
//        System.out.println("Hello, "+name+ " " + lastname + "."+ "\nYou are " + age + " years old");
//    }
//    public static void main(String[] args) {
//        Instances obj = new Instances();
//        obj.greet("Micheal", "Doug", 14);
//    }

//    public void add(int num1, int num2){
//        System.out.println(num1 + num2);
//    }
//    public void sub(int num1, int num2){
//        System.out.println(num1 - num2);
//    }
//    public void mult(int num1, int num2){
//        System.out.println(num1 * num2);
//    }
//    public void div(int num1, int num2){
//        System.out.println(num1 / num2);
//    }
//
//    public static void main(String[] args) {
//        Instances word = new Instances();
//        word.add(2 , 3);
//        word.sub(4,5);
//        word.mult(3,3);
//        word.div(9,3);
//    }
//    int score = 9;
//    public void Hello (){
//        System.out.println(score);
//    }
//    public void Introduction (){
//        System.out.println("My name is Samantha\nI am 17 years old");
//    }
//    public void Schooling(){
//        System.out.println("I school at niit\nIts located at Ikota\nI take a course called MMS\nIts really fun here");
//    }
//    public void Skillset(){
//        System.out.println("I can cook \nI can type really fast \nI have a basic knowledge of HTML,JAVA,JAVSCRIPT,HTML AND CSS \nI also have basic skills in editing and social media management");
//    }
//
//    public static void main(String[] args) {
//        Instances info = new Instances();
//        System.out.println("Welcome");
//        while (true){
//        System.out.println("What do u wish to know about me: \n1) Introduction \n2) Schooling \n3) Skillset \n4) I dont want to know you ");
//        String UserInput = new Scanner(System.in).nextLine();
//        if (UserInput.equals("1")) {
//            info.Introduction();
//        } else if (UserInput.equals("2")){
//            info.Schooling();
//        } else if (UserInput.equals("3")) {
//            info.Skillset();
//        } else if (UserInput.equals("4")) {
//            System.out.println("Thats rude!");
//            break;
//        }else {
//            System.out.println("Invalid Input");
//            break;
//        }}
//




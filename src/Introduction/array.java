package Introduction;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
//        String[] names = {"Ayo","Micheal","Favour","Samantha","Clare"};
//        System.out.println(names[3]);
//        for (int i = 0; i<=names.length; i++) {
//            System.out.println(names[i]);
//        }
//        }
//        for (String name:names){
//            System.out.println(name);
//        }
        System.out.println("List three names please");
        System.out.println("Input Firstname");
        String firstname= new Scanner(System.in).nextLine();
        System.out.println("Input Secondname");
        String secondname= new Scanner(System.in).nextLine();
        System.out.println("Input Thirdname");
        String thirdname= new Scanner(System.in).nextLine();
        String[] names = {"\n"+firstname,secondname,thirdname};
        for (String name:names){
            System.out.println(name);
        }
    }
}


package usinglist;

import java.util.ArrayList;
import java.util.Scanner;

public class runner {
    public static void main(String[] args) {
        ArrayList<members> members =new ArrayList<>();
        members.add(new members("Rob", "op"));
        members.add(new members("Rob", "oppa"));

        System.out.println("Welcome! \nPlease enter your name.");
        String name = new Scanner(System.in).nextLine();

        for(members member:members){
            if(member.getName().equalsIgnoreCase(name)){
                System.out.println("Welcome" + name);
                System.out.println("Input your password");
                String password = new Scanner(System.in).nextLine();
                if(member.getPassword().equalsIgnoreCase(password)){
                    System.out.println("Succesful");
                }
                else {
                    System.out.println("Incorrect");
                }
                }else{
                System.out.println("You be theif");
            }
            }
        }
    }


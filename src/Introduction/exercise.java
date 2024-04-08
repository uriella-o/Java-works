package Introduction;

import java.util.Scanner;

public class exercise {

    public class method {
        void SayHello() {
            System.out.println("Hello world!");
        }

        public static void main(String[] args) {
            Scanner reader = new Scanner(System.in);
            System.out.println("input your name!");
            String name = reader.nextLine();
            System.out.println("Hello" + " " + name);
        }
    }
}
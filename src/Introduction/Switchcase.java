package Introduction;

import java.util.Scanner;

public class Switchcase {
    public static void main(String[] args) {
        System.out.println("Input Username");
        String userName = new Scanner(System.in).nextLine();
        System.out.println("Input Password");
        String passWord = new Scanner(System.in).nextLine();
        boolean CheckUsername, CheckPassword;

        CheckUsername = switch (userName) {
            case "mike" -> true;
            default -> false;
        };
        CheckPassword = switch (passWord) {
            case "1234" -> true;
            default -> false;
        };

        if (CheckUsername && CheckPassword) {
            System.out.println("You are welcome");
        } else {
            System.out.println("I know you not");
        };
    }
}
//        switch(variable name){
//            (value):
//                (action)
//            break;       (syntax for switchcase)

//        String today = "Monday";
//
//            switch(today){
//                case "Monday":
//                    System.out.println("Today is Monday");
//                    break;
//
//                    case "Tuesday":
//                    System.out.println("Today is Tuesday");
//                    break;
//
//                    case "Wednesday":
//                    System.out.println("Today is Wednesday");
//                    break;
//
//                    case "Thursday":
//                    System.out.println("Today is Thursday");
//                    break;
//
//                    case "Friday":
//                    System.out.println("Today is Friday");
//                    break;
//
//                    case "Saturday":
//                    System.out.println("Today is Saturday");
//                    break;
//
//                    case "Sunday":
//                    System.out.println("Today is Sunday");
//                    break;
//
//                    default:
//                    System.out.println("This is not a weekday");}


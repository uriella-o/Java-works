package Loop;

public class whileloop {
    public static void main(String[] args) {
        int num = 0;
        while (num<=20){
            if(num%2!=0){
                System.out.println(num);
            }
            num++;
        }

    }
}

//        int num = 0;
//        while (num<=12){
//            System.out.println(num);
//            num++;
//        }
//        int divisor = 2;
//        int num = 1;
//        while(num<=10){
//            System.out.println("2 x " + divisor +  " = "  + num*divisor);
//            num++;
//        }
//    }
//    }
//        System.out.println("Welcome");
//        int numofyes = 0;
//        while(true){
//        System.out.println("Wanna know how to keep someone busy?:");
//        String answer = new Scanner(System.in).nextLine().toLowerCase();
//            if (answer.equals("no") && numofyes == 0){
//                System.out.println("ok");
//                break;
//            }else if (answer.equals("no") && numofyes!=0 ){
//                System.out.println("I tricked you " + numofyes + " times");
//                break;
//            }else {
//                numofyes++;
//                continue;
//            }
//        switch (answer) {
//            case "yes" -> {
//                continue;
//            }
//            case "no" -> {
//                break;
//            }
//        }
//            default -> {continue;}


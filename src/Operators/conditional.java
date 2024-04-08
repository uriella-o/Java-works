package Operators;

public class conditional {
    public static void main(String[] args) {

//    if (5>=10){
//        System.out.println("5 is greater than or equal to 10");
//    }else{
//        System.out.println("5 is not greater than or equla to 10");
//    }

        int avalaibleBalance = 300000;
        int withdrawalAmount = 50000;

        if (withdrawalAmount<=avalaibleBalance){
            System.out.println("Withdrawal successful");
            avalaibleBalance -= withdrawalAmount;
            System.out.println("Your available balance is now" + " " + avalaibleBalance);

        }else{
            System.out.println("Insufficient funds");
        }

    }
}

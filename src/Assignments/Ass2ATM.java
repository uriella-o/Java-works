package Assignments;

import java.util.Scanner;

public class Ass2ATM {
    public static void main(String[] args) {

        //Declaration of variales
        String userName = "Richard";
        String pin = "1234";
        double accountBal = 50000;

        Scanner scanner1;
        //Welcome message
        while (true) {
            System.out.println("\nWelcome to Mpay ATM service");
            System.out.println("Insert your card!");
            System.out.println("Input your pin");
            //Code to collect pin
            String inputPin = new Scanner(System.in).nextLine();
            //Welcoming user and asking for their purpose
            if (inputPin.equals(pin)) {
                System.out.println("Welcome " + userName);
                System.out.println("What would you like to do today");
                System.out.println("1. Withdraw");
                System.out.println("2. Check Balance");
                System.out.println("3. Transfer Funds ");
                System.out.println("4. Buy airtime");
                System.out.println("5. Change Pin");
                // Code to collect userOption
                String userOption = new Scanner(System.in).nextLine();

                //CODE FOR IF USER IS WITHDRAWING
                if (userOption.equals("1")) {
                    System.out.println("Enter an amount");
                    //ASKING FOR WITHDRAWAL AMOUNT
                    double withdrawalAmount = new Scanner(System.in).nextDouble();
                    //CONFIRMATION FOR IF WITHDRAWAL AMOUNT IS WITHIN THE RANGE FOR WITHDRAWAL
                    if (withdrawalAmount <= accountBal) {
                        System.out.println("Withdrawal successful");
                        System.out.println("collect your $" + withdrawalAmount);
                        accountBal -= withdrawalAmount;
                        System.out.println("Your new balance is $" + accountBal);
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                }
                //CODE TO CHECK BALANCE
                else if (userOption.equals("2")) {
                    System.out.println("This is your balance " + accountBal);
                }
                //CODE TO TRANSFER FUNDS
                else if (userOption.equals("3")) {
                    //COLLECTIG ACCOUNT DETAILS
                    System.out.println("Input Account details");
                    String AccountDetails = new Scanner(System.in).nextLine();
                    int length = AccountDetails.length();
                    //CONFRIMING IF ACCOUNT DETAILS ARE VALID
                    if (length == 10) {
                        System.out.println("Account details entered");
                        //COLLECT TRANSFER AMOUNT
                        System.out.println("Enter Amount to be transferred");
                        double TransferAmount = new Scanner(System.in).nextDouble();
                        //CONFIRMING IF TRANSFER AMOUNT IS WITHIN THE RANGE OF ACCT BALANCE
                        if (TransferAmount <= accountBal) {
                            System.out.println("Transfer sucessful");
                            accountBal -= TransferAmount;
                            System.out.println("Your new balance is $" + accountBal);
                        } else {
                            System.out.println("Insufficient funds");
                        }
                    } else {
                        System.out.println("Invalid Account details");
                    }


                }
                //CODE TO BUY AIRTIME
                else if (userOption.equals("4")) {
                    //COLLECTING NETWORL NAME
                    System.out.println("Enter network name");
                    String Network = new Scanner(System.in).nextLine();
                    //COLLECTIG PHONE NUMBER
                    System.out.println("Enter Phone Number");
                    String Number = new Scanner(System.in).nextLine();
                    //AUTHENTICATING PHONE NUMBER
                    if ((Number.length() == 11 && Number.startsWith("0")) || (Number.startsWith("+") && Number.length() == 14)) {
                        System.out.println("Number entered successfully");
                        //COLLECTING AIRTIME AMOUNT
                        System.out.println("Enter an amount");
                        double AirtimeAmount = new Scanner(System.in).nextDouble();
                        //CHECKING IF AIRTIME AMOUNT IS WITHIN ACCOUNT BALANCE
                        if (AirtimeAmount <= accountBal) {
                            System.out.println("Airtime Purchased Succesfuly");
                            accountBal -= AirtimeAmount;
                            System.out.println("Your new balanCe is " + accountBal);
                        } else {
                            System.out.println("Insufficient Funds");
                        }
                    } else {
                        System.out.println("Invalid number");
                    }


                }
                //CODE TO CHANGE PIN
                else if (userOption.equals("5")) {
                    //COLLECTING OLD PIN
                    System.out.println("Enter OldPin");
                    String OldPin = new Scanner(System.in).nextLine();
                    //AUTHENTCATING OLD PIN/COLLECTING NEW PIN
                    if (pin.equals(OldPin)) {
                        System.out.println("Enter a new pin");
                        String NewPin = new Scanner(System.in).nextLine();
                        //CONFIRMING NEW PIN/CHANGING PIM
                        System.out.println("Confirm new pin");
                        String NewPin2 = new Scanner(System.in).nextLine();
                        if (NewPin2.equals(NewPin)) {
                            pin = NewPin;
                            System.out.println("Your Pin has been changed successfully");
                            System.out.println("Your new Pin is ***" + pin.charAt(-1));
                        } else {
                            System.out.println("Pin doesnt match");
                        }
                    } else {
                        System.out.println("Incorrect Pin Entered");
                    }
                } else {
                    System.out.println("Wrong input");
                }
            } else {
                System.out.println("Incorrect Pin");
            }


        }
    }
}
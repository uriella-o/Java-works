package Assignments;

public class ass7bankaccount {
    private int balance;
    private int accountnumber;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(int accountnumber) {
        this.accountnumber = accountnumber;
    }

    public void deposit(double amount){
        balance += amount;
        System.out.println( "The balance is " + balance);

    }

    public void withdraw(double amount){
        balance -= amount;
        System.out.println("The balance is " +balance);

    }

    public static void main(String[] args) {
        ass7bankaccount account = new ass7bankaccount();
        account.setAccountnumber(0003344555);
        account.setBalance(6000);
        account.deposit(3000);
    }
}

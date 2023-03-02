public class BankAccount {

    private String userName;
    private double balance;

    public BankAccount(String userName, double balance) {
        this.userName = userName;
        this.balance = balance;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getMoney() {
        return balance;
    }

    public void setMoney(Double balance) {
        this.balance = balance;
    }

    public void deposit (double balance) {
        if(balance > 0){
            balance += balance;
        } else {
            System.out.println("You cannot deposit a negative balance.");
        }
    }

    public void withdraw (double balance) {
        if(balance > 0){
            balance -= balance;
        } else {
            System.out.println("You cannot withdraw a negative balance.");
        }
    }
}
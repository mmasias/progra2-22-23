package Poo;

public class BankAccount {

    private double balance;
    private String name;

    public BankAccount() {
        getBalance();
        getName();
    }

    void setBalance(double balance) {
        this.balance = balance;
    }
    void setName(String name) {
        this.name = name;
    }
    double getBalance() {
        System.out.println("Balance: " + balance);
        return 0;
    }
    void getName() {
        System.out.println("Name: " + name);
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("You now have "+balance+" in your account.");
        } else if(amount<=0){
            System.out.println("You can't deposit that amount.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0) {
            balance -= amount;
            System.out.println("You now have "+balance+" in your account.");
        } else if(amount<=0){
            balance = 0;
            System.out.println("You withdrew all your money.");
        }
    }

}

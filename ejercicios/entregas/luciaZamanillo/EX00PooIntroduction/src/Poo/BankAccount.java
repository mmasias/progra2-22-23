package Poo;

public class BankAccount {
    private String titular;
    private double accountAmount;

    public BankAccount(String titular, double accountAmount) {
        this.titular = titular;
        this.accountAmount = accountAmount;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getAccountAmount() {
        return accountAmount;
    }

    public void setAccountAmount(double accountAmount) {
        this.accountAmount = accountAmount;
    }

    void deposit(double amount) {
        if (amount > 0) {
            accountAmount = accountAmount + amount;
        }
    }

    void withdraw(double amount) {
        accountAmount = accountAmount - amount;
        if (accountAmount < 0) {
            accountAmount = 0;
        }
    }
}

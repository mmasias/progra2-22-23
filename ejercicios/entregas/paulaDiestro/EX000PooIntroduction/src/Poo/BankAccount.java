package Poo;

public class BankAccount {

    private String holder;
    private double amount;

    public BankAccount(String holder, double amount) {
        this.holder = holder;
        this.amount = amount;
    }

    public String getHoldere() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            amount += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount - amount < 0) {
            amount = 0;
        } else {
            amount -= amount;
        }
    }

}
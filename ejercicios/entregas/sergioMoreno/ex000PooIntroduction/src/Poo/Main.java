package Poo;

public class BankAccount {
    private String name;
    private double quantity;

    public BankAccount(String name, double amount) {
        this.name = name;
        this.quantity = amount;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.quantity = this.quantity + amount;
        }
    }

    public void withdraw(double amount) {
        this.quantity = this.quantity - amount;
        if (this.quantity < 0) {
            this.quantity = 0;
        }
    }
}
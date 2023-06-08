package Poo;

public class BankAccount {
    private String name;
    private double amount;

    public BankAccount(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return this.name;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void Deposit(double amount) {
        if (amount > 0) {
            setAmount(this.amount + amount);
        } else {
            System.out.println("This task is not posible");
        }
    }

    public void Withdraw(double amount) {
        if (amount > 0) {
            if (amount > this.amount) {
                System.out.println("You don't have enough founds");
            } else {
                setAmount(this.amount - amount);
            }
        }
    }

}

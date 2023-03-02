package src.Poo;

public class BankAccount {
    private String user;
    private double amount;

    public BankAccount(String user, double amount) {
        this.user = user;
        this.amount = amount;
    }

    public String getTitular() {
        return user;
    }
    public void setTitular(String user) {
        this.user = user;
    }
    public double getCantidad() {
        return amount;
    }
    public void setCantidad(double amount) {
        this.amount = amount;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            this.amount += amount;
        }
        else {
            System.out.println("It is not possible to deposit a negative amount!");
        }
    }
    public void withdraw(double amount) {
        if (this.amount - amount < 0) {
            amount = 0;
        }
        else {
            this.amount -= amount;
        }
    }
}
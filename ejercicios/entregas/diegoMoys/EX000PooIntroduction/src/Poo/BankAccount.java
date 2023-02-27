package Poo;

public class BankAccount {
    private String owner;
    private double amount;

    public void deposit(double amount){
        if (amount > 0) {
            this.amount = amount;
        }
    }
    public void withdraw(double withdraw){
        if (withdraw > amount) {
            this.amount = 0;
        }
    }
    public String getOwner() {
        return owner;
    }

    public double getAmmount() {
        return amount;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setAmount(double amount) {

        this.amount = amount;
    }
}

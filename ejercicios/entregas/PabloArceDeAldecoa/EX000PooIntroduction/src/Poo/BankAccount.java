package Poo;

public class BankAccount {
    private String titular;
    private double amount;
    public String getTitular() {
        return this.titular;
    }
    public void setAmount(int quantity) {
        this.amount = quantity;
    }
    public void setTitular(String name) {
        this.titular = name;
    }
    public double getAmount() {
        return this.amount;
    }

    public void deposit(double quantity){
        if (!(quantity <0)){
            this.amount+=quantity;
        }
    }

    public void withdraw(double quantity) {
        this.amount -= quantity;
        if (amount < 0){amount = 0;}
    }
}

package Poo;

public class BankAccount {
    private String titular;
    private double amountAccount;

    public BankAccount(String titular, double amountAccount) {
        this.titular = titular;
        this.amountAccount = amountAccount;
    }

    public String getTitular() {
        return titular;
    }

    public double getAmountAccount() {
        return amountAccount;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setAmountAccount(double amountAccount) {
        this.amountAccount = amountAccount;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            amountAccount = amountAccount + amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            amountAccount = amountAccount - amount;
            if (amountAccount < 0) {
                amountAccount = 0;
            }
        }
    }
}

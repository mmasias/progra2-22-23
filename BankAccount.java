import java.util.Scanner;

public class BankAccount {
    private String titular;
    public double amount;


    public BankAccount(String titular) {
        this.titular = titular;
        this.amount=0;
    }

    public BankAccount(String titular, double amount) {
        this.titular = titular;
        this.amount = amount;
    }
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double deposit(double money) {
        if (money > 0) {
            this.amount+=money;
        }
        return amount;
    }
    public double withdraw(double money) {
        if (money <= this.amount) {
            this.amount-=money;
        }else{
            this.amount=0;
        }
        return amount;
    }
}
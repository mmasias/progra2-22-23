package Poo;

public class BankAccount{

    private String holder;
    private double amount;

    public BankAccount(String holder, double amount){
        this.holder = holder;
        this.amount = amount;
    }

    public BankAccount() {
    }

    public String getholder(){
        return this.holder;
    }

    public void setholder(String holder){
        this.holder = holder;
    }

    public double getAmount(){
        return this.amount;
    }



    public void withdraw(double amount){
        if(amount > 0 && this.amount >= amount){
            this.amount = this.amount - amount;
        }
    }

    public void deposit(double amount){
        if(amount > 0){
            this.amount = this.amount + amount;
        }
    }


}
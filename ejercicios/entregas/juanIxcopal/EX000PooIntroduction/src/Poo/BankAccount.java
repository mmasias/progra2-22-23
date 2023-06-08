package Poo;

public class BankAccount {
    private String Headline;
    private double Amount;

    public BankAccount(String headline, double amount){
        this.Headline = headline;
        this.Amount = amount;
    }

    public BankAccount(){}

    public void Deposit(double amount){
        if (amount > 0){
            setAmount(this.Amount + amount);
        } else {
            System.out.println("You cannot deposit negative values");
        }
    }

    public void Withdraw(double amount){
        if(this.Amount > amount && amount > 0){
            setAmount(this.Amount - amount);
        } else if( this.Amount < amount ){
            System.out.println("Insufficient balance");
        } else{
            System.out.println("This operation cannot be done");
        }
    }

    public String getHeadline() {
        return this.Headline;
    }
    public void setHeadline(String headline) {
        this.Headline = headline;
    }

    public double getAmount() {
        return this.Amount;
    }
    public void setAmount(double amount) {
        this.Amount = amount;
    }
}

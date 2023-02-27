package POO;

public class BankAccount {
    private String AccountHolder;
    private double Amount;

    public BankAccount(String accountHolder, double amount) {
        AccountHolder = accountHolder;
        Amount = amount;
    }
    public BankAccount(String accountHolder) {
        AccountHolder = accountHolder;
        Amount = 0;
    }

    public String getAccountHolder() {
        return AccountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        AccountHolder = accountHolder;
    }

    public double getAmount() {
        return Amount;
    }

    public void setAmount(double amount) {
        Amount = amount;
    }
    public void deposit(double amount){
        if (amount> 0){
            Amount= Amount+amount;
        }
    }
    public void withdraw(double amount){
        if (amount>=Amount){
            Amount= 0;
        } else if (amount<Amount) {
            Amount=Amount-amount;
        }
    }
}

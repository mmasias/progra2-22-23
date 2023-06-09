package Poo;

public class BankAccount {
    private String accountHolder;
    private Double amount;

    public Double amountWithdraw;

    public Double deposit;



    public BankAccount() {
    }
    public BankAccount(String $accountHolder, Double $amount, Double $amountWithdraw, Double $deposit) {
        this.accountHolder = $accountHolder;
        this.amount = $amount;
        this.amountWithdraw = $amountWithdraw;
        this.deposit = $deposit;
    }

    // Gets y Sets para ambas variables
    public String getAccountHolder() {
        return this.accountHolder;
    }

    public void setAccountHolder(String $accountHolder) {
        this.accountHolder = $accountHolder;
    }

    public Double getAmount() {
        return this.amount;
    }

    public void setAmount(Double $amount) {
        this.amount = $amount;
    }

    public Double getAmountWhithdraw() {
        return this.amount - this.amountWithdraw;
    }

    public void setAmountWithdraw(Double $amountWithdraw) {
        this.amountWithdraw = $amountWithdraw;
    }

    public Double getDeposit() {
        return this.deposit + this.amount;
    }

    public void setDeposit(Double $deposit) {
        this.deposit = $deposit;
    }

}



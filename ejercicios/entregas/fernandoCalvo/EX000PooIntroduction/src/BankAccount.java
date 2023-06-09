public class BankAccount {
    //todo Attributes
    private String titular;
    private double amount;
    //todo Constructor
    public BankAccount(String titular,double amount){

        this.titular = titular;

        if(amount<0){

        this.amount = 0;

        }else{

        this.amount = amount;

        }
    }
    //todo Method Deposit
    public void deposit(double amount){

        if(amount>0){

            this.amount += amount;

        }
    }
    //todo Method Withdraw
    public void withdraw(double amount){

    if(this.amount-amount<0){

        this.amount = 0;

    }else{

        this.amount-=amount;

    }

    }
    //todo Getters and Setters
    public String getTitular() {

        return titular;

    }

    public void setTitular(String titularX) {

        titular = titularX;

    }

    public double getAmount() {

        return amount;

    }

    public void setAmount(double amountX) {

        amount = amountX;

    }

}

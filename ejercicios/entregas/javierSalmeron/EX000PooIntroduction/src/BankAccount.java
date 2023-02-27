public class BankAccount{

    private String holder;
    private double amount;

    // BankAccount(String holder, double amount): This is the constructor of the
    // class which takes two parameters, holder (a String) and amount (a double).
    public BankAccount(String holder, double amount){
        this.holder = holder;
        this.amount = amount;
    }

    // getHolder(): This method returns the name of the account holder.
    public String getholder(){
        return this.holder;
    }

    // setHolder(String holder): This method sets the name of the account holder.
    public void setholder(String holder){
        this.holder = holder;
    }

    // getAmount(): This method returns the current balance in the account.
    public double getAmount(){
        return this.amount;
    }

    // setAmount(double amount): This method sets the current balance in the
    // account.
    public void setAmount(double amount){
        this.amount = amount;
    }

    // deposit(double amount): This method adds an amount to the current balance in
    // the account if its greater than 0.
    public void deposit(double amount){
        if(amount > 0){
            this.amount = this.amount + amount;
        }
    }

    // withdraw(double amount): This method subtracts an amount from the current
    // balance in the account if it is greater than 0 and if there are sufficient
    // funds in the account.
    public void withdraw(double amount){
        if(amount > 0 && this.amount >= amount){
            this.amount = this.amount - amount;
        }
    }
    
}
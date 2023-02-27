public class BankAccount {

    private String accountHolder;
    private double amount;

    public BankAccount(String accountHolder, double amount) {
        this.accountHolder = accountHolder;
        this.amount = amount;
    }

    String getAccountHolder() {
        return accountHolder;
    }

    void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    double getAmount() {
        return amount;
    }

    void setAmount(double quantity) {
        this.amount = quantity;
    }

    public void deposit(double amount){

        this.amount = (amount <= 0.0) ? this.amount : (this.amount + amount);

    }

    public void withdraw(double amount) {

        //invalidando valores negativos

        this.amount = (amount <= 0.0) ? this.amount : ((this.amount - amount) <= 0.0) ? 0.0 : (this.amount - amount);

    }

}

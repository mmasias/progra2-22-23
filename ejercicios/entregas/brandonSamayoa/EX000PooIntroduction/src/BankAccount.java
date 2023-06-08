public class BankAccount {

    private String owner;
    private double amount;

    public BankAccount(String owner, double amount) {
        this.owner = owner;
        this.amount = amount;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.amount += amount;
        }
    }

    public void withdraw(double amount) {
        if (this.amount - amount < 0) {
            this.amount = 0;
        } else {
            this.amount -= amount;
        }
    }
}
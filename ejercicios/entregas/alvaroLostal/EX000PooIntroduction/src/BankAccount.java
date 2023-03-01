public class BankAccount {

    private String headline;
    private double amount;

    public BankAccount(String headline, double amount) {
        this.headline = headline;
        this.amount = amount;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
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
        if (amount > 0 && this.amount - amount >= 0) {
            this.amount -= amount;
        } else {
            this.amount = 0;
        }
    }
}

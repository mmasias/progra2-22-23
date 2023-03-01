public class BankAccount {

    private String headline;
    private double amount;

    // Constructor
    public BankAccount(String titular, double amount) {
        this.headline = titular;
        this.amount = amount;
    }

    // Métodos get y set
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

    // Método para depositar dinero
    public void deposit(double amount) {
        if (amount > 0) {
            this.amount += amount;
        }
    }

    // Método para retirar dinero
    public void withdraw(double amount) {
        if (amount > 0 && this.amount - amount >= 0) {
            this.amount -= amount;
        } else {
            this.amount = 0;
        }
    }
}

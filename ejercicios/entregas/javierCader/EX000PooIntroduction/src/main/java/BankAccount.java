public class BankAccount {
    private String holder;
    private double amount;

    public BankAccount(String holder, double amount) {
        this.holder = holder;
        this.amount = amount;
    }

    public String getHolder() {
        return this.holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            return;
        } else {
            setAmount(this.amount + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount < 0) {
            return;
        } else {
            if (this.amount - amount < 0) {
                setAmount(0);
            } else {
                setAmount(this.amount - amount);
            }
        }
    }
}

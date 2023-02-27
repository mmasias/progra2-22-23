
public class BankAccount {

    private String owner;

    private double amount;

    public String getOwner(String Owner) {
        return this.owner;
    }

    public double getAmount(double Amount) {
        return this.amount;
    }

    public void setOwner(String Owner) {
        this.owner = Owner;
    }

    public void setAmount(double Amount) {
        this.amount = Amount;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            setAmount(this.amount + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            setAmount(this.amount - amount);
            if (amount > this.amount) {
                setAmount(0);
            }
        }
    }

}

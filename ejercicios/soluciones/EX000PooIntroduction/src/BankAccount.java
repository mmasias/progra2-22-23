public class BankAccount {
    private String owner;
    private float amount;

    /*
    * Constructor with parameters
    * @param owner the owner of the account
    * @param amount the amount of money in the account
    */
    public BankAccount(String owner, float amount) {
        this.owner = owner;
        this.amount = amount;
    }

    /*
     * Constructor without parameters, default values
     * amount = 0
     * owner = "Unknown"
     */
    public BankAccount() {
     this.amount = 0;
     this.owner = "Unknown";
    }

/*
     * Getter for the owner
     * @return the owner of the account
     */
    public String getOwner() {
        return this.owner;
    }

    /*
     * Getter for the amount
     * @return the amount of money in the account
     */
    public float getAmount() {
        return this.amount;
    }

    /*
     * Setter for the owner
     * @param owner the owner of the account
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /*
     * Setter for the amount
     * @param amount the amount of money in the account
     */
    public void setAmount(float amount) {
        this.amount = amount;
    }

    /*
     * Deposit money in the account
     * @param amount the amount of money to deposit, if negative, nothing happens
     */
    public void deposit(float amount) {
        if (amount > 0) {
            this.amount += amount;
        }
    }

    /*
     * Withdraw money from the account
     * @param amount the amount of money to withdraw,
     * if negative, amount is set to 0 and return the current amount of the account
     * @return the amount of money withdrawn
     */
    public float withdraw(float amount) {
        if (amount < 0) {
            amount = 0;
        }
        if (amount > this.amount) {
            amount = this.amount;
            this.amount = 0;
        } else {
            this.amount -= amount;
        }
        return amount;
    }

}

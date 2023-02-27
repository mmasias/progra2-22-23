package src;
public class BankAccount {
    private String owner;
    private double amount;
    public BankAccount(String owner, double amount){
        this.owner = owner;
        this.amount = amount;
    }
   public String getOwner(){
        return this.owner;
   }
   public void setOwner(String owner){
        this.owner = owner;
   }
   public void setAmount(double amount){
        this.amount = amount;
   }
    public double getAmount(double v) { return this.amount; }

        public void deposit(double amount){
        if (amount > 0){
            setAmount(this.amount + amount);
        }
   }
    public void withdraw(double amount) {
        if (amount > 0) {
            setAmount(this.amount - amount);
            if (amount > this.amount){
                setAmount(0);
            }
        }
    }
}
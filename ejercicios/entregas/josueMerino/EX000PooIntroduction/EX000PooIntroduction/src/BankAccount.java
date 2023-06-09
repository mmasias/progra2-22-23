public class BankAccount {
    private String owner;
    private double quantity;

    public BankAccount(String owner, double quantity) {
        this.owner = owner;
        this.quantity = quantity;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public void deposit(double amount){
        this.quantity += amount > 0 ? amount : 0;
    }

    public void withdraw(double amount){
        double totalAmount = this.quantity - (amount > 0 ? amount : 0);
        if(totalAmount < 0)
        {
            this.setQuantity(0);
        }
        else {
            this.setQuantity(totalAmount);
        }

    }
}

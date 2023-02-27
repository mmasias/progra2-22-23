public class BankAccount {
    private String user;
    private double quantity;
    
    public BankAccount(String user, double quantity) {
        this.user = user;
        this.quantity = quantity;
    }

    public String getTitular() {
        return user;
    }
    public void setTitular(String user) {
        this.user = user;
    }
    public double getCantidad() {
        return quantity;
    }
    public void setCantidad(double quantity) {
        this.quantity = quantity;
    }
    public void deposit(double quantity) {
        if (quantity > 0) {
            this.quantity += quantity;
        }
        else {
            System.out.println("It's not possible to deposit a negative amount");
        }
    }
    public void withdraw(double quantity) {
        if (this.quantity - quantity < 0) {
            quantity = 0;
        }
        else {
            this.quantity -= quantity;
        }
    }
}

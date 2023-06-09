public class BankAccount {

    private String userName;
    private double amount;

    public BankAccount(String userName, double amount) {
        this.userName = userName;
        this.amount = amount;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getMoney() {
        return amount;
    }

    public void setMoney(Double amount) {
        this.amount = amount;
    }

    public void deposit (double amount) {
        if(amount > 0){
            amount += amount;
        } else {
            System.out.println("You cannot deposit a negative amount.");
        }
    }

    public void withdraw (double amount) {
        if(amount > 0){
            amount -= amount;
        } else {
            System.out.println("You cannot withdraw a negative amount.");
        }
    }
}
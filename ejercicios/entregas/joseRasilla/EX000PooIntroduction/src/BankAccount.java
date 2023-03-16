public class BankAccount {
    private String holder;
    private double amount;

    public BankAccount(String holder, double amount) {
        this.holder = holder;
        this.amount = amount;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }


    public void deposit(double amount){
        if (amount > 0){
            double newAmount = amount + getAmount();
            setAmount(newAmount);
        }
    }

    public void withdraw(double amount){
        //Coded with money logics, only withdraw when money is available
        /*
        if (getAmount() >= amount){
            double newAmount = getAmount() - amount;
            setAmount(newAmount);
        }*/
        //Coded as requested
        double newAmount = getAmount() - amount;
        if (newAmount<=0){
            setAmount(0);
        }
        else {
            setAmount(newAmount);
        }
    }


}

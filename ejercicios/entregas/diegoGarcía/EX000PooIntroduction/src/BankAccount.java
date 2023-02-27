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

    void deposit(double addedAmount){

        if(addedAmount > 0){
            double newAmount = getAmount() + addedAmount;
                    setAmount(newAmount);
        }
    }

    void withdraw(double withdrewAmount){

        if(getAmount() < withdrewAmount){
            setAmount(0);
        }else{
            double newAmount = getAmount() - withdrewAmount;
            setAmount(newAmount);
        }


    }

}

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

    public boolean deposit(double amount){
        boolean ok=false;
        if (amount > 0){
            this.amount +=amount;
            ok= true;
        }
        return ok;

    }

    public boolean whithdraw(double money){
        boolean ok=false;
        if (amount >= money){
            this.amount-=money;//this.amount=this.amount-money
            ok= true;
        }else {
            this.amount=0;
        }
        return ok;

    }




}
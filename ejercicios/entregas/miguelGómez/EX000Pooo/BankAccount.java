public class BankAccount {
    // Atributos
    private String headline;
    private double amount;

    public BankAccount(String headline){
        this(headline,0);
    }
    public BankAccount(String headline, double amount){

        this.headline= headline;

        if(amount < 0){
            this.amount = 0;
        }else{
            this.amount = amount;
        }

    }
    public String getHeadline() {
        return headline;
    }
    public void setHeadline(String headline) {
        this.headline = headline;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public void deposit(double amount){
        if(amount > 0){
        this.amount += amount;
        }
    }
    public void withdraw(double amount){
        if(this.amount - amount < 0){
        this.amount = 0;
        }else{
            this.amount= this.amount - amount;
        }
    }
    @Override
    public String toString() {
        return "The Bankaccount Owner " + headline + " currently has " + this.amount + " euros in his account";
    }
    
}

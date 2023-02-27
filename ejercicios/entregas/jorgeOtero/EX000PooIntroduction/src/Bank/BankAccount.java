package Bank;
public class BankAccount {

    private String accountHolder;
    private static double myAmount;

    public void setAmount(double amount){
        this.myAmount = amount;
    }

    public double getAmount() {
        return myAmount;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public static double deposit(double amount){
        if(amount>0){
            myAmount = myAmount + amount;
        }else {}
        return myAmount;
    }
    public static double withdraw(double amount){
        if (amount > myAmount) {
            myAmount = 0;
        }else if(amount < 0){

        }else {
            myAmount  = myAmount - amount;
        }

        return myAmount;
    }






}
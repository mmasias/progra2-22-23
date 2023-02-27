
public class BankAccount {

       private String accountHolder;
       private double account;

    public BankAccount(String accountHolder, double account) {
        this.accountHolder = accountHolder;
        this.account = account;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getAccount() {
        return account;
    }

    public void setAccount(double account) {
        this.account = account;
    }
    public boolean deposit (double amount){
        boolean ok = false;
        if (amount > 0){
            this.account += amount;
            ok = true;
        }
        return ok;
    }
    public boolean withdraw(double money){
        boolean ok = false;
        if (account >= money){
            this.account -= money;

         ok = true;
        }else{
            this.account = 0;
        }
        return ok;
    }



}

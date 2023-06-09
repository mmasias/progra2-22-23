public class BankAccount {
    
        private String HolderAccounter;
        private double Account;
 
     public BankAccount(String accountHolder, double account) {
         this.HolderAccounter = accountHolder;
         this.Account = account;
     }
 
     public String getAccountHolder() {
         return HolderAccounter;
     }
 
     public void setAccountHolder(String accountHolder) {
         this.HolderAccounter = accountHolder;
     }
 
     public double getAccount() {
         return Account;
     }
 
     public void setAccount(double account) {
         this.Account = account;
     }
     public boolean deposit (double amount){
         boolean ok = false;
         if (amount > 0){
             this.Account += amount;
             ok = true;
         }
         return ok;
     }
     public boolean withdraw(double money){
         boolean ok = false;
         if (Account >= money){
             this.Account -= money;
 
          ok = true;
         }else{
             this.Account = 0;
         }
         return ok;
     }
 
 
 
 }

import Bank.BankAccount;
public class Main {
    public static void main(String[] args) {

        BankAccount owner = new BankAccount();
        owner.setAccountHolder("Carlos");
        System.out.println(owner.getAccountHolder());


        BankAccount account = new BankAccount();
        account.setAmount(120.1);
        System.out.println(account.getAmount());

        System.out.println(account.withdraw(120));
        account.setAmount(120.1);
        System.out.println(account.deposit(120));
    }
}
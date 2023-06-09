import Poo.BankAccount;

public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountHolder("John");
        System.out.println(bankAccount.getAccountHolder());
        bankAccount.setAmount(200.50);
        System.out.println(bankAccount.getAmount());
        bankAccount.setAmountWithdraw(100.50);
        System.out.println(bankAccount.getAmountWhithdraw());
        bankAccount.setDeposit(50.50);
        System.out.println(bankAccount.getDeposit());

    }
}
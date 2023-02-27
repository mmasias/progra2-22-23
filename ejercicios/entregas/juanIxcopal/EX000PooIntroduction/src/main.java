import Poo.BankAccount;

public class main {
    public static void main(String[] args) {
        BankAccount headline = new BankAccount();
        headline.setHeadline("Juan");

        BankAccount amount = new BankAccount();
        amount.setAmount(45.85);


        System.out.println("Nombre de cuenta: " + headline.getHeadline());
        System.out.println("Saldo de la cuenta: " + amount.getAmount());
    }
}
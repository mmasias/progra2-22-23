public class BankAccountTest {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("Juan", 1000.0);
        System.out.println("Account 1 - Headline: " + account1.getHeadline() + " - Amount: " + account1.getAmount());

        BankAccount account2 = new BankAccount("Maria", 500.0);
        account2.deposit(250.0);
        System.out.println("Account 2 - Headline: " + account2.getHeadline() + " - Amount: " + account2.getAmount());

        BankAccount account3 = new BankAccount("Pedro", 2000.0);
        account3.deposit(500.0);
        account3.withdraw(1000.0);
        System.out.println("Account 3 - Headline: " + account3.getHeadline() + " - Amount: " + account3.getAmount());

        BankAccount account4 = new BankAccount("Luisa", 1500.0);
        account4.deposit(-200.0);
        System.out.println("Account 4 - Headline: " + account4.getHeadline() + " - Amount: " + account4.getAmount());

        BankAccount account5 = new BankAccount("Carlos", 3000.0);
        account5.withdraw(-500.0);
        System.out.println("Account 5 - Headline: " + account5.getHeadline() + " - Amount: " + account5.getAmount());

        BankAccount account6 = new BankAccount("Ana", 1000.0);
        account6.withdraw(1500.0);
        System.out.println("Account 6 - Headline: " + account6.getHeadline() + " - Amount: " + account6.getAmount());
    }
}

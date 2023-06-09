package Poo;

import org.junit.Test;
import java.util.Scanner;

public class BankAccountTest {

    BankAccount account1 = new BankAccount();
    BankAccount account2 = new BankAccount();
    BankAccount account3 = new BankAccount();
    Scanner scanner = new Scanner(System.in);

    @Test
    public void CreateAccount() {
        account1.setName("Juan");
        account1.setBalance(100);
    }

    @Test
    public void addMoney() {
        System.out.println("How much money do you want to deposit?");
        double amount = scanner.nextDouble();
        account2.deposit(amount);
        System .out.println("Now you have : "+account2.getBalance()+ " in your account.");
    }

    @Test
    public void moveMoney() {
        System.out.println("How much money do you want to deposit?");
        double amount = scanner.nextDouble();
        account3.deposit(amount);
        System.out.println("and to withdraw?");
        double amount2 = scanner.nextDouble();
        account3.withdraw(amount2);
        System.out.println("Now you have : "+account3.getBalance()+ " in your account.");
    }






}

package clases;

import java.time.LocalDate;

public class BankAccount {

    //Attributes
    private String AccountHolder;
    private double balance;

    //format rules
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    /*Constructor with parameters
    * @ accountHolderName : String
    * @ amount : double
    */
    public BankAccount(String accountHolderName, double amount) {

        this.AccountHolder = accountHolderName;
        this.balance = amount;
    }

    //Empty Constructor
    public BankAccount() {

    }
    public void deposit(double amount) {

        String currency = "€";

        if (amount <= 0) {

            System.out.println(this.ANSI_YELLOW + "It's not possible. You entered a negative amount, please try again."
                                + this.ANSI_RESET);

        } else {

            this.balance = this.balance + amount;

            System.out.println(this.ANSI_BLUE + "-------------------------------------------------------------"
                    + this.ANSI_RESET);

            System.out.println("You have made an deposit of: " + amount + " " + currency);

            System.out.println(this.ANSI_GREEN + "The current balance is: " + this.ANSI_RESET + this.balance + " "
                                + currency);

            System.out.println(this.ANSI_BLUE + "-------------------------------------------------------------"
                                 + this.ANSI_RESET);
        }
    }

    public void withdrawal(double amount) {

        String currency = "€";


        if (amount < 0) {
            System.out.print("It's not possible. You entered a negative amount, please try again.");


        } else {
            if (this.balance > amount) {

                this.balance = this.balance - amount;
                System.out.println(this.ANSI_BLUE + "-------------------------------------------------------------"
                        + this.ANSI_RESET);

                System.out.println("You have made an withdrawal of: " + amount + " " + currency);

                System.out.println(this.ANSI_GREEN + "The current balance is: " + this.ANSI_RESET + this.balance + " "
                        + currency);

                System.out.println(this.ANSI_BLUE + "-------------------------------------------------------------"
                        + this.ANSI_RESET);

            } else {

                this.balance = balance;
                System.out.println(ANSI_RED+"ERROR: Operation denied due to lack of balance in your account"
                        +ANSI_RESET);

            }


        }

    }

    //extra method
    public void msgAccount() {

        System.out.println(this.ANSI_BLUE + "           -------------------------------------------------------------"
                + this.ANSI_RESET);

        System.out.println(LocalDate.now() + this.ANSI_BLUE + " | " + this.ANSI_RESET + this.AccountHolder
                + this.ANSI_BLUE + " Account created successfully |");
        System.out.println("           -------------------------------------------------------------"
                + this.ANSI_RESET);
        System.out.println("Name: "+getAccountHolder() + "  " + "Balance: " + getBalance());

        System.out.println("");

    }

    public String getAccountHolder() {
        return AccountHolder;
    }

    public double getBalance() {
        return balance;
    }
}




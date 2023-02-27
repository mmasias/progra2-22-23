import testing.BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Sara", 1000);
        double deposit = account1.deposit(-100);
        //deposit = double.valueOf(String.format("%.2f", deposit));
        System.out.println(deposit);
        BankAccount account2 = new BankAccount("Aisha", 200);
        double withdraw = account2.withdraw(-100);
        System.out.println(withdraw);
        BankAccount account3 = new BankAccount("Sebastian", 500);
        double withdraw2 = account3.withdraw(1000);
        System.out.println(withdraw2);
    
    }
}
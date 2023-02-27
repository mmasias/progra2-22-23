public class BankAccountTest {
    public static void main(String[] args) {
        
        BankAccount account1 = new BankAccount("Miguel", 150.00);
    
        account1.deposit((120.00));
    
        account1.withdraw((20.00));
    
        System.out.println(account1);
    }
}
    
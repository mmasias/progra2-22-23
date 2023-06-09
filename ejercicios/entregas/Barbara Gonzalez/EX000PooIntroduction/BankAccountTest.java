public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount account_1 = new BankAccount("Barbara", 400);
        BankAccount account_2 = new BankAccount("Mario", 300);
        
         
        //Ingresa dinero en las cuentas
        account_1.deposit(300);
        account_2.deposit(400);
        

         
        //Retiramos dinero en las cuentas
        account_1.withdraw(500);
        account_2.withdraw(100);
        
         
        //Muestro la informacion de las cuentas
        System.out.println(account_1); // 200 euros
        System.out.println(account_2); // 600 euros
       
    }
    
}

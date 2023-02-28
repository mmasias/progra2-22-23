public class BankAccountTest {

    public static void main(String[] args) {

        // Crear una cuenta bancaria con un titular y una cantidad inicial
        BankAccount account1 = new BankAccount("Juan", 1000.0);
        System.out.println("Cuenta 1 - Titular: " + account1.getTitular() + " - Cantidad: " + account1.getCantidad());

        // Crear una cuenta bancaria, ingresar una cantidad en la cuenta
        BankAccount account2 = new BankAccount("Maria", 500.0);
        account2.deposit(250.0);
        System.out.println("Cuenta 2 - Titular: " + account2.getTitular() + " - Cantidad: " + account2.getCantidad());

        // Crear una cuenta bancaria, ingresar y retirar una cantidad
        BankAccount account3 = new BankAccount("Pedro", 2000.0);
        account3.deposit(500.0);
        account3.withdraw(1000.0);
        System.out.println("Cuenta 3 - Titular: " + account3.getTitular() + " - Cantidad: " + account3.getCantidad());

        // Crear una cuenta bancaria, ingresar una cantidad negativa
        BankAccount account4 = new BankAccount("Luisa", 1500.0);
        account4.deposit(-200.0);
        System.out.println("Cuenta 4 - Titular: " + account4.getTitular() + " - Cantidad: " + account4.getCantidad());

        // Crear una cuenta bancaria, retirar una cantidad negativa
        BankAccount account5 = new BankAccount("Carlos", 3000.0);
        account5.withdraw(-500.0);
        System.out.println("Cuenta 5 - Titular: " + account5.getTitular() + " - Cantidad: " + account5.getCantidad());

        // Crear una cuenta bancaria, retirar una cantidad mayor a la que hay en la cuenta
        BankAccount account6 = new BankAccount("Ana", 1000.0);
        account6.withdraw(1500.0);
        System.out.println("Cuenta 6 - Titular: " + account6.getTitular() + " - Cantidad: " + account6.getCantidad());
    }
}

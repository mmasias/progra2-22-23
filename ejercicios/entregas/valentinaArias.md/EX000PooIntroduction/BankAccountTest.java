import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

  @Test
  void crearCuentaConTitularYCantidadInicial() {
    BankAccount cuenta = new BankAccount("Juan", 100);
    assertEquals("Juan", cuenta.getTitular());
    assertEquals(100, cuenta.getCantidad());
  }

  @Test
  void ingresarCantidadEnCuenta() {
    BankAccount cuenta = new BankAccount("Juan", 100);
    cuenta.deposit(50);
    assertEquals(150, cuenta.getCantidad());
  }

  @Test
  void ingresarYRetirarCantidadEnCuenta() {
    BankAccount cuenta = new BankAccount("Juan", 100);
    cuenta.deposit(50);
    cuenta.withdraw(20);
    assertEquals(130, cuenta.getCantidad());
  }

  @Test
  void ingresarCantidadNegativaEnCuenta() {
    BankAccount cuenta = new BankAccount("Juan", 100);
    cuenta.deposit(-50);
    assertEquals(100, cuenta.getCantidad());
  }

  @Test
  void retirarCantidadNegativaEnCuenta() {
    BankAccount cuenta = new BankAccount("Juan", 100);
    cuenta.withdraw(-50);
    assertEquals(100, cuenta.getCantidad());
  }

  @Test
  void retirarCantidadMayorQueLaCantidadEnCuenta() {
    BankAccount cuenta = new BankAccount("Juan", 100);
    cuenta.withdraw(150);
    assertEquals(0, cuenta.getCantidad());
  }
}

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import src.BankAccount;
public class BankAccountTest {
    @Test
    public void testBankAccountGetAttributes() {
        BankAccount bankAccount = new BankAccount("John", 5.0);
        Assertions.assertEquals("John", bankAccount.getOwner());
        Assertions.assertEquals(5.0, bankAccount.getAmount(0.0));
    }
}
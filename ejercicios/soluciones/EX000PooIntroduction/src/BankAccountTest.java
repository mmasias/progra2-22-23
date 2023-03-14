import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class BankAccountTest {

    @Test
    @DisplayName("Test constructor with default values")
    void constructorDefault() {
        BankAccount account = new BankAccount();

        String actualOwner = account.getOwner();
        String expectedOwner = "Unknown";

        assertEquals(expectedOwner, actualOwner);
    }

    @Test
    void getOwner() {
        BankAccount account = new BankAccount("John Doe", 1000);

        String actualOwner = account.getOwner();
        String expectedOwner = "John Doe";

        assertEquals(expectedOwner, actualOwner);
    }

    @Test
    @DisplayName("Test new account with 1000")
    void getAmount() {
        BankAccount account = new BankAccount("John Doe", 1000);

        float actualAmount = account.getAmount();
        float expectedAmount = 1000;

        assertEquals(expectedAmount, actualAmount);
    }

    @Test
    @DisplayName("Test deposit 1000 and withdraw 500")
    void deposit() {
        BankAccount account = new BankAccount("John Doe", 1000);
        account.deposit(1000);
        account.withdraw(500);

        float actualAmount = account.getAmount();
        float expectedAmount = 1500;

        assertEquals(expectedAmount, actualAmount);

    }

    @Test
    @DisplayName("Test deposit negative amount and check if amount is still 1000")
    void depositNegative() {
        BankAccount account = new BankAccount("John Doe", 1000);
        account.deposit(-500);

        float actualAmount = account.getAmount();
        float expectedAmount = 1000;

        assertEquals(expectedAmount, actualAmount);
    }

    @Test
    @DisplayName("Test withdraw a bigger amount than the account has and check if amount is 0")
    void negativeWithdraw() {
        BankAccount account = new BankAccount("John Doe", 1000);
        account.withdraw(1500);

        float actualAmount = account.getAmount();
        float expectedAmount = 0;

        assertEquals(expectedAmount, actualAmount);
    }

    @Test
    @DisplayName("Test withdraw a negative amount and check if amount is still 1000")
    void withdrawNegative() {
        BankAccount account = new BankAccount("John Doe", 1000);
        account.withdraw(-500);

        float actualAmount = account.getAmount();
        float expectedAmount = 1000;

        assertEquals(expectedAmount, actualAmount);
    }
}
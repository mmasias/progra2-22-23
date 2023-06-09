import org.junit.Assert;
import org.junit.Test;

public class AdminTest {

    @Test
    public void testIsAdmin() {
        // Arrange
        Admin admin = new Admin("admin", "password", "Fernando Calvo");

        // Act
        boolean result = admin.isAdmin();

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void testSetAdmin() {
        // Arrange
        Admin admin = new Admin("admin", "password", "Fernando Calvo");

        // Act
        admin.setAdmin(false);
        boolean result = admin.isAdmin();

        // Assert
        Assert.assertFalse(result);
    }
}

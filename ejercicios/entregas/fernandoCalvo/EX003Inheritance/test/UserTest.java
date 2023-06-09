import org.junit.Test;
import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void testConstructor() {
        User user = new User("Fernando Calvo", "fcalvo", "1234");

        assertEquals("Fernando Calvo", user.getName());
        assertEquals("fcalvo", user.getLogin());
        assertEquals("1234", user.getPassword());
    }

}

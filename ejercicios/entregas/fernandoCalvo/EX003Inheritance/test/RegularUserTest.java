import org.junit.Test;
import static org.junit.Assert.*;

public class RegularUserTest {

    @Test
    public void testConstructor() {
        RegularUser user = new RegularUser("fcalvo", "1234", "Fernando Calvo");

        assertEquals("fcalvo", user.getName());
        assertEquals("1234", user.getLogin());
        assertEquals("Fernando Calvo", user.getPassword());
    }

}

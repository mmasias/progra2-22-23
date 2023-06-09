import org.junit.Assert;
import org.junit.Test;

public class UsersTest {

    @Test
    public void testGetters() {
        Options options = new Options();
        Users user = new Users("Juan Jimenez", "JuanJ", "72302", options);

        Assert.assertEquals("Juan Jimenez", user.getName());
        Assert.assertEquals("JuanJ", user.getLogin());
        Assert.assertEquals("72302", user.getPassword());
        Assert.assertEquals(options, user.myOpcions());
    }
}
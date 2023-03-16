import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
public class OptionTest {
    private final InputStream systemIn = System.in;
    private ByteArrayInputStream testIn;
    @Before
    public void setUp() {
        testIn = new ByteArrayInputStream("3\n".getBytes(StandardCharsets.UTF_8));
        System.setIn(testIn);   }
    @After
    public void tearDown() {
        System.setIn(systemIn);    }
    @Test
    public void testDisplay() {
        String[] options = { "firstOption", "secondOption", "thirdOption" };
        Option option = new Option(options);
        option.display();
        option.closeScanner();    }
    @Test
    public void testRead() {
        String[] options = { "firstOption", "secondOption", "thirdOption" };
        Option option = new Option(options);
        int expected = 3;
        int actual = option.read();
        assertEquals(expected, actual);
        option.closeScanner();    }}
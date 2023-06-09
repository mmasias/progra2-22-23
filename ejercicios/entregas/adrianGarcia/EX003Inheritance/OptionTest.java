import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;
class OptionTest {
    @Test
    void testOptionCreationAndDisplay() {
        String[] options = new String[] { "1Option", "2Option" };
        Option option = new Option(options);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        option.display();
        String lineSeparator = System.lineSeparator();
        String expectedOutput = "Select an option:" + lineSeparator + "1Option" + lineSeparator + "2Option" + lineSeparator;
        assertEquals(expectedOutput, outContent.toString());   }}
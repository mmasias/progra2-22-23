import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

class OptionTest {
    @Test
    void testOptionCreationAndDisplay() {
        String[] options = new String[] { "Option 1", "Option 2" };
        Option option = new Option(options);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        option.display();

        String lineSeparator = System.lineSeparator();
        String expectedOutput = "Please select an option:" + lineSeparator +
                "1. Option 1" + lineSeparator +
                "2. Option 2" + lineSeparator;

        assertEquals(expectedOutput, outContent.toString());
    }
}

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class OptionTest {
    User v;
    @BeforeEach
    void setUp() {
    }

    @Test
    void getOptionList() {
        Option option = new Option(3);
        option.newOptionsMenu("Option 1");
        option.newOptionsMenu("Option 2");
        option.newOptionsMenu("Option 3");
        String[] expected = {"Option 1", "Option 2", "Option 3"};
        assertArrayEquals(expected, option.getOptionList());
    }

    @Test
    void setOptionList() {
        Option option = new Option(3);
        option.newOptionsMenu("Option 1");
        option.newOptionsMenu("Option 2");
        option.newOptionsMenu("Option 3");

        String[] newOptions = {"New Option 1", "New Option 2"};
        option.setOptionList(newOptions);

        String[] expected = {"New Option 1", "New Option 2"};
        assertArrayEquals(expected, option.getOptionList());
    }

    @Test
    void getMaxOptions() {
        Option option = new Option(5);
        assertEquals(5, option.getMaxOptions());
    }

    @Test
    void setMaxOptions() {
        Option option = new Option(5);
        option.setMaxOptions(3);
        assertEquals(3, option.getMaxOptions());
    }

    @Test
    void getRealOptions() {
        Option option = new Option(5);
        option.newOptionsMenu("Option 1");
        option.newOptionsMenu("Option 2");
        assertEquals(2, option.getRealOptions());
    }

    @Test
    void setRealOptions() {
        Option option = new Option(5);
        option.setRealOptions(3);
        assertEquals(3, option.getRealOptions());
    }

    @Test
    void newOptionsMenu() {
        Option option = new Option(3);
        option.newOptionsMenu("Option 1");
        option.newOptionsMenu("Option 2");
        option.newOptionsMenu("Option 3");
        option.newOptionsMenu("Option 4");
        assertEquals(option.getRealOptions(), 3);
        assertArrayEquals(option.getOptionList(), new String[]{"Option 1", "Option 2", "Option 3"});
    }


    @Test
    void showMenu() {
        Option option = new Option(3);
        option.newOptionsMenu("Option 1");
        option.newOptionsMenu("Option 2");
        option.newOptionsMenu("Option 3");
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);
        option.showMenu();
        String expectedOutput = "Option 1\r\nOption 2\r\nOption 3\r\n";
        assertEquals(expectedOutput, outputStream.toString());
    }

}
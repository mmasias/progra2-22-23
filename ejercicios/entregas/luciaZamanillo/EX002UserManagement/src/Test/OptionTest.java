package Test;

import Poo.Option;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OptionTest {
    Option newOption;

    @BeforeEach
    void setUp() {
        newOption = new Option();
    }

    @Test
    void getSelectedOption() {
        int expected = 0;
        int actual = newOption.getSelectedOption();
        assertEquals(expected, actual);

    }

    @Test
    void setSelectedOption() {
        newOption.setSelectedOption(3);
        int expected = 3;
        assertEquals(expected, newOption.getSelectedOption());
    }

    @Test
    void addOption() {
        newOption.addOption("new password");
        String addedOption = "new password";
        assertEquals(addedOption, newOption.getOption(0));
    }

    @Test
    void getOption() {
        newOption.addOption("new user");
        newOption.addOption("new password");
        newOption.addOption("scan page");

        String actual = newOption.getOption(2);
        String expected = "scan page";

        assertEquals(expected, actual);
    }
}

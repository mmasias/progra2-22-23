package Test;

import Main.Option;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OptionTest {
    Option option = new Option (0,5);
    String option1 = "option 1";
    @Test
    void addOption() {
        option.addOption(option1);
        assertEquals(option1,option.getOption(0));
    }

    @Test
    void getOption() {
        option.addOption(option1);
        assertEquals(option1,option.getOption(0));
    }

    @Test
    void selectOption() {
        option.addOption(option1);
        option.selectOption(0);
    }

    @Test
    void getSelectedOption() {
        option.addOption(option1);
        assertEquals(option1,option.getSelectedOption());
    }

    @Test
    void showOptions() {
        option.addOption("Option 1");
        option.addOption("Option 2");
        option.addOption("Option 3");
        option.showOptions();
    }
}
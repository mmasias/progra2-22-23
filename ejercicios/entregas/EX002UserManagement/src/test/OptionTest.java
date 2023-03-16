package test;

import Main.Option;
import Main.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OptionTest {
    Option option;

    void setUp() {
        option = new Option(1, 3, 6);
    }
    @Test
    void getOptionList() {
            assertEquals(1, option.getOptionList());
    }


    @Test
    void setOptionList() {
        option.setOptionList(3);
        assertEquals(2, option.getOptionList());
    }

    @Test
    void getSelectedOption() {
        assertEquals(1, option.getSelectedOption());
    }

    @Test
    void setSelectedOption() {
        option.setSelectedOption(2);
        assertEquals(2, option.getSelectedOption());
    }

    @Test
    void getMaxOptions() {
        assertEquals(6, option.getMaxOptions());

    }

    @Test
    void setMaxOptions() {
        option.setMaxOptions(4);
        assertEquals(4, option.getMaxOptions());
    }

    @Test
    void add() {
    }

    @Test
    void showOptions() {
        assertEquals(6, option.showOptions(5));


    }

    @Test
    void oneOption() {
    }
}

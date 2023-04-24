import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OptionTest {
    Option o;
    @BeforeEach
    void setUp() {
        String [] options={"open conversation","Save doc", "Exit"};
        o=new Option(100,options, 3) ;
    }

    @Test
    void getOptionList() {

    }

    @Test
    void setOptionList() {
    }

    @Test
    void getSelectedOption() {
        assertEquals(3,o.getSelectedOption());
    }

    @Test
    void setSelectedOption() {
        o.setSelectedOption(8);
        assertEquals(8,o.getSelectedOption());
    }

    @Test
    void getMaxOptions() {
        assertEquals(100,o.getMaxOptions());
    }

    @Test
    void setMaxOptions() {
        o.setMaxOptions(500);
        assertEquals(500,o.getMaxOptions());
    }

    @Test
    void add() {
    }

    @Test
    void showMenu() {
    }

    @Test
    void showOption() {
    }
}
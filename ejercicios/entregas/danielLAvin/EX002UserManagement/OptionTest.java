package Test;

import Codigo.Option;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OptionTest {
    Option o1;

    @BeforeEach
    void setUp() {
        String []options={"open dialogue","Save document","Exit"};
        o1=new Option(200,options,3);
    }

    @Test
    void getMaxOptions() {
        assertEquals(200,o1.getMaxOptions());
    }

    @Test
    void setMaxOptions() {
        o1.setMaxOptions(100);
        assertEquals(100,o1.getMaxOptions());
    }

    @Test
    void getOptions() {
    }

    @Test
    void setOptions() {
    }

    @Test
    void getSelectedOption() {
        assertEquals(3, o1.getSelectedOption());
    }

    @Test
    void setSelectedOption() {
        o1.setSelectedOption(5);
        assertEquals(5,o1.getSelectedOption());
    }

    @Test
    void addOption() {
    }

    @Test
    void showMenu() {
    }

    @Test
    void showOption() {
    }
}
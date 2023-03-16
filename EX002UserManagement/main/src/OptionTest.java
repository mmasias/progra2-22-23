import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OptionTest{


    Option o1;

    @BeforeEach
    void setUp() {
        String[] myOptions={"open","hack","view","close"};
        o1= new Option(myOptions,4,5);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getOptions() {
        String[] myOptions={"open","hack","view","close"};
        assertArrayEquals(myOptions,o1.getOptions());
    }

    @Test
    void getOptionSelected() {
        assertEquals(4,o1.getOptionSelected());
    }

    @Test
    void getnOptions() {
        assertEquals(5,o1.getnOptions());
    }

    @Test
    void insert() {
    }

    @Test
    void getOptionByNumber() {
    }
}
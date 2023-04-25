package test.ex1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomDateTest {

    @Test
    @DisplayName("Display the date in the format dd/mm/yyyy")
    void testToString() {
        CustomDate customDate = new CustomDate(25, 3, 2023);
        String expectedDate = "25/03/2023";
        String actualDate = customDate.toString();

        assertEquals(expectedDate, actualDate);
    }

    @Test
    @DisplayName("Display the date in the format dd-mm-yyyy if the separator is -")
    void format() {
        CustomDate customDate = new CustomDate(25, 3, 2023);
        String expectedFormatedDate = "25-03-2023";
        String actualFormatedDate = customDate.format("-");

        assertEquals(expectedFormatedDate, actualFormatedDate);
    }
}
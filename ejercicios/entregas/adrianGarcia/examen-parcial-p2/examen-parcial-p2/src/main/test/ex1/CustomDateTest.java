package main.ex1.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.ex1.CustomDate;

public class CustomDateTest {

    @Test
    public void testToString() {
        CustomDate date = new CustomDate(25, 4, 2023);
        String expectedOutput = "25/04/2023";
        assertEquals(expectedOutput, date.toString());
    }

    @Test
    public void testFormat() {
        CustomDate date = new CustomDate(25, 4, 2023);
        String expectedOutput = "25-04-2023";
        assertEquals(expectedOutput, date.format("dd-MM-yyyy"));
    }

}



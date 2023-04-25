package com.progra.geometry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    Circle testCircle;
    @Test
    void getMagicNumber() {

        testCircle = new Circle(0, 0, 0);

        int expected = 7;
        int actual = testCircle.getMagicNumber();

        assertEquals(expected, actual);


    }
}
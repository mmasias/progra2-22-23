package test;

import main.Complex;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @Test
    void testEquals() {
        Complex a = new Complex(5.4, -67.0);
        Complex b = new Complex(5.4, -67.0);

        boolean expected = true;
        boolean actual = a.equals(b);

        assertEquals(expected, actual);
    }

    @Test
    void greaterThan() {
        Complex a = new Complex(5.4, -67.0);
        Complex b = new Complex();

        boolean expected = true;
        boolean actual = a.greaterThan(b);

        assertEquals(expected, actual);
    }

    @Test
    void lessThan() {

        Complex a = new Complex();
        Complex b = new Complex(5.4, -67.0);

        boolean expected = true;
        boolean actual = a.lessThan(b);

        assertEquals(expected, actual);
    }

    @Test
    void equalsTo() {
        Complex a = new Complex(5.4, -67.0);
        Complex b = new Complex(5.4, -67.0);

        boolean expected = true;
        boolean actual = a.equalsTo(b);

        assertEquals(expected, actual);
    }
}
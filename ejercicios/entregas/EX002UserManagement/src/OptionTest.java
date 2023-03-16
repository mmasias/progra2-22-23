import org.junit.jupiter.api.Test;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
public class OptionTest {
    static Scanner sc = new Scanner(System.in);
    @Test
    void creationTest(){
        Option option = new Option(3);

    }
    @Test
    void getOption(){
        Option option = new Option(3);

        int expectedNumber = 3;
        assertEquals(expectedNumber, option);
    }

}

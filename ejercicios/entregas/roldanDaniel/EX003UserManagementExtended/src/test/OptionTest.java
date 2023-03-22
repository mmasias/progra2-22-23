package src.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import src.main.Option;

import static org.junit.jupiter.api.Assertions.*;

class OptionTest {


    @Test

    void validateGetOption(){

        Option optionTest = new Option();
        optionTest.addOption("1-home");
        Assertions.assertEquals(optionTest.getOptions(),"1-home");
    }


    @Test
    void validateAddOption(){

        Option optionTest = new Option();
        optionTest.addOption("hola");
        optionTest.selectOption(1);
        Assertions.assertEquals(,"hola");


    }
}
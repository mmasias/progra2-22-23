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


        String [] optionsTest = new String[2];

        Option option = new Option();

        option.addOption(optionsTest[0])=;



        Assertions.assertEquals(optionsTest[0], "Holas");


    }
}
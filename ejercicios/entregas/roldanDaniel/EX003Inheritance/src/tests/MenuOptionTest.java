package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import progra2.com.classes.MenuOption;
import progra2.com.classes.Option;
import progra2.com.classes.User;

import static org.junit.jupiter.api.Assertions.*;

class MenuOptionTest {


    @Test
    void validateInsertDescription(){


        MenuOption main = new MenuOption();

        main.setDescription("busca el recurso necesario");
        Assertions.assertEquals(main.getDescription(),"busca el recurso necesario");


    }

    @Test
    void validateGetDescription(){

        MenuOption menu = new MenuOption();

        Assertions.assertEquals(menu.getDescription(),"");
    }

}
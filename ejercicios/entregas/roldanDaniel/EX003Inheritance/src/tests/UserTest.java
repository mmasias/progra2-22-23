package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import progra2.com.classes.User;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void validateGetUserName(){
        String name= "Pedro@gmail";
        User us1 = new User();
        us1.setUserName(name);
        Assertions.assertEquals(us1.getUserName(),name);

    }
    @Test
    void validateGetPassword(){
        String pass= "23432";
        User us1 = new User();
        us1.setPassword(pass);
        Assertions.assertEquals(us1.getPassword(),pass);

    }
    @Test
    void validateGetName(){
        String name= "Pedro Gomez";
        User us1 = new User();
        us1.setName(name);
        Assertions.assertEquals(us1.getName(),name);

    }


}
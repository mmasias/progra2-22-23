package test;
import main.User;
import org.junit.jupiter.api.Test;

import static main.Manager.addUser;
import static main.Manager.authentication;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {

    @Test
    public void authenticationTest() {

        User dievex = new User("dievex", "hola" );
        User[] userList = new User[1];
        addUser(dievex, 2, userList);

        boolean expectedAnswer = true;
        boolean authenticated = authentication("dievex", "hola", userList);

        assertTrue( authenticated);
    }

    @Test
    public void authenticationTestError() {

        User dievex = new User("dievex", "hola" );
        User[] userList = new User[1];
        addUser(dievex, 2, userList);

        boolean expectedAnswer = true;
        boolean authenticated = authentication("dievex", "adios", userList);

        assertFalse( authenticated);
    }



}
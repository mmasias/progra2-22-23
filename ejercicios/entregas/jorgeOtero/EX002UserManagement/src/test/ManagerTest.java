package test;

import main.Manager;
import main.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ManagerTest {

    @Test
        void addUserTest(){

        Manager manager = new Manager(1);
        User user = new User("Ad","as");
        manager.addUser(user);
        String nee = manager.members[0].getUserName();
        assertEquals("Ad", nee );
    }
    @Test
    void profileOnTest(){
        Manager manager = new Manager(1);
        User user = new User("Ad","as");
        User userTwo = new User("Ak","at");
        manager.addUser(user);
        manager.addUser(userTwo);
        user.setLogin(true);

        assertEquals(0, manager.profileOn() );
    }
}

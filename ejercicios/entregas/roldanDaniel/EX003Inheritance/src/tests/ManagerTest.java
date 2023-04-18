package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import progra2.com.classes.AdminUser;
import progra2.com.classes.Manager;
import progra2.com.classes.User;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {


    @Test
    void validateAddUsers (){

        Manager m1 = new Manager(2);
        AdminUser admin = new AdminUser("danie","12","daniel",true);
        m1.addUsers(admin);
        Assertions.assertEquals(m1.getSize(),1);
    }

}
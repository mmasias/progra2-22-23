package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import progra2.com.classes.AdminUser;

import static org.junit.jupiter.api.Assertions.*;

class AdminUserTest {



    @Test
    void validateIsAdmind(){

       AdminUser userAdmin = new AdminUser(true);

        Assertions.assertEquals(userAdmin.isAdmin(),true);
    }

}
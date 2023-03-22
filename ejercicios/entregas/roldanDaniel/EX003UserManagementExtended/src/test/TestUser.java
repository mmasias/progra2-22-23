package src.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import src.main.AdminUser;
import src.main.User;

public class TestUser  {


    @Test
    void getLogin() {

        User userTest = new User();
        userTest.setLogin("daniel@alumnos.com");
        Assertions.assertEquals(userTest.getLogin(),"daniel@alumnos.com");
    }

    @Test
    void getPassword() {

        User userTest = new User();
        userTest.setPassword("1234");
        Assertions.assertEquals(userTest.getPassword(),"1234");

    }

    @Test
    void getName() {

        User userTest = new User();
        userTest.setName("Daniel Roldan");
        Assertions.assertEquals(userTest.getName(),"Daniel Roldan");
    }

    @Test
    void setLogin() {

        User userTest = new User();
        Assertions.assertEquals(userTest.getLogin(),null);
        userTest.setLogin("daniel@alumnos.com");
        Assertions.assertEquals(userTest.getLogin(),"daniel@alumnos.com");
    }

    @Test
    void setPassword() {

        User userTest = new User();
        Assertions.assertEquals(userTest.getPassword(),null);
        userTest.setPassword("321");
        Assertions.assertEquals(userTest.getPassword(),"321");
    }

    @Test
    void setName() {

        User userTest = new User();
        Assertions.assertEquals(userTest.getName(),null);
        userTest.setName("Elder Bol");
        Assertions.assertEquals(userTest.getName(),"Elder Bol");

    }

    static class AdminUserTest extends TestUser {

        @Test
        void setAdmin() {
            AdminUser user = new AdminUser("pedro","","",false);
            user.setAdmin("Diel","das", "DAniel", true);
            boolean validate = user.isAdmin();
            Assertions.assertEquals(validate, true);

        }



        @Test
        void isAdmin() {

            AdminUser user = new AdminUser("","","",true);

            boolean validate = user.isAdmin();
            Assertions.assertEquals(validate, true);



        }
    }
}

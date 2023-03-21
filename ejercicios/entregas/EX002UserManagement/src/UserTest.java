import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void getLogin() {

        User userTest = new User("dani","1233","roldan");

        assertEquals(userTest.getLogin(),"dani");
    }

    @Test
    void setLogin() {
        User userTest = new User("dani","1233","roldan");
        userTest.setLogin("elder");

        assertEquals(userTest.getLogin(),"elder");
    }

    @Test
    void testGetLogin() {
    }

    @Test
    void testSetLogin() {
    }

    @Test
    void getPassword() {
    }

    @Test
    void setPassword() {
    }

    @Test
    void getName() {
    }

    @Test
    void setName() {
    }

    @Test
    void login() {
    }
}
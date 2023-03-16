package Classes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ManagerTest {
    Enigma enigma = new Enigma();
    UserDataBase userDataBase = new UserDataBase();
    Manager manager = new Manager(userDataBase.getUsers());
    @BeforeEach
    void setUp() {
    }

    @Test
    void login() {
        manager.login();
        assertEquals("JavierC", Manager.currentUser.getUsername());
    }

    @Test
    void validateUserName() {
    }

    @Test
    void validatePassword() {
    }

    @Test
    void getValidatedUser() {
    }
}
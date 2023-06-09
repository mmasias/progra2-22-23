package Poo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {

    private User user;
    private Option option;
    private Manager manager;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        String[] options = {"create", "view", "update", "delete"};
        this.option = new Option(options, 4);
        this.user = new User("Andriuw", "Password", this.option);
        this.manager = new Manager(5);
    }

    @org.junit.jupiter.api.Test
    void register() {
        this.manager.register(this.user);

        assertEquals(1, this.manager.getNumberUsersRegistered());
    }
    @org.junit.jupiter.api.Test
    void login() {
        this.manager.register(this.user);
        boolean isUserLogged = this.manager.login(this.user);
        assertTrue(isUserLogged);
    }

    @Test
    void getUserOptions()
    {
        this.manager.register(this.user);
        this.manager.login(user);
        String expectedOption = "create";
    }


}

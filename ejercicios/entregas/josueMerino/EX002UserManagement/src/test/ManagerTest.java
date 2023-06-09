package test;

import main.Manager;
import main.Option;
import main.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {

    private User user;
    private Option option;
    private Manager manager;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        String[] options = {"create", "read", "update", "delete"};
        this.option = new Option(options, 4);
        this.user = new User("josue.merino", "abcde", this.option);
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
        Option userLoggedItems = this.manager.getUserAuthenticated(0).getItems();
        userLoggedItems.setSelectedOption("create");

        String expectedOption = "create";
        String actualOption = userLoggedItems.getSelectedOption();

        assertEquals(expectedOption, actualOption);
    }


}
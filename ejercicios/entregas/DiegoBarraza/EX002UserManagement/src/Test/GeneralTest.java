package Test;

import Main.Manager;
import Main.Options;
import Main.User;
import org.junit.Test;


import static org.junit.jupiter.api.Assertions.*;

class GeneralTest {
    private User user;
    private Options option;
    private Manager manager;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        String[] options = {"create", "read", "update", "delete"};
        this.option = new Options(options, 10);
        this.user = new User("DiegoBarraza", "abcde", this.option);
        this.manager = new Manager(8);
    }

    @org.junit.jupiter.api.Test
    void register() {
        this.manager.register(this.user);

        assertEquals(1, this.manager.getNumberuserveerified());
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
        Options userLoggedItems = this.manager.getUserVerified(0).getItems();
        userLoggedItems.setSelectoption("create");

        String expectedOption = "create";
        String actualOption = userLoggedItems.getSelectoption();

        assertEquals(expectedOption, actualOption);
    }


}



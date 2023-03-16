package Test;

import Main.Manager;
import org.junit.jupiter.api.Test;
import Main.Option;
import Main.User;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {
    Manager host = new Manager(4);
    User user1 = new User ("Manolo", "1234");
    Option option1 = new Option ("Options for user1",3);
    @Test
    void setUserListCapacity() {
        host.setUserListCapacity(5);
        assertEquals(host.getUserListCapacity(), 5);
    }

    @Test
    void getUserListCapacity() {
        int actual = host.getUserListCapacity();
        assertEquals(actual,4);
    }

    @Test
    void addUser() {
        host.addUser(user1);
    }

    @Test
    void addOption() {
        host.addOption(option1,0);
    }

    @Test
    void deleteUser() {
        host.addUser(user1);
        host.deleteUser(0);
    }

    @Test
    void deleteOpt() {
        host.addOption(option1,0);
        host.deleteOpt(0);
    }

    @Test
    void showUsers() {
        host.addUser(user1);
        host.showUsers();
    }

    @Test
    void inspectUsername() {
        host.addUser(user1);
        host.inspectUsername("Manolo");
    }
}
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {

    @Test
    void insert() {
        Manager manager = new Manager(2);
        User user1 = new User("John", "password1",true);
        User user2 = new User("Mary", "password2", false);
        Option option1 = new Option("Option 1", true);
        Option option2 = new Option("Option 2",true);

        manager.insert(user1, option1);
        manager.insert(user2, option2);

        assertArrayEquals(new User[] {user1, user2}, manager.getUsers());
        assertArrayEquals(new Option[] {option1, option2}, manager.getOptions());
    }

    @Test
    void verify() {
        Manager manager = new Manager(2);
        User user1 = new User("John", "password1",true);
        User user2 = new User("Mary", "password2", false);
        Option option1 = new Option("Option 1", true);
        Option option2 = new Option("Option 2",true);

        manager.insert(user1, option1);
        manager.insert(user2, option2);

        Option result1 = manager.verify("John", "password1");
        Option result2 = manager.verify("Mary", "password2");
        Option result3 = manager.verify("Bob", "password3");
        Option result4 = manager.verify("John", "password3");

        assertEquals(option1, result1);
        assertEquals(option2, result2);
        assertNull(result3);
        assertNull(result4);
    }
}
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {

    @Test
    void insert() {
        Manager manager = new Manager(2);
        User user1 = new User(true, "password1","David");
        User user2 = new User(false, "password2", "Jesus");
        Option option1 = new Option(2);
        option1.newOptionsMenu("Option 1");
        option1.newOptionsMenu("Option 2");

        Option option2 = new Option(2);
        option2.newOptionsMenu("Option 3");
        option2.newOptionsMenu("Option 4");


        manager.insert(user1, option1);
        manager.insert(user2, option2);

        assertArrayEquals(new User[] {user1, user2}, manager.getUserList());
        assertArrayEquals(new Option[] {option1, option2}, manager.getOption());
    }

    @Test
    void verify() {
        Manager manager = new Manager(2);
        User user1 = new User(true, "password1","David");
        User user2 = new User(false, "password2", "Jesus");
        Option option1 = new Option(2);
        option1.newOptionsMenu("Option 1");
        option1.newOptionsMenu("Option 2");

        Option option2 = new Option(2);
        option2.newOptionsMenu("Option 3");
        option2.newOptionsMenu("Option 4");

        manager.insert(user1, option1);
        manager.insert(user2, option2);

        Option result1 = manager.verify("David", "password1");
        Option result2 = manager.verify("Jesus", "password2");
        Option result3 = manager.verify("Pablo", "password3");
        Option result4 = manager.verify("David", "password3");

        assertEquals(option1, result1);
        assertEquals(option2, result2);
        assertNull(result3);
        assertNull(result4);
    }
}
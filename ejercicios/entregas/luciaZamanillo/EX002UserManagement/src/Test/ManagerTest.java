package Test;

import Poo.Manager;
import Poo.Option;
import Poo.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ManagerTest {
    Manager newManager;
    @BeforeEach
    void setUp() {
        newManager = new Manager();
    }

    @Test
    void getSelectedOption() {
        Option expected = null;
        Option actual = newManager.getSelectedOption();
        assertEquals(expected, actual);
    }

    @Test
    void setSelectedOption() {
        Option optionTest = new Option();
        newManager.setSelectedOption(optionTest);

        Option expected = optionTest;
        assertEquals(expected, newManager.getSelectedOption());
    }

    @Test
    void userValidation() {
        User userTest = new User("963258", "JackJack2");
        newManager.addUser(userTest);
        boolean actual = newManager.userValidation(userTest);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void addUser() {
        User userTest1 = new User("963258", "JackJack2");
        User userTest2 = new User("96cD58", "MissCloud");

        newManager.addUser(userTest1);
        newManager.addUser(userTest2);

        User expected = userTest2;
        assertEquals(expected, newManager.getUser(1));
    }

    @Test
    void getUser() {
        User userTest1 = new User("963258", "JackJack2");
        User userTest2 = new User("96cD58", "MissCloud");

        newManager.addUser(userTest1);
        newManager.addUser(userTest2);

        User actual = newManager.getUser(1);
        User expected = userTest2;

        assertEquals(expected, actual);
    }
}

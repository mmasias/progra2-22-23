package test;

import main.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {
    Manager manager;
    User userRegular;
    User userAdmin;
    Option optionRegularUser;
    Option optionAdminUser;
    @BeforeEach
    void setUp() {
        manager = new Manager();

        optionRegularUser = new Option();
        optionAdminUser = new Option();

        optionRegularUser.addOption("Payments");
        optionRegularUser.addOption("Transfers");
        optionRegularUser.addOption("Graphs");

        optionAdminUser.addOption("Add user");
        optionAdminUser.addOption("Delete user");
        optionAdminUser.addOption("Add account");
        optionAdminUser.addOption("All payments");

        userRegular = new RegularUser("Test", "123");
        userAdmin = new Admin("TestB", "123123");


        // We add the userTest to the manager to test the method authenticateUser
        manager.addUser(userRegular);
    }
    @Test
    @DisplayName("Testing the method addUser")
    void addUser() {
        manager.addUser(userAdmin);

        int expectedQuantityUser = 2;
        int actualQuantityUser = manager.getUserCount();

        assertEquals(expectedQuantityUser, actualQuantityUser);
    }
    @Test
    void authenticateUser() {

        boolean expectedStateAuth = true;
        boolean actualStateAuth =  manager.
                authenticateUser("Test", "123");

        assertEquals(expectedStateAuth, actualStateAuth);

    }
    @Test
    void setSelectedOption() {
        manager.setSelectedOption(optionRegularUser);

        int expectedSelectedOptionHash = optionRegularUser.getHashCode();
        int actualSelectedOptionHash = manager.getSelectedOption().getHashCode();

        assertEquals(expectedSelectedOptionHash, actualSelectedOptionHash);

    }
}
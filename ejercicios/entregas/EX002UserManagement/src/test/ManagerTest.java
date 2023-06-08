package test;

import Main.Manager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ManagerTest {
    Manager manager;
    @BeforeEach
    void setUp() {
        manager = new Manager (3);
    }


    void getUserList() {
        assertEquals(1, manager.getUserList());

    }

    @Test
    void setUserList() {
        manager.setUserList();
        assertEquals(4, manager.getUserList());

    }

    @Test
    void getVerifiedUser() {
        assertEquals(4, manager.getVerifiedUser());
    }

    @Test
    void setVerifiedUser() {
        manager.setVerifiedUser();
        assertEquals(4, manager.getVerifiedUser());
    }

    @Test
    void getSelectedOption() {
        assertEquals(4, manager.getSelectedOption());

    }

    @Test
    void setSelectedOption() {
        manager.setSelectedOption(3);
        assertEquals(3, manager.getSelectedOption());
    }

    @Test
    void getMaxUsers() {
        assertEquals(4, manager.getMaxUsers());

    }

    @Test
    void setMaxUsers() {
        manager.setMaxUsers(9);
        assertEquals(9, manager.setMaxUsers(9));
    }

    @Test
    void authentified() {
    }

    @Test
    void linkUserOption() {
    }
}

package Core;

import Core.Cypher.Enigma;
import Core.Manager.Manager;
import Core.Users.Student;
import Core.Users.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ManagerTest {
    Manager manager;
    User user;

    @BeforeEach
    void setUp() {
        user = new Student("JavierC", Enigma.encrypt("12345"), new int[] {10, 8, 9, 10, 7});
        manager = new Manager(user);
        user.setLogin(true);
    }

    @Test
    void displayOptions() {
        manager.displayOptions();
    }
}
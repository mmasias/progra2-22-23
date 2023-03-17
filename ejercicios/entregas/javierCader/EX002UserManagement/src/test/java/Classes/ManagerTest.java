package Classes;

import Classes.Cypher.Enigma;
import Classes.Manager.Manager;
import Classes.Users.Student;
import Classes.Users.User;
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
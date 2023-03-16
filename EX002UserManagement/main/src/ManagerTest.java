import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {
Manager m1;

   int max=5;

    @BeforeEach
    void setUp() {
        m1=new Manager(max);
        Option o=new Option(3);
        o.insert("Close the door");
        o.insert("Open the door");
        o.insert("Destroy the door");
        m1.add(new User(true,"1234","Anne"),o);
        m1.add(new User(false,"565","Peter"),o);

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void add() {
        Option o=new Option(3);
        o.insert("Close the door");
        o.insert("Open the door");
        o.insert("Destroy the door");
        m1.add(new User(false, "232","patrick"), o);
    }

    @Test
    void authentify() {
        Option aux=m1.authentify("Anne","1234");
        assertEquals(3,aux.options.length);
    }
}
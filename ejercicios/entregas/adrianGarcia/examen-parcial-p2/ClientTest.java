package main.ex1;

import org.junit.Test;
import static org.junit.Assert.*;

public class ClientTest {

    @Test
    public void testEquals() {
        Client client1 = new Client("John", "Doe", "123 Main St", "555-1234");
        Client client2 = new Client("John", "Doe", "456 Elm St", "555-5678");
        Client client3 = new Client("Jane", "Doe", "789 Oak St", "555-9012");
        Client client4 = new Client("John", "Smith", "321 Maple St", "555-3456");

        assertTrue("Two clients with the same name and surname should be considered equal", client1.equals(client2));
        assertFalse("Two clients with different name and surname should not be considered equal", client1.equals(client3));
        assertFalse("Two clients with different surname should not be considered equal", client1.equals(client4));
    }

}



import mypackage.*;
import java.util.Scanner;
import org.junit.Test;


public class MainTests {
    // Test that registers a series of users with customized options, and test a successful authentication (listing the options) and a failed authentication (displaying a message on the console).
    
    Scanner sc = new Scanner(System.in);
    User user1 = new User("Jose", "contraseña");
    User user2 = new User("Felipe", "contraseña");
    
    @Test
    public void testUser1() {
        if (user1.getUsername().equals("Jose") && user1.getPassword().equals("contraseña")) {
            System.out.println("Authentication successful!");
        }
        else {
            System.out.println("Authentication failed!");
        }

    }
    @Test
    public void testUser2() {
        if (user2.getUsername().equals("Felipe") && user2.getPassword().equals("nomeacuerdo")) {
            System.out.println("Authentication successful!");
        }
        else {
            System.out.println("Authentication failed!");
        }
    }
}

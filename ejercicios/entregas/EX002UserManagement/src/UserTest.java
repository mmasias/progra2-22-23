import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class UserTest {
    @Test
    void creationtest(){
        User testUser = new User("hola", "pabloocanteroo");
    }

    @Test
    void getuserPassword(){
        User testUser = new User("hola", "pabloocanteroo");
        String expecteduserPassword = "hola";
        assertEquals(expecteduserPassword, testUser.getUserPassword());
    }

    @Test
    void getuserName(){
        User testUser = new User("hola", "pabloocanteroo");
        String expecteduserName = "pabloocanteroo";
        assertEquals(expecteduserName, testUser.getUsername());
    }
    @Test
    void getUserPasswordReal(){
        User testUser = new User("hola", "pabloocanteroo");
        String expectedUserPAsswordReal= "hola";
        assertEquals(expectedUserPAsswordReal, testUser.getUserPasswordReal());

    }
    @Test
    void getUserNameReal(){
        User testUser = new User("hola", "pabloocanteroo");
        String expectedUserNameReal= "si";
        assertEquals(expectedUserNameReal, testUser.getUserNameReal());

    }

}

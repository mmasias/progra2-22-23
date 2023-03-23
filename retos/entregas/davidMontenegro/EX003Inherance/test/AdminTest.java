import src.Admin;
package test;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Assertions.*;

public class AdminTest{
    static Admin admin;
    @beforeAll
    static void septup(){
        admin = new Admin();
        admin.setUsername("Number1Admin");
        admin.setPassword("password");
        admin.setName("Admin1");
    }
    @test
    void isAdmin(){
        boolean expected = false;
        assertEquals(expected, admin.isAdmin());

    }
    @test
    void setAdmin(){
        admin.setAdmin(true);
        boolean expected = true
        assertEquals(expected, admin.isaAdmin());
    }
    @test
    void Admin(){
        String expectedUserName = "Number1Admin";
        String expectedPassword = "password";
        String expectedName = "Admin1";
        boolean expectedAdmin = false;

        assertEquals (expecteduserName, admin.getUserName());
        assertEquals (expectedPassword, admin.getPassword());
        assertEquals (expectedName, admin.getName());
        assertEquals (expectedAdmin, admin.isAdmin());
    }
}
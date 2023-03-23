package src.test;
import org.junit.Test;
import org.junit.Assert;
import src.main.Manager;
import src.main.User;
import src.main.Admin;

public class UserTest {
    Manager manager = new Manager();
    @Test
    public void TestGetUserData() {
        User userAdmin = new User("admin", "1234", "admin");
        User userRegular = new User("regular", "1234", "regular");
        manager.addUser(userAdmin);
        manager.addUser(userRegular);
        manager.authenticatedUser(userAdmin.getUserName(), userAdmin.getPassword()); // Login as admin

        Assert.assertEquals("admin", userAdmin.getUserName());
        Assert.assertEquals("1234", userAdmin.getPassword());
        Assert.assertEquals("admin", userAdmin.getName());
    }

    @Test
    public void TestSetUserData(){
        User userAdmin = new User();
        userAdmin.setUserName("admin");
        userAdmin.setPassword("1234");
        userAdmin.setName("admin");
        manager.addUser(userAdmin);

        Assert.assertEquals("admin", userAdmin.getUserName());
        Assert.assertEquals("1234", userAdmin.getPassword());
        Assert.assertEquals("admin", userAdmin.getName());
    }

    @Test
    public void TestAuthenticateAdminUser(){
        Admin pablito = new Admin("pablo", "1234", "pablito", false);
        pablito.setAdmin();
        manager.addUser(pablito);
        manager.authenticatedUser(pablito.getUserName(), pablito.getPassword()); // Login as admin

        Assert.assertEquals(true, pablito.isAdmin());
    }
}
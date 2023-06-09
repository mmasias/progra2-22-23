package test;

import main.*;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ManagerTest {

    static Manager manager;

    @Test
    public void loginAdmin(){

        manager = new Manager();

        Option listOptionsAdmin = new Option(5);
        listOptionsAdmin.addOption("List all customers");
        listOptionsAdmin.addOption("List all products");
        listOptionsAdmin.addOption("List all orders");
        listOptionsAdmin.addOption("List all admins");
        listOptionsAdmin.addOption("List all sales");

        Option listOptionsRegularUser = new Option(3);
        listOptionsRegularUser.addOption("List all customers");
        listOptionsRegularUser.addOption("List all products");
        listOptionsRegularUser.addOption("List all orders");

        Admin Paco = new Admin("Paquito33", "hola", "Paco");

        Paco.setOptions(listOptionsAdmin);

        UserManager.registerUser(Paco);


        int expectedOptionsListSize = 5;
        int actualOptionsListSize = Paco.getOptions().getSize();

        boolean expectedIsAdmin = true;
        boolean actualIsAdmin = UserManager.isUserAdmin(Paco);

        assertEquals(expectedOptionsListSize, actualOptionsListSize);
        assertEquals(expectedIsAdmin, actualIsAdmin);
     }

     @Test
    public void loginRegularUser(){

        manager = new Manager();

        Option listOptionsAdmin = new Option(5);
        listOptionsAdmin.addOption("List all customers");
        listOptionsAdmin.addOption("List all products");
        listOptionsAdmin.addOption("List all orders");
        listOptionsAdmin.addOption("List all admins");
        listOptionsAdmin.addOption("List all sales");

        Option listOptionsRegularUser = new Option(3);
        listOptionsRegularUser.addOption("List all customers");
        listOptionsRegularUser.addOption("List all products");
        listOptionsRegularUser.addOption("List all orders");

        RegularUser Frank = new RegularUser("Frank", "capi", "Francisco");

        Frank.setOptions(listOptionsRegularUser);

        UserManager.registerUser(Frank);


        int expectedOptionsListSize = 3;
        int actualOptionsListSize = Frank.getOptions().getSize();



        assertEquals(expectedOptionsListSize, actualOptionsListSize);
    }

    @Test

    public void loginFailed(){
        manager = new Manager();

        Option listOptionsAdmin = new Option(5);
        listOptionsAdmin.addOption("List all customers");
        listOptionsAdmin.addOption("List all products");
        listOptionsAdmin.addOption("List all orders");
        listOptionsAdmin.addOption("List all admins");
        listOptionsAdmin.addOption("List all sales");

        Option listOptionsRegularUser = new Option(3);
        listOptionsRegularUser.addOption("List all customers");
        listOptionsRegularUser.addOption("List all products");
        listOptionsRegularUser.addOption("List all orders");

        RegularUser Frank = new RegularUser("Frank", "capi", "Francisco");

        Frank.setOptions(listOptionsRegularUser);

        UserManager.registerUser(Frank);

        RegularUser Frank2 = new RegularUser("Frank", "capi", "Francisco");

        Frank2.setOptions(listOptionsRegularUser);
          UserManager.registerUser(Frank2);

        int expectedOptionsListSize = 5;
        int actualOptionsListSize = Frank2.getOptions().getSize();

        assertNotEquals(expectedOptionsListSize, actualOptionsListSize);
    }

}
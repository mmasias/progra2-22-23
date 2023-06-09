package classes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ManagerTest {

	@Test
	void testManager() {

        Manager manager = new Manager();

        // Options for the list menu of an admin
        Options listOptionsAdmin = new Options(5);
        listOptionsAdmin.add("List all customers");
        listOptionsAdmin.add("List all products");
        listOptionsAdmin.add("List all orders");
        listOptionsAdmin.add("List all admins");

        // Options for the list menu for sales
        Options listOptionsSales = new Options(3);
        listOptionsSales.add("List all customers");
        listOptionsSales.add("List all products");
        listOptionsSales.add("List all orders");

        User admin = new User("admin", "admin", "Admin");
        User sales = new User("sales", "sales", "Sales");

        admin.setOptions(listOptionsAdmin);
        sales.setOptions(listOptionsSales);

        manager.addUser(admin); // Add the admin user to the manager and options list is zero
        manager.addUser(sales); // Add the sales user to the manager and options list is one


        User userAdminTest = manager.login("admin", "admin"); // Login as admin

        int expectedOptionsListSize = 4; // Expected size of the options list for admin
        int actualOptionsListSize = userAdminTest.getOptions().getSize(); // Get the size of the options list for admin

        assertEquals(expectedOptionsListSize, actualOptionsListSize); // Compare the expected and actual size of the options list for admin


    

    
        User userAdminTest1 = manager.login("admin", "admin"); // Login as admin

        int expectedOptionsListSize1 = 14; // Expected size of the options list for sales
        int actualOptionsListSize1 = userAdminTest1.getOptions().getSize(); // Get the size of the options list for sales

        assertNotEquals(expectedOptionsListSize1, actualOptionsListSize1); // Compare the expected and actual size of the options list for sales
    }
    
	
	

}

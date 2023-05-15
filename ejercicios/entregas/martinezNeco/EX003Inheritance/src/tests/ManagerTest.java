package src.tests;


import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {

    static Manager manager;

    @BeforeAll
    static void setUp() {

        manager = new Manager();

        // Options for the list menu of an admin
        Options listOptionsAdmin = new Options(5);
        listOptionsAdmin.add("List all customers");
        listOptionsAdmin.add("List all products");
        listOptionsAdmin.add("List all orders");
        listOptionsAdmin.add("List all admins");
        listOptionsAdmin.add("List all sales");

        // Options for the list menu for sales
        Options listOptionsSales = new Options(3);
        listOptionsSales.add("List all customers");
        listOptionsSales.add("List all products");
        listOptionsSales.add("List all orders");

        User admin = new User("admin", "admin", "Admin");
        User sales = new User("sales", "sales", "Sales");

        admin.setOptions(listOptionsAdmin);
        sales.setOptions(listOptionsSales);

        manager.add(admin); // Add the admin user to the manager and options list is zero
        manager.add(sales); // Add the sales user to the manager and options list is one


    }
    @Test
    void login() {

        User userAdminTest = manager.login("admin", "admin"); // Login as admin

        int expectedOptionsListSize = 5; // Expected size of the options list for admin
        int actualOptionsListSize = userAdminTest.getOptions().getSize(); // Get the size of the options list for admin

        assertEquals(expectedOptionsListSize, actualOptionsListSize); // Compare the expected and actual size of the options list for admin


    }

    @Test
    void failedLogin(){
        User userAdminTest = manager.login("admin", "admin"); // Login as admin

        int expectedOptionsListSize = 3; // Expected size of the options list for sales
        int actualOptionsListSize = userAdminTest.getOptions().getSize(); // Get the size of the options list for sales

        assertNotEquals(expectedOptionsListSize, actualOptionsListSize); // Compare the expected and actual size of the options list for sales
    }
}
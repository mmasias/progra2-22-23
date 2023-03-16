public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager(3); // maximum 3 users
        manager.addOption("Option 1");
        manager.addOption("Option 2");
        manager.addOption("Option 3");

        // Register users
        manager.registerUser("user1", "password1", "User 1");
        manager.registerUser("user2", "password2", "User 2");

        // Test successful authentication
        if (manager.authenticateUser("user1", "password1")) {
            manager.showMenu(); // show menu with 3 options
            manager.userOption.setSelectedOption(1);
            manager.showMenu(); // show menu with option 2 selected
        }
        // Test failed authentication
        if (!manager.authenticateUser("user3", "password3")) {
            System.out.println("Authentication failed."); // show error message
        }
    }

}



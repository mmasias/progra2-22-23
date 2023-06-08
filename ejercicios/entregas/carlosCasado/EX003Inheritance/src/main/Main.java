package main;

public class Main {
    public static void main(String[] args) {

        RegularUser user1 = new RegularUser("filiberto", "Paco", "Filiberto Paco");
        User user2 = new User("Wilbur", "Paco", "Wilbur Maxwell");
        User user3 = new User("Brayden", "Paco", "Brayden Mccullough");
        User user4 = new User("Lowri", "Paco", "Lowri Mcclain");
        User user5 = new User("Fatma", "Paco", "Fatma Stone");

        UserManager manager = new UserManager(5);

        manager.registerUser(user1);

        MenuOption menu = new MenuOption(3);

        menu.addOption("Testing");
        menu.setDescription("Prueba");

        System.out.println(menu.getOption(0));

        MenuOption test = manager.configureMenu(5);

        test.addOption("test");
        //test.setDescription("test option");

        manager.showMenu();

    }
}
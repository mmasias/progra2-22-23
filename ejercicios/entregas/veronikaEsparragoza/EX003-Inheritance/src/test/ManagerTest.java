package src.test;
import org.junit.Test;
import org.junit.Assert;
import src.main.Manager;
import src.main.Option;
import src.main.User;
import src.main.MenuOption;

public class ManagerTest {
    Manager manager = new Manager();
    @Test
    public void TestOptionData(){
        //Options for the list menu of an admin
        Option menuOptionAdmin = new Option(5);
        menuOptionAdmin.addOption("List all customers");
        menuOptionAdmin.addOption("List all products");
        menuOptionAdmin.addOption("List all orders");
        menuOptionAdmin.addOption("List all admins");
        menuOptionAdmin.addOption("List all sales");

        // Options for the list menu for regular users
        MenuOption menuOptionRegular = new MenuOption(3, "List menu");
        menuOptionRegular.setDescription("List menu");
        menuOptionRegular.addOption("List all listCustomers");
        menuOptionRegular.addOption("List all products");

        User admin = new User("admin2", "1234", "Admin");
        User regular = new User("regular2", "1234", "Regular");

        System.out.println(menuOptionAdmin.getOption(0));
        manager.addUser(admin);
        manager.addUser(regular);
        Option[] optionsAdmin = new Option[]{menuOptionAdmin};
        Option[] optionsRegular = new Option[]{menuOptionRegular};
        admin.setOptions(optionsAdmin);
        regular.setOptions(optionsRegular);
        Assert.assertEquals("List all customers", menuOptionAdmin.getOption(0));
        Assert.assertEquals("List all orders", menuOptionRegular.getOption(2));
    }
}
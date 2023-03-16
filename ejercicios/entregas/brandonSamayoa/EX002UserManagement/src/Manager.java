import  java.util.ArrayList;
import  java.util.List;

public class Manager {
    private List<User> users;
    private User authenticatedUser;
    Option userOption;
    private int maxUsers;

    public Manager(int maxUsers) {
        this.users = new ArrayList<User>();
        this.authenticatedUser = null;
        this.userOption = new Option(5); // maximum 5 options
        this.maxUsers = maxUsers;
    }

    public boolean registerUser(String login, String password, String name) {
        if (users.size() < maxUsers) {
            User user = new User(login, password, name);
            users.add(user);
            return true;
        }
        return false;
    }

    public boolean authenticateUser(String login, String password) {
        for (User user : users) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                authenticatedUser = user;
                return true;
            }
        }
        return false;
    }

    public void addOption(String option) {
        userOption.addOption(option);
    }

    public void showMenu() {
        if (authenticatedUser != null) {
            System.out.println("Welcome, " + authenticatedUser.getName() + "!");
            System.out.println("Select an option:");
            for (int i = 0; i < userOption.getSelectedOption(); i++) {
                System.out.println((i+1) + ". " + userOption.getOption(i));
            }
        } else {
            System.out.println("Please login first.");
        }
    }
}
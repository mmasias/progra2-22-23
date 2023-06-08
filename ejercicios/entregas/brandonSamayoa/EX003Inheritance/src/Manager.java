import java.util.ArrayList;

public class Manager {
    private ArrayList<User> users;
    User authenticatedUser;
    private MenuOption selectedOption;
    private int maxUsers;

    public Manager(int maxUsers) {
        users = new ArrayList<User>();
        authenticatedUser = null;
        selectedOption = null;
        this.maxUsers = maxUsers;
    }

    public void addUser(User user) {
        if (users.size() < maxUsers) {
            users.add(user);
        }
    }

    public boolean authenticateUser(String userName, String password) {
        for (User user : users) {
            if (user.getUsername().equals(userName) && user.getPassword().equals(password)) {
                authenticatedUser = user;
                return true;
            }
        }
        return false;
    }

    public void showMenu() {
        // TODO: Implement menu display logic here
    }

    public User getAuthenticatedUser() {
        return authenticatedUser;
    }

    public void setSelectedOption(MenuOption menuOption) {
        selectedOption = menuOption;
    }

    public MenuOption getSelectedOption() {
        return selectedOption;

    }
}

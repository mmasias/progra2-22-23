package main;
public class Manager {
    private User users[];
    private User authenticatedUser;
    private Option selectedOption;
    private int maxUsers;
    private int userCount;
    public Manager() {
        this(10);
    }
    public Manager(int maxUsers) {
        this.maxUsers = maxUsers;
        this.userCount = 0;
        this.users = new User[maxUsers];
    }
    public void addUser(User user) {
        if (userCount < maxUsers) {
            users[userCount] = user;
            userCount++;
        }else{
            System.out.println("No more users can be added");
        }
    }
    public int getUserCount() {
        return userCount;
    }
    public boolean authenticateUser(String username, String password) {
        for (int index = 0; index < userCount; index++)
            if (users[index].login(username, password)) {
                authenticatedUser = users[index];
                return true;
            }
        return false;
    }
    public void setSelectedOption(Option selectedOption) {
        this.selectedOption = selectedOption;
    }
    public Option getSelectedOption() {
        return selectedOption;
    }
    public User getAuthenticatedUser() {
        return authenticatedUser;
    }
    public void showMenu() {
        this.selectedOption.showOptions();
    }
}

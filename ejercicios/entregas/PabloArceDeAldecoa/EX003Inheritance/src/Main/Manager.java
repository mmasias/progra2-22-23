package Main;

public class Manager {
    private User [] users;
    private User authenticatedUser;
    private MenuOption selectedOption;
    private int maxUsers;
    public Manager(int maxUsers){
        this.users = new User[maxUsers];
    }
    public void addUser(User user){
        for (int i = 0; i < users.length; i++){
            if (users[i] == null){
                    users[i] = user;
                    break;
            }
            if (i == users.length - 1){
                System.out.println("No space left!");
            }
        }
    }
    public void setAuthenticatedUser (User user){
        this.authenticatedUser = user;
    }
    public boolean authenticateUser (String username, String password){
        if (username.equals(authenticatedUser.getLogin()) && password.equals(authenticatedUser.getPassword())){
            return true;
        }
        return false;
    }
    public void showMenu(Option option){
        option.showOptions();
    }
    public User getUser(int pos){
        return this.users[pos];
    }
}

public abstract class Manager {
    protected User[] users;
    protected User authenticatedUser;
    protected int maxUsers;

    public Manager(int maxUsers) {
        this.maxUsers = maxUsers;
        users = new User[maxUsers];
        authenticatedUser = null;
    }

    public void addUser(User user) {
        for (int i = 0; i < maxUsers; i++) {
            if (users[i] == null) {
                users[i] = user;
                break;
            }
        }
    }

    public boolean authenticateUser(String username, String password) {
        for (int i = 0; i < maxUsers; i++) {
            if (users[i] != null && users[i].getUsername().equals(username)
                    && users[i].getPassword().equals(password)) {
                authenticatedUser = users[i];
                return true;
            }
        }
        return false;
    }

    public abstract void showMenu();
}

public class Manager {
    private User[] users;
    private User[] usersAuthenticated;
    private int maxUsers;

    public Manager(User[] users, int maxUsers)
    {
        this.users = users;
        this.usersAuthenticated = null;
        this.maxUsers = maxUsers;
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    public User[] getUsersAuthenticated() {
        return usersAuthenticated;
    }

    public void setUsersAuthenticated(User[] usersAuthenticated) {
        this.usersAuthenticated = usersAuthenticated;
    }

    public int getMaxUsers() {
        return maxUsers;
    }

    public void setMaxUsers(int maxUsers) {
        this.maxUsers = maxUsers;
    }

    public boolean login(User user)
    {
        for (User userToFind:users) {
            if((userToFind.getName() == user.getName()) &&
                    (userToFind.getPassword() == user.getPassword())
            ){

                return true;
            }
        }

        return false;
    }

    public void register(User user)
    {

    }

    public User getUser(User user)
    {
        return null;
    }
}

import java.util.Arrays;

public class Manager {
    private User[] users;
    private User[] usersAuthenticated;
    private int maxUsers;

    public Manager(User[] users, int maxUsers)
    {
        this.users = users;
        this.usersAuthenticated = new User[maxUsers];
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
                this.addUserToUsersAuthenticated(userToFind);
                return true;
            }
        }

        return false;
    }

    public void register(User user)
    {
        if(this.users.length < this.maxUsers) {
            for (int i = 0; i < this.maxUsers; i++) {
                if (this.users[i] == null) {
                    this.users[i] = user;
                    break;
                }
            }
        }
        else {
            System.out.println("No hay espacio en el servidor :(");
        }
    }

    private void addUserToUsersAuthenticated(User userToFind)
    {
        for (int i = 0; i < this.maxUsers; i++) {
            if(this.usersAuthenticated[i] == null)
            {
                this.usersAuthenticated[i] = userToFind;
                break;
            }
        }
    }

}

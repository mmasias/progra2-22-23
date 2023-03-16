package main;

public class Manager {
    private User[] users;
    private int numberUsersRegistered;
    private User[] usersAuthenticated;
    private int numberUsersAuthenticated;
    private int maxUsers;

    public Manager(int maxUsers)
    {
        this.users = new User[maxUsers];
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

    public int getNumberUsersRegistered() {
        return numberUsersRegistered;
    }

    public void setNumberUsersRegistered(int numberUsersRegistered) {
        this.numberUsersRegistered = numberUsersRegistered;
    }

    public int getNumberUsersAuthenticated() {
        return numberUsersAuthenticated;
    }

    public void setNumberUsersAuthenticated(int numberUsersAuthenticated) {
        this.numberUsersAuthenticated = numberUsersAuthenticated;
    }

    public boolean login(User user)
    {
        for (User userToFind:users) {
            if((userToFind.getName() == user.getName()) &&
                    (userToFind.getPassword() == user.getPassword())
            ){
                this.addUserToUsersAuthenticated(userToFind);
                this.numberUsersAuthenticated++;
                return true;
            }
        }

        return false;
    }

    public void register(User user)
    {
        if(this.numberUsersRegistered < this.maxUsers) {
            for (int i = 0; i < this.maxUsers; i++) {
                if (this.users[i] == null) {
                    this.users[i] = user;
                    this.numberUsersRegistered++;
                    break;
                }
            }
        }
        else {
            System.out.println("No hay espacio en el servidor :(");
        }
    }

    public User getUserAuthenticated(int index)
    {
        return this.usersAuthenticated[index];
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

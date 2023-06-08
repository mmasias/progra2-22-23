package main;

public class Manager {
    private User[] users;
    private User authenticatedUser;
    private MenuOption selectedOption;
    private int maxUsers;

    public Manager(int maxUsers) {
        this.maxUsers = maxUsers;
        this.users = new User[maxUsers];
    }
    public void addUser(User user) {
        if (users.length >= maxUsers) {
            System.out.println("No se pueden agregar más usuarios, se ha alcanzado el límite máximo.");
            return;
        }
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                users[i] = user;
                return;
            }
        }
    }
    public boolean authenticateUser(String username, String password) {
        for (User user : users) {
            if (user != null && user.getUsername().equals(username) && user.getPassword().equals(password)) {
                authenticatedUser = user;
                return true;
            }
        }
        return false;
    }

    public void showMenu() {
        if (authenticatedUser == null) {
            System.out.println("Debe autenticarse para ver el menú.");
            return;
        }
    }
}




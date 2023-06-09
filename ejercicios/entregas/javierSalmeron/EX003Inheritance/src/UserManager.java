public class UserManager extends Manager {
    public UserManager() {
        super(100);
    }

    public void registerUser(User user) {
        addUser(user);
        System.out.println("Account created.");
    }

    public boolean isUserAdmin(User user) {
        return user instanceof Admin;
    }

    public void modifyAccount(String username, String password, String newPassword) {
        for (int i = 0; i < maxUsers; i++) {
            if (users[i] != null && users[i].getUsername().equals(username)
                    && users[i].getPassword().equals(password)) {
                users[i].setPassword(newPassword);
                System.out.println("Account modified.");
                return;
            }
        }
        System.out.println("Account not found.");
    }

    @Override
    public void showMenu() {
        // Implementation not needed for this example
    }
}

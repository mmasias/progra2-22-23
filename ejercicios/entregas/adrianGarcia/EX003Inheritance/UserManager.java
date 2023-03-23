public class UserManager extends Manager {
    public UserManager() {
        super(50);   }
    public void registerUser(User user) {
        addUser(user);
        System.out.println("NewAccount");   }
    public boolean isUserAdmin(User user) {
        return user instanceof Admin;   }
    public void modifyAccount(String username, String password, String newPassword) {
        for (int i = 0; i < maximumUsers; i++) {
            if (users[i] != null && users[i].getUsername().equals(username)
                    && users[i].getPassword().equals(password)) {
                users[i].setPassword(newPassword);
                System.out.println("AccountModified");
                return;           }       }
        System.out.println("Failed");   }
    @Override
    public void showMenu() {  }}
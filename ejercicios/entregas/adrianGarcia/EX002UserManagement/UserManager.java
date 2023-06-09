public class UserManager {
    private static final int max=50;
    private User[] users;
    private int numberUsers;
    public class User {
        private String username;
        private String password;
        public User(String username, String password) {
            this.username = username;
            this.password = password;      }
        private String getUsername() {
            return username;  }
        private String getPassword() {
            return password;     }
        public void setPassword(String password) {
            this.password = password;       }   }
    public UserManager() {
        users = new User[max];
        numberUsers = 0;   }
    public void addUser(String username, String password) {
        if (numberUsers == max) {
            System.out.println("No more are allowed");
            return;      }
        users[numberUsers] = new User(username, password);
        numberUsers++;    }
    public boolean authenticate(String username, String password) {
        for (int i = 0; i < numberUsers; i++) {
            if (users[i].getUsername().equals(username) && users[i].getPassword().equals(password)) {
                return true;           }       }
        return false;    }
    public void createAccount(String username, String password) {
        addUser(username, password);
        System.out.println("New Account");   }
    public void modifyAccount(String username, String password, String newPassword) {
        for (int i = 0; i < numberUsers; i++) {
            if (users[i].getUsername().equals(username) && users[i].getPassword().equals(password)) {
                users[i].setPassword(newPassword);
                System.out.println("The account has been changed");
                return;           }      }
        System.out.println("This account does not exist");    }}
/**
 * The User Manager class manages user accounts and authentication.
 */
public class UserManager {
    private static final int MAX_USERS = 100;
    private User[] users;
    private int numUsers;

    /**
     * The User class represents a user account.
     */
    public class User {
        private String username;
        private String password;

        /**
         * Creates a new User instance.
         *
         * @param username the user's username
         * @param password the user's password
         */
        public User(String username, String password) {
            this.username = username;
            this.password = password;
        }

        /**
         * Gets the user's username.
         *
         * @return the user's username
         */
        private String getUsername() {
            return username;
        }

        /**
         * Gets the user's password.
         *
         * @return the user's password
         */
        private String getPassword() {
            return password;
        }

        /**
         * Sets the user's password.
         *
         * @param password the new password
         */
        public void setPassword(String password) {
            this.password = password;
        }
    }

    /**
     * Creates a new Manager instance.
     */
    public UserManager() {
        users = new User[MAX_USERS];
        numUsers = 0;
    }

    /**
     * Adds a new user account.
     *
     * @param username the username for the new account
     * @param password the password for the new account
     */
    public void addUser(String username, String password) {
        if (numUsers == MAX_USERS) {
            System.out.println("Maximum number of users reached.");
            return;
        }
        users[numUsers] = new User(username, password);
        numUsers++;
    }

    /**
     * Authenticates a user.
     *
     * @param username the username of the user to authenticate
     * @param password the password of the user to authenticate
     * @return true if the user is authenticated, false otherwise
     */
    public boolean authenticate(String username, String password) {
        for (int i = 0; i < numUsers; i++) {
            if (users[i].getUsername().equals(username) && users[i].getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Creates a new user account.
     *
     * @param username the username for the new account
     * @param password the password for the new account
     */
    public void createAccount(String username, String password) {
        addUser(username, password);
        System.out.println("Account created.");
    }

    /**
     * Modifies a user account.
     *
     * @param username the username of the account to modify
     * @param password the current password for the account
     * @param newPassword the new password for the account
     */
    public void modifyAccount(String username, String password, String newPassword) {
        for (int i = 0; i < numUsers; i++) {
            if (users[i].getUsername().equals(username) && users[i].getPassword().equals(password)) {
                users[i].setPassword(newPassword);
                System.out.println("Account modified.");
                return;
            }
        }
        System.out.println("Account not found.");
    }
}

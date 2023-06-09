package Main;

public class Manager{
        int size;
        int maxUsers;
        User users[];
        User authenticatedUser;
        MenuOptions selectedOption;
        User currentUser;
        public Manager() {
            this.maxUsers = 10;
            this.size = 0;
            this.users = new User[maxUsers];
        }

        public Manager(int capacity) {
            this.maxUsers = capacity;
            this.size = 0;
            this.users = new User[capacity];
        }

        public void add(User user) {
            if (size < maxUsers) {
                users[size] = user;
                size++;
            }
            else if (size>maxUsers) {
                System.out.println("You cant add more users,max limit reached");
            }
        }

        public User login(String userName, String password,String name) {
            for (int i = 0; i < size; i++) {
                if (users[i].login(userName, password)) {
                    currentUser = users[i];
                    return currentUser;
                }
            }
            System.out.println("Invalid username or password");
            return null;
        }

        public boolean authenticatedUser(String userName,String password) {
            for (User user : users) {
                if (user != null && user.getPassword().equals(userName) &&
                        user.getPassword().equals(password)) {
                    authenticatedUser = user;
                    return true;
                }
            }
            return false;
        }

            public void showMenu() {
                if (authenticatedUser == null) {
                    System.out.println("You must be authenticated to see the menu");
                }
            }

        }


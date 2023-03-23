package main;

public class Manager {

    private User[] userList;
    private int position;
    private int capacity;
    private boolean userExist;
    MenuOption menu;

    public Manager(int capacity) {
        this.capacity = capacity;
        position = 0;
        userList = new User[capacity];
        userExist = false;
    }

    public Manager() {
        capacity = 10;
        position = 0;
        userList = new User[capacity];
    }

    // Add the user to the array.

    public void addUser(User user) {

        if (position < capacity) {
            userList[position] = user;
            position++;
            System.out.println("Registered successfully!");
        } else {
            System.out.println("Creating new users it's disallowed");
        }

    }

    // Returns a boolean if the given username string exists (or not).

    public boolean checkUser(String username) {

        int exist = 0;
        username = username.toLowerCase();
        if (!(position == 0)) {
            for (int i = 0; i < position; i++) {
                if (userList[i].getUserName().equals(username)) {
                    exist++;
                }
            }
            userExist = (exist > 0);
        } else {
            userExist = false;
        }
        return userExist;

    }

    // Check the user existence (calling the checkUsername method) before creating a user.

    public boolean createUser(User user) {
        boolean register;
        if (userList.length == 0) {
            addUser(user);
            register = true;
        } else {
            if (checkUser(user.getUserName())) {
                System.out.println("User exists! Choose another username!");
                register = false;
            } else {
                addUser(user);
                register = true;
            }
        }

        return register;

    }

    // Get the user position with the given username.

    public int getUserPosition(String username) {
        int index = -1;
        username = username.toLowerCase();
        for(int i = 0; i < position; i++) {
            if(userList[i].getUserName().equals(username)) {
                index = i;
                break;
            }
        }
        return index;
    }

    // Auth user calls login method in main.User class and return a boolean if the entered login data is correct.

    public boolean authUser(String username, String password) {
        boolean result;
        username = username.toLowerCase();
        if (!(checkUser(username))) {
            System.out.println("Bad username and/or password! Please re-check again.");
            result = false;
        } else {
            if (getUsers(getUserPosition(username)).login(username, password)) {
                result = true;
            } else {
                result = false;
                System.out.println("Bad username and/or password! Please re-check again.");
            }
        }
        return result;
    }

    // Initialize Option class

    public MenuOption configureMenu(int max) {
        menu = new MenuOption(max);
        return menu;
    }

    // Show menu and description.

    public void showMenu() {

            for(int i = 0; i < menu.selectedOption; i++) {

                String desc = (menu.getDescription() == null)
                        ? ": No description provided."
                        : ": " + menu.getDescription();

                int num = i + 1;

                System.out.println("[" + num + "] " + menu.getOption(i) + desc);
            }

    }

    public User getUsers(int position) {
        return userList[position];
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPosition() {
        return position;
    }



}

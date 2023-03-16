package Poo;

public class Manager {

    private User[] usersList;
    private Option selectedOption;
    private static int  maxUsers = 100;


    public Manager() {
        this.usersList = new User[maxUsers];
        this.selectedOption = null;
    }

    public User[] getUsersList() {
        return usersList;
    }

    public void setUsersList(User[] usersList) {
        this.usersList = usersList;
    }

    public Option getSelectedOption() {
        return selectedOption;
    }

    public void setSelectedOption(Option selectedOption) {
        this.selectedOption = selectedOption;
    }

    public static int getMaxUsers() {
        return maxUsers;
    }

    public static void setMaxUsers(int maxUsers) {
        Manager.maxUsers = maxUsers;
    }

    /**
     * Validates if the user's name and password are correct.
     * @param newUser The new user that wants to be added.
     * @return True if the validation is correct or False if not.
     */
    public boolean userValidation(User newUser) {
        for (int i = 0; i < maxUsers; i++) {
            if (usersList[i].getUserName().equals(newUser.getUserName()) && usersList[i].getPassword().equals(newUser.getPassword())) {
                return true;
            }
        }
        return false;
    }

    /**
     * Adds the user to the user array.
     * @param newUser The user that we want to add.
     */
    public void addUser (User newUser) {
        for (int i = 0; i < maxUsers; i++) {
            if (usersList[i] == null) {
                usersList[i] = newUser;
            }
        }
    }

    public User getUser (int index) {
        User returnUser = null;
        for (int i = 0; i < maxUsers; i++) {
            if (usersList[i] == usersList[index]) {
                returnUser = usersList[index];
            }
        }
        return returnUser;
    }
}


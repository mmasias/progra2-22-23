public class Manager {

    private User[] usersList;
    private Option selectedOption;
    private int maxUsers = 20;

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
    public int getMaxUsers() {
        return maxUsers;
    }
    public void setMaxUsers(int maxUsers) {
        this.maxUsers = maxUsers;
    }
    public boolean authenticateUser(User newUser){
        for (int i = 0; i < usersList.length; i++) {
            if (usersList[i] != null) {
                if (usersList[i].getUserName().equals(newUser.getUserName()) && usersList[i].getUserPassword().equals(newUser.getUserPassword())) {
                    return true;
                }
            }
        } return false;
    }
    public void addUser(User newUser) {
        for (int i = 0; i < usersList.length; i++) {
            if (usersList[i] == null) {
                usersList[i] = newUser;
            } else {
                System.out.println("User list is full, no more users can be added");
            }
        }
    }
    public User getUser (int index) {
        User retunUser = null;
        for (int i = 0; i < maxUsers; i++) {
            if (i == index) {
                retunUser = usersList[i];
            }
        }
        return retunUser;
    }
}
package Main;

public class Manager {

    private User[] userList;
    private User verifiedUser;

    private int maxUsers;
    private int selectedOption;
    private Option[] options;

    public Manager(User[] userList, User verifiedUser, int selectedOption, int maxUsers) {
        this.userList = userList;
        this.verifiedUser = verifiedUser;
        this.selectedOption = selectedOption;
        this.maxUsers = maxUsers;
    }

    public Manager(int max){
        this.maxUsers = max;
        this.userList = new User[max];
        this.selectedOption = 0;
        this.options = new Option[max];

    }

    public User[] getUserList() {
        return userList;
    }

    public void setUserList() {
        this.userList = userList;
    }

    public User getVerifiedUser() {
        return verifiedUser;
    }

    public void setVerifiedUser() {
        this.verifiedUser = verifiedUser;
    }

    public int getSelectedOption() {
        return selectedOption;
    }

    public void setSelectedOption(int selectedOption) {
        this.selectedOption = selectedOption;
    }

    public int getMaxUsers() {
        return maxUsers;
    }

    public int setMaxUsers(int maxUsers) {
        this.maxUsers = maxUsers;
        return maxUsers;
    }
    public Option authentified(String name, String password){
        this.verifiedUser = null;
        Option o =null;
        for (int i = 0; i < this.getSelectedOption(); i++) {
            verifiedUser = this.userList[i];
            if (verifiedUser.getName().equals(name)&&verifiedUser.getUserPassword().equals(password)){
                o = options[i];
            }
            
        }

        return o;

    }

    public void linkUserOption(User user, Option option){
          this.userList[selectedOption]=user;
          this.options[selectedOption]=option;
          selectedOption++;
    }

}

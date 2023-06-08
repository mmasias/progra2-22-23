package main;

public class Manager {
    private String userList;
    private String optionList;
    private boolean authenticatedUser;
    private String selectedOption;
    private int maximumUsers;

    public Manager(){
        userList = "user";
        optionList = "option";
        authenticatedUser = false;
        selectedOption = "selected";
        maximumUsers = 50;
    }

    public String getUserList() {
        return userList;
    }
    public String getOptionList() {
        return optionList;
    }
    public boolean isAuthenticatedUser() {
        return authenticatedUser;
    }
    public String getSelectedOption() {
        return selectedOption;
    }
    public int getMaximumUsers() {
        return maximumUsers;
    }

    public void setUserList(String userList) {
        this.userList = userList;
    }
    public void setOptionList(String optionList) {
        this.optionList = optionList;
    }
    public void setAuthenticatedUser(boolean authenticatedUser) {
        this.authenticatedUser = authenticatedUser;
    }
    public void setSelectedOption(String selectedOption) {
        this.selectedOption = selectedOption;
    }
    public void setMaximumUsers(int maximumUsers) {
        this.maximumUsers = maximumUsers;
    }
}

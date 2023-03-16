package main;

public class Option {
    private String userList;
    private String selectedOption;
    private int maximumOptions;

    public Option(){
        userList = "user";
        selectedOption = "option";
        maximumOptions = 10;
    }

    public void setUserList(String userList) {
        this.userList = userList;
    }
    public void setSelectedOption(String selectedOption) {
        this.selectedOption = selectedOption;
    }
    public void setMaximumOptions(int maximumOptions) {
        this.maximumOptions = maximumOptions;
    }

    public String getUserList() {
        return userList;
    }
    public String getSelectedOption() {
        return selectedOption;
    }
    public int getMaximumOptions() {
        return maximumOptions;
    }
}

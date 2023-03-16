public class Manager {
    private User userList[];
    private Option option[];
    private User authenticatedUser;
    private int maxUsers;
    private int realOptions;
    public Manager(int maxUsers) {
        this.maxUsers = maxUsers;
    }

    public User[] getUserList() {
        return userList;
    }

    public void setUserList(User[] userList) {
        this.userList = userList;
    }

    public Option[] getOption() {
        return option;
    }

    public void setOption(Option[] option) {
        this.option = option;
    }

    public User getAuthenticatedUser() {
        return authenticatedUser;
    }

    public void setAuthenticatedUser(User authenticatedUser) {
        this.authenticatedUser = authenticatedUser;
    }

    public int getMaxUsers() {
        return maxUsers;
    }

    public void setMaxUsers(int maxUsers) {
        this.maxUsers = maxUsers;
    }

    public int getRealOptions() {
        return realOptions;
    }

    public void setRealOptions(int realOptions) {
        this.realOptions = realOptions;
    }
    public Option verify(String name, String password){
        for (int i = 0; i < this.realOptions; i++) {
            this.authenticatedUser=userList[i];
            if(authenticatedUser.getName().equals(name)){
                if (authenticatedUser.getPassword().equals(password)){
                    return this.option[i];

                }
            }
        }
        return null;
    }
    public void insert(User user,Option option){
        this.userList[realOptions]=user;
        this.option[realOptions]=option;
        realOptions++;
    }

}


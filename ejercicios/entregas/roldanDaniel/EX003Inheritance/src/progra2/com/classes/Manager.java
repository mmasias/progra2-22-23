package progra2.com.classes;

public class Manager {

    private User[] users;
    private User authenticated;
    private MenuOption selectedOption;
    private int maxUsers;

    private int size;

    public Manager(){

        this.maxUsers=3;
        User[] users = new User[this.maxUsers];
        this.size=0;
    }

    public Manager(int capacity){

        this.maxUsers=capacity;
        User[] users = new User[this.maxUsers];
        this.size=0;
    }


    public User[] getUsers() {
        return users;
    }

    public void addUsers(User users) {

        if (this.size<this.maxUsers){

            this.users[size]=users;
            size++;
        }else{

            System.err.println("Error: Array completo ");
        }

    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public User getAuthenticated() {
        return authenticated;
    }

    public void setAuthenticated(User authenticated) {
        this.authenticated = authenticated;
    }

    public MenuOption getSelectedOption() {
        return selectedOption;
    }

    public void setSelectedOption(MenuOption selectedOption) {
        this.selectedOption = selectedOption;
    }

    public int getMaxUsers() {
        return maxUsers;
    }

    public void setMaxUsers(int maxUsers) {
        this.maxUsers = maxUsers;
    }
}

package Main;

public class Manager {
    User[] listOfUsers;
    Option[] listOfOptions;
    // boolean[] userVerify; Not necessary as this information is already gathered in Main.User
    int userListCapacity;

    public Manager(int userListCapacity){
        this.userListCapacity = userListCapacity;
        this.listOfOptions = new Option[this.userListCapacity];
        this.listOfUsers = new User[this.userListCapacity];
    }

    public void setUserListCapacity(int capacity){
        this.userListCapacity = capacity;
        this.listOfOptions = new Option[this.userListCapacity];
        this.listOfUsers = new User[this.userListCapacity];
    }
    public int getUserListCapacity(){
        return this.userListCapacity;
    }

    public void addUser(User user){
        for (int i = 0; i < this.userListCapacity; i++) {
            if (this.listOfUsers[i] == null){
                this.listOfUsers[i] = user;
                break;
            }
        }
    }

    public void addOption(Option option, int userOptionPos){
        this.listOfOptions[userOptionPos] = option;
    }

    public void deleteUser(int position){
        this.listOfUsers[position] = null;
    }

    public void deleteOpt(int position){
        this.listOfOptions[position] = null;
    }

    public void showUsers(){
        System.out.println("Active users:");
        for (int i = 0; i < this.userListCapacity; i++) {
            if (this.listOfUsers[i] != null){
                System.out.println(i+1+". "+listOfUsers[i].getUsername());
            }
        }
        System.out.println("");
    }
    public int inspectUsername(String username){
        for (int i = 0; i < this.userListCapacity; i++) {
            if (listOfUsers[i] == null){return -1;}
            else if((listOfUsers[i].getUsername()).equals(username)){
                return i;
            }
        }
        return -1;
    }

}

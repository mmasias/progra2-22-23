package Main;

public class Manager {

    private User[]users;
    private int userlist;
    private User[]userverified;
    private int numberuserveerified;
    private int maxuserscapcity;

    public Manager(int maxuserscapacity){
        this.users = new User[maxuserscapacity];
        this.userverified = new User[maxuserscapacity];
        this.maxuserscapcity = maxuserscapacity;
    }

    public void setUser(User[]users){
        this.users=users;
    }

    public User[] getusers(){
        return users;
    }

    public void setUserlist(int userlist){
        this.userlist=userlist;
    }

    public int getuserlist(){
        return userlist;
    }

    public void setUserverified(User[]userverified){
        this.userverified=userverified;
    }

    public User[]getUserverified(){
        return userverified;
    }

    public void setNumberuserveerified(int numberuserveerified){
        this.numberuserveerified=numberuserveerified;
    }

    public int getNumberuserveerified(){
        return numberuserveerified;
    }

    public void setMaxuserscapcity(int maxuserscapcity){
        this.maxuserscapcity=maxuserscapcity;
    }

    public int getMaxuserscapcity(){
        return maxuserscapcity;
    }

    public boolean login(User user)
    {
        for (User userToFind:users) {
            if((userToFind.getUserName() == user.getUserName()) &&
                    (userToFind.getUserPassword() == user.getUserPassword())
            ){
                this.addUserToUsersVerified(userToFind);
                this.numberuserveerified++;
                return true;
            }
        }

        return false;
    }

    public void register(User user)
    {
        if(this.numberuserveerified < this.maxuserscapcity) {
            for (int i = 0; i < this.maxuserscapcity; i++) {
                if (this.users[i] == null) {
                    this.users[i] = user;
                    this.numberuserveerified++;
                    break;
                }
            }
        }
        else {
            System.out.println("No queda mas espacio");
        }
    }

    public User getUserVerified(int index)
    {
        return this.userverified[index];
    }

    private void addUserToUsersVerified(User userToFind)
    {
        for (int i = 0; i < this.maxuserscapcity; i++) {
            if(this.userverified[i] == null)
            {
                this.userverified[i] = userToFind;
                break;
            }
        }
    }

}


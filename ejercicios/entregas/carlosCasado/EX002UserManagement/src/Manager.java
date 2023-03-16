public class Manager {

    private User[] userList;
    private int position;
    private int capacity;
    private boolean userExist;

    public Manager(int capacity) {

        this.capacity = capacity;
        this.position = 0;
        this.userList = new User[capacity];
        this.userExist = false;

    }

    public Manager() {
    }

    //CHECKS IF USER EXISTS

    public boolean checkUser(String _user) {

        int exist = 0;
        if (!(position == 0)) {
            for (int i = 0; i < position; i++) {
                if (userList[i].getUserName().equals(_user)) {
                    exist++;
                }
            }
            userExist = (exist > 0);
        } else {
            userExist = false;
        }
        return userExist;
    }

    // ADD USER AFTER CREATEUSER METHOD

    public void addUser(User userData, String type) {
        if (position < capacity) {
            userList[position] = userData;
            position++;
            if (type.equals("admin")) userData.setUserType("admin");
            System.out.println("Registered successfully! Now login with your username and password.");
        }  else {
            System.out.println("Creating new users it's disallowed");
        }
    }

    // CALLS CHECK USERS, IF IS FALSE PROCEED WITH ADDUSER

    public void createUser(User userData, String type) {

            if (userList.length == 0) {
                addUser(userData, type);
            } else {
                if (checkUser(userData.getUserName())) {
                    System.out.println("User exists! Choose another username!");
                } else {
                    addUser(userData, type);
                }
            }
    }

    // GET THE USER OF THE SPECIFIED POSITION

    public User getUsers(int position) {
        return userList[position];
    }

    // SET USERS CAPACITY

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    //GET USER POSITION BY USERNAME (USEFUL WHEN SEARCHING AVAILABLE USERNAMES IN REGISTRATION

    public int getUserPosition(String user) {
        int index = -1;
        for(int i = 0; i < position; i++) {
            if(userList[i].getUserName().equals(user)) {
                index = i;
                break;
            }
        }
        return index;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPosition() {
        return position;
    }

    // CHECKS IF USER AND PASSWORD ARE CORRECT

    public boolean authUser(String user, String pass) {
        boolean result;
        if (getUserPosition(user) == -1) {
            result = true;
        } else {
            User auth = getUsers(getUserPosition(user));
            result = !(auth.getUserPassword().equals(pass));
            if (result) auth.setLogin(true);
        }
        return result;
    }

    // CHECKS IF IT'S POSSIBLE TO CHANGE USERNAME (CALLS CHECKUSER)

    public boolean canChangeUser(User user, String entry) {
        boolean result;
        if (user.getUserName().equals(entry)) {
            result = false;
        } else {
            result = !checkUser(entry);
        }

        if (result) user.setUserName(entry);
        return result;
    }

    // RETURNS ALL USERS IN LIST

    public String usersAll() {

        String users = "";

        for (int i = 0; i < position; i++) {
            users += "[ " + userList[i].getUserName() + " ]\n";
        }
        return users;
    }

}

public class Manager {
    private int maxUsers;
    private User[]list;
    private int selectedUser;
    private User authUser;
    private Option[]menu;

    public Manager(int maxUsers) {
        this.maxUsers = maxUsers;
        this.list= new User[maxUsers];
        this.menu = new Option[maxUsers];
        selectedUser=0;

    }

    public void add(User u, Option o){
        list[selectedUser] = u;
        menu[selectedUser] = o;
        selectedUser++;

    }
    public Option verifyUser(String name, String password) {
        Option p = null;
        for (int i = 0; i < selectedUser; i++) {

            if (list[i].getName().equals(name)) {
                if (list[i].getPassword().equals(password)) {
                    p = menu[i];
                    authUser = list[i];
                }

            }

        }


        return p;
    }

}

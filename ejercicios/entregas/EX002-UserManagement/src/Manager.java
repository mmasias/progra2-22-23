public class Manager {
    private final User[] users;
    private final int maxUsers;
    private User authenticUser;
    private int optionSelection;
    private final Option[] options;

    public Manager(User[] users, int maxUsers, User authenticUser, int optionSelection, Option[] options) {
        this.users = users;
        this.maxUsers = maxUsers;
        this.authenticUser = authenticUser;
        this.optionSelection = optionSelection;
        this.options = options;
    }

    public Manager (int maxUsers){
        this.maxUsers= maxUsers;
        this.users = new User[maxUsers];
        this.options= new Option[maxUsers];
        this.optionSelection=0;
        authenticUser=null;
    }

    public void insert(User user, Option option){
        this.users[optionSelection]= user;
        this.options[optionSelection]= option;
        optionSelection++;
    }

    public Option verify(String name, String pasword){
        for (int i = 0; i < this.optionSelection; i++) {
            this.authenticUser=this.users[i];
            if (authenticUser.getName().equals(name)){
                if (authenticUser.getPass().equals(pasword)){
                    return this.options[i];
                }
            }

        }
        return null;
    }

}

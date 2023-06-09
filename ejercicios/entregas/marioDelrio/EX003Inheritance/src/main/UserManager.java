package main;

public class UserManager extends Manager {
    public UserManager()
    {
        super();
    }

    public UserManager(int maxUsers)
    {
        super(maxUsers);
    }

    public void registerUser(User user)
    {
        super.add(user);
    }

    public boolean isUserAdmin(User user){
        boolean ok=false;

        for(int i = 0; i < size; i++) {
            if (user.equals(users[i])) {
                if(((Admin)user).isAdmin()){
                    ok=true;
                }
            }

        }
        return ok;
    }
}

public class UserManager extends Manager{


    public UserManager(int maxUsers) {
        super(maxUsers);
    }
    public void registerUser(User user){
        super.add(user);

    }

    public boolean isUserAdmin(User user) {
        boolean result=false;
        for (int i = 0; i < size; i++) {

            if (user instanceof Admin){
                Admin admin=(Admin)user;
                if(admin.isAdmin()){
                    result= true;
                }
            }
            return result;
        }

        return result;
    }

  /*  public boolean isUserAdmin(User user){
        boolean result=false;
        if (user instanceof Admin){
            Admin admin=(Admin)user;
            if(admin.isAdmin()){
                result= true;
            }
        }
    return result;

    }
   */
}

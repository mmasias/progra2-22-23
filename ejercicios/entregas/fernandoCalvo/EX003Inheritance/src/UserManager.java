public class UserManager extends Manager{

    UserManager(int capacity){

    super();


    }

    void registerUser(User user){

    super.addUser(user);

    }

    boolean isUserAdmin(User user){

        boolean yes = false;

        for(int i = 0; i< users.size();i++){

            if (user.equals(users.get(i))) {
                if(((Admin)user).isAdmin()){
                    yes=true;
                }
            }


        }

    return yes;

    }


}

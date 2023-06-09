import java.util.ArrayList;
import java.util.List;

public class Manager {
    private int nUsers;

    private int firstFree;

    List<Users> users = new ArrayList<>();


    public Manager(int nU) {
        nUsers = nU;
        firstFree = 0;
    }

    public void addUsers(Users u) {
        if(this.users.size() < nUsers){
            this.users.add(u);
        }
    }


    public Users AuthenticatesUser(String login, String password) {

        Users user = null;
        for (int i=0; i<this.users.size(); i++){

            if(this.users.get(i).getLogin().equals(login) && this.users.get(i).getPassword().equals(password) ){
                user = this.users.get(i);
            }
        }
        return user;
    }

}

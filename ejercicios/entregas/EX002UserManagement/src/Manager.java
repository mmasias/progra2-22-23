import java.util.List;
import java.util.ArrayList;

public class Manager {
    private List<User> users;
    private User authenticated;
    public Option options;

    public Manager(int maxusers,int maxopt){
        this.users = new ArrayList<User>();
        this.authenticated= null;
        this.options= new Option(maxopt);
    }
    public void addUser(User aux){
        users.add(aux);
    }
    public void removeUser(User aux){
        users.remove(aux);
    }

    public User getAuthenticated() {
        return authenticated;
    }

    public List<User> getUsers() {
        return users;
    }
    public boolean authenticate(String login, String password){
        for(User aux:users){
            if(aux.getPassword().equals(password) &&aux.getUsername().equals(login)){
                authenticated=aux;
                return true;
            }

        }
        return false;
    }
}

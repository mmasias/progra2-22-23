package Main;

public class User {

    private String password;
    private String username;
    private boolean login;

    public User(String name, String password){
        this.username = name;
        this.password = password;
    }

    public void setUsername(String username){
        this.username = username;
    }
    public String getUsername(){
        return this.username;
    }

    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return this.password;
     }

    public void Login(String username, String password){
        if ((this.username).equals(username) && (this.password).equals(password)){
            this.login = true;
        }
        else {this.login = false;}
    }
    public boolean getLogin(){
        return this.login;
    }
}

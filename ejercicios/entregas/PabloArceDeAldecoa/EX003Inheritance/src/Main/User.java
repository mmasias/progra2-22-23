package Main;

public class User {
    private String login;
    private String name;
    private String password;
    public User(String login, String name, String password){
        this.login = login;
        this.name = name;
        this.password = password;
    }


    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setLogin(String login){
        this.login = login;
    }
    public String getLogin(){
        return this.login;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return this.password;
    }
}

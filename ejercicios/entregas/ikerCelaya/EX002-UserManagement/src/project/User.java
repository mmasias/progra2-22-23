package project;
public class User {
    private String name;
    private String login;
    private String password;

    public User(String name, String login, String password){
        this.name = name;
        this.login = login;
        this.password = password;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setLogin(String login){ this.login = login; }

    public String getLogin() {return this.login;}

    public void setPassword(String password) {this.password = password;}

    public String getPassword(){return this.password;}
}

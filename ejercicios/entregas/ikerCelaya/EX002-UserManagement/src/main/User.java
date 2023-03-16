package main;
public class User {
    private boolean login;
    public String name;
    public String password;

    public User(String name, String password){
        this.name = name;
        this.password = password;
    }

    public void setLogin(boolean login){ this.login = login; }

    public boolean isLogged() {return this.login;}

    public void setPassword(String password) {this.password = password;}

    public String getPassword(){return this.password;}

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}

package src.main;

public class User {

    private String login;
    private String password;
    private String name;
    public User(){

        this.login=login;
        this.password=password;
        this.name=name;

    }

    public String getLogin(){
        return this.login;
    }

    public String getPassword(){
        return this.password;
    }

    public String getName(){
        return this.name;
    }

    public void setLogin(String login){
        this.login=login;

    }

    public void setPassword(String password){
        this.password=password;
    }

    public void setName(String name){
        this.name=name;
    }
}

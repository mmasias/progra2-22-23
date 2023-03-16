public class User {
    private String password;
    public String username;
    public String name;

    public User(String psw, String nm) {
        this.name = nm;
        this.password = psw;
        username = "Steve";
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String psw){
        this.password=psw;
    }
    public String getUsername(){
        return username;
    }
    public void setUsername(String usr){
        this.username=usr;
    }
    public String getName(){
        return name;
    }
    public void setName(String nick){
        this.name=nick;
    }
}



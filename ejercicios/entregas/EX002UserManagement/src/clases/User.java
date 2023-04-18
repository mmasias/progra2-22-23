package clases;

public class User {


    private String login;
    private String password;
    private String nameUser;


    public User(){

        this.login="";
        this.password="";
        this.nameUser="";
    }

    public User(String login, String password, String nameUser){

        this.login=login;
        this.password=password;
        this.nameUser=nameUser;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }
}

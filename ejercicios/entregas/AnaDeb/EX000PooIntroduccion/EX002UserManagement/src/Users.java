public class Users {

    private String Name;

    private String login;

    private String password;

    Options menuopscions;

    public Users (String n, String l, String p, Options menu) {
        this.Name=n;
        this.login=l;
        this.password=p;
        this.menuopscions = menu;
    }


    public Users(String user1, String password1) {
    }

    public String getLogin(boolean login) {return this.login;}

    public String getName() {return this.Name;}

    public String getPassword() {return  this.password;}

    public Options myOpcions(){return this.menuopscions;}

    public Object getLogin() {return this.login;}
}

package main;
public class User {
    //#region AUTHENTICATION
    public String userName;
    private String _password;

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void set_password(String _password) {
        this._password = _password;
    }
    public boolean tryPassword(String triedPassword){
        return (triedPassword == _password);
    }
    //#endregion

    //#region SECONDARY DATA
    public String completeName;
    public String getCompleteName() {
        return completeName;
    }
    public void setCompleteName(String completeName) {
        this.completeName = completeName;
    }
    //#endregion

    public static Option options;
    public static void setOptions(Option options){
        User.options = options;
    }
    public User() {
        this.userName = "userName";
        this._password = "password";
        this.completeName = "completeName";
    }

    public User(String userName, String _password, String completeName) {
        this.userName = userName;
        this._password = _password;
        this.completeName = completeName;
    }

}

public class User {

    //Declaration attributes

    private String login;
    private String password;
    private String name;

    /*Constructor con parametros para que sea introducido el usuario
    desde la clase Manage
     */
    public User(String login, String password, String name){

        this.login=login;
        this.password=password;
        this.name=name;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean login(String userName, String password) {
        if (this.login.equals(userName) && this.password.equals(password)) {
            return true;
        }
        return false;
    }
}

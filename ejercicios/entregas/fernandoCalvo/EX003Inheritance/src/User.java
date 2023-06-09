public class User {
    private String login;
    private String password;
    private String name;

    //todo Constructor

    User(String name,String login,String password){

        this.login = login;
        this.password = password;
        this.name = name;

        System.out.println("User "+name+" created with login "+login+" and password "+password);

    }

    //todo Getters And Setters

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

    public void showUserData(){

        System.out.println("Login: "+login);
        System.out.println("Password: "+password);
        System.out.println("Name: "+name);
        System.out.println();

    }

}

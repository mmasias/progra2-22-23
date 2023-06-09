package Main;

public class User {

    private String userName;

    private String userPassword;

    private boolean login;

    private Options items;

    public void User(){

        User();
    }

    public  User(String userName,String userPassword,Options options){
        this.userName=userName;
        this.userPassword=userPassword;
        this.items =options;
    }

    public void  setUserName(String userName){
        this.userName=userName;
    }

    public void  setUserPassword(String userPassword){
        this.userPassword=userPassword;
    }
    public String getUserName(){
        return userName;
    }

    public String getUserPassword(){
        return userPassword;
    }

    public void setLogin(boolean login){
        this.login=login;
    }

    public boolean getLogin(){
        return login;
    }


    public void setItems(Options items){
        this.items=items;
    }
    public Options getItems() {
        return items;
    }
}


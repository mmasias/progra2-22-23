package main;

import java.util.Objects;

public class User {
    private String userName;
    private String password;

    String[] posts = new String[0];

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public boolean CheckPassword(String passTest){
        if (Objects.equals(passTest, this.password)){
            Texts.PrintHeader(Texts.LOGIN_CORRECTPASSWORD);
            return true;
        }
        else {
            Texts.PrintHeader(Texts.LOGIN_BADPASS);
            return false;
        }
    }

    public String getUserName(){
        return this.userName;
    }

    public boolean isSameUsername(String userTry){
        if (Objects.equals(getUserName(), userTry)){
            return true;
        }else return false;
    }

    public void ChangePassword(String newPassword){
        this.password = newPassword;
    }

    public void AddPublication(String newPost){
        posts = Utilities.Expand(posts, newPost);
    }



}
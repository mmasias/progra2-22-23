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

    // Checks if the password given is the correct one
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

    // Returns the user's username
    public String getUserName(){
        return this.userName;
    }

    // Checks if the username is the same
    public boolean isSameUsername(String userTry){
        if (Objects.equals(getUserName(), userTry)){
            return true;
        }else return false;
    }

    // Changes the password
    public void ChangePassword(String newPassword){
        this.password = newPassword;
    }

    // Adds a post string to the posts array
    public void AddPublication(String newPost){
        posts = Utilities.Expand(posts, newPost);
    }



}
package main;

public class User {
    private String userName;
    private String password;

    String[] posts = new String[0];

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public boolean CheckPassword(String passTest){
        if (passTest == this.password){
            return true;
        }
        else return false;
    }

    public String getUserName(){
        return this.userName;
    }

    public void ChangePassword(String currentPassword, String newPassword){
        if (currentPassword == this.password){
            this.password = newPassword;
        }
        else System.out.println("That's not the current password");
    }

    public void AddPublication(String newPost){
        expandArray(posts);
        posts[posts.length-1] = newPost;
    }

    public void expandArray(String[] array){
        String[] aux = array;
        array = new String[aux.length +1];
        array = aux;
    }

}

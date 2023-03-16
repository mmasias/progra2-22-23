import java.util.Scanner;
public class User {

    Scanner sc = new Scanner(System.in);
    private String userPassword;
    private String userName;

    public User(String userPassword, String username) {
        this.userPassword = userPassword;
        this.userName = username;

    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUsername() {
        return userName;
    }

    public void setUsername(String username) {
        this.userName = username;
    }



    public String getUserNameReal(){
        System.out.println("Enter username");
        String userNameReal = sc.nextLine();
        return userNameReal;

    }
    public String getUserPasswordReal(){
        System.out.println("Enter userPassword");
        String userPasswordReal = sc.nextLine();
        return userPasswordReal;

    }


}


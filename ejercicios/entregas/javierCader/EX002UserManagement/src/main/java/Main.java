import Classes.Login.Login;
import Classes.Manager.Manager;
import Classes.Users.User;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Login.login();
            User loggedUser = Login.getLoggedUser();
            if (loggedUser.isLogin()) {
                new Manager(loggedUser);
            } else {
                throw new IllegalStateException("Invalid Login!");
            }
        }
    }
}

package EX002UserManagement;
import static EX002UserManagement.Manager.*;
public class Option {
    private maxNumOptions =3;
    private String[] options = new String[maxNumOptions];

    public Option(String[] options) {
        this.options = options;
    }

    public void showOptions() {
        for (int i = 0; i < optionList.length; i++) {
            if (optionList[i] != null) {
                System.out.println((i + 1) + ". " + optionList[i]);
            }
        }
    }

    public void changePassword(User[] users) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] == users.isLogin()) {
                System.out.println("Enter new password: ");
                users[i].SetPassword(Manager.scannerString());
                System.out.println("Password changed");
            }

        }
    }

    public void changeUser(User[] users, boolean authentification, Option options) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] == users.isLogin()) {
                users[i].SetLogin(false);
                System.out.println("User changed");
                Manager.logIn(users, authentification, options);
            }
        }
    }

    public void showUsers(User[] users) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                System.out.println(users[i].getName());
            }
        }
    }
}

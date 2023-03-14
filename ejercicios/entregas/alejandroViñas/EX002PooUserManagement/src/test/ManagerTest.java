package test;
import org.junit.jupiter.api.Test;

import java.util.Scanner;
import java.util.ArrayList;
public class ManagerTest {

    private ArrayList<UserTest> users;
    private int maxUsers;
    private boolean login;
    private OptionTest options;

    public ManagerTest() {
        this.maxUsers = maxUsers;
        this.login = false;
        this.users = new ArrayList<UserTest>();
        this.options = new OptionTest();
    }

    public void setMaxUsers(int maxUsers) {
        this.maxUsers = maxUsers;
    }

    public void setLogin(boolean login) {
        this.login = login;
    }

    public void setUsers(ArrayList<UserTest> users) {
        this.users = users;
    }

    public void setOptions(OptionTest options) {
        this.options = options;
    }

    public int getMaxUsers() {
        return this.maxUsers;
    }

    public boolean getLogin() {
        return this.login;
    }

    public ArrayList<UserTest> getUsers() {
        return this.users;
    }



    public OptionTest getOptions() {
        return this.options;
    }
    @Test
    public void addUser() {
        System.out.println("Username: ");
        String userName = "test";
        System.out.println("Password: ");
        String userPassword = "test";
        UserTest user = new UserTest(userName, userPassword);
        this.users.add(user);
    }
    @Test
    public void logIn() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Username: ");
        String userName = "test";
        System.out.println("Password: ");
        String userPassword = "test";
        for (int i = 0; i < this.maxUsers; i++) {
            if(this.users.get(i).getUserName().equals(userName) && this.users.get(i).getUserPassword().equals(userPassword)) {
                this.users.get(i).setLogin(true);
                this.users.set(i, this.users.get(i));
                System.out.println("Login successful");
                break;
            } else {
                System.out.println("Login failed");
                break;
            }
        }
    }
}

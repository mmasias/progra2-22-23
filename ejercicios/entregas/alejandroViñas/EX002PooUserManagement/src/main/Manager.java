package main;
import java.util.Scanner;
import java.util.ArrayList;

public class Manager {

    private ArrayList<User> users;
    private int maxUsers;
    private boolean login;
    private Option options;

    public Manager() {
        this.maxUsers = maxUsers;
        this.login = false;
        this.users = new ArrayList<User>();
        this.options = new Option();
    }

    public void setMaxUsers(int maxUsers) {
        this.maxUsers = maxUsers;
    }

    public void setLogin(boolean login) {
        this.login = login;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public void setOptions(Option options) {
        this.options = options;
    }

    public int getMaxUsers() {
        return this.maxUsers;
    }

    public boolean getLogin() {
        return this.login;
    }

    public ArrayList<User> getUsers() {
        return this.users;
    }



    public Option getOptions() {
        return this.options;
    }
    public void addUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Username: ");
        String userName = scanner.nextLine();
        System.out.println("Password: ");
        String userPassword = scanner.nextLine();
        User user = new User(userName, userPassword);
        this.users.add(user);
    }

    public void logIn() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Username: ");
        String userName = scanner.nextLine();
        System.out.println("Password: ");
        String userPassword = scanner.nextLine();
        for (int i = 0; i < this.maxUsers; i++) {
            if (this.users.get(i).getUserName().equals(userName) && this.users.get(i).getUserPassword().equals(userPassword)) {
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

package main;

import java.util.Scanner;
public class Option {

    private int maxOption;
    private String[] options;
    private boolean[] optionsStatus;
    private Manager manager;
    private User user;

    public Option() {
        this.options = new String[maxOption];
        this.optionsStatus = new boolean[maxOption];
    }

    public void setOption(int index, String option) {
        this.options[index] = option;
    }
    public void setOptionStatus(int index, boolean status) {
        this.optionsStatus[index] = status;
    }
    public void setMaxOption(int maxOption) {
        this.maxOption = maxOption;
    }
    public String getOption(int index) {
        return this.options[index];
    }
    public boolean getOptionStatus(int index) {
        return this.optionsStatus[index];
    }
    public int getMaxOption() {
        return this.maxOption;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public Manager getManager() {
        return this.manager;
    }
    public User getUser() {
        return this.user;
    }

    public void selectedOption() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select an option:");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                System.out.println("Change user name");
                System.out.println("New user name: ");
                Scanner scanner5 = new Scanner(System.in);
                String newUserName = scanner5.nextLine();
                this.user.changeUserName(newUserName);
                System.out.println("User name changed");
                showOptions();
                selectedOption();
                break;
            case 2:
                System.out.println("Change password");
                System.out.println("New password: ");
                Scanner scanner1 = new Scanner(System.in);
                String newUserPassword = scanner1.nextLine();
                this.user.changePassword(newUserPassword);
                showOptions();
                selectedOption();
                break;
            case 3:
                System.out.println("Log out");
                this.user.logout();
                break;
            case 4:
                System.out.println("Change account");
                this.user.logout();
                System.out.println("Enter your user name: ");
                Scanner scanner2 = new Scanner(System.in);
                String userName = scanner2.nextLine();
                System.out.println("Enter your password: ");
                Scanner scanner3 = new Scanner(System.in);
                String userPassword = scanner3.nextLine();
                this.user.login(userName, userPassword);
                showOptions();
                selectedOption();
                break;
            case 5:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }
    public void showOptions(){
        System.out.println("1. Change user name");
        System.out.println("2. Change password");
        System.out.println("3. Log out");
        System.out.println("4. Change account");
        System.out.println("5. Exit");

    }






}

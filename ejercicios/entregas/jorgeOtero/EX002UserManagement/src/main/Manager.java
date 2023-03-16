package main;

import java.util.Scanner;

public class Manager {
    private int maxUsers;
    private boolean login;
    public User[] members;
    private int position;

    public Manager(int maxUsers) {
            this.maxUsers = maxUsers;
            this.login = false;
            this.position = 0;
            this.members = new User[maxUsers];
        }
    public String askName(){
        Scanner inName = new Scanner(System.in);
        String name = inName.nextLine();
        return name;
    }
    public String askPassword(){
        Scanner inPassword = new Scanner(System.in);
        String password = inPassword.nextLine();
        return password;
    }
    public void firstOptionSelected(){
        Option option = new Option();
        Scanner askOption = new Scanner(System.in);
        int numberOption = askOption.nextInt();
        switch (numberOption) {
            case 1:
                System.out.println("Username: ");
                String userName = askName();
                System.out.println("Password: ");
                String userPassword = askPassword();
                User user = new User(userName, userPassword);
                for(int i = 0; i<=(position-1); i++){
                    String name = members[i].getUserName();
                    if(userName.equals(name) && userPassword.equals(members[i].getUserPassword())){
                        user.setLogin(true);
                    }
                }
                if(user.getLogin() == true){
                    System.out.println("Login successful");
                    option.showOptionList();
                    optionSelectedList();
                }else{
                    System.out.println("Impossible to login");
                    option.showFirstlOptionList();
                    firstOptionSelected();
                }
                break;

            case 2:
                System.out.println("Username: ");
                String newUserName = askName();
                System.out.println("Password: ");
                String newUserPassword = askPassword();
                User newUser = new User(newUserName, newUserPassword);
                newUser.setLogin(true);
                addUser(newUser);
                System.out.println("Adding...");
                option.showOptionList();
                optionSelectedList();
                break;
            case 3:
                System.out.println("Thanks for using");
                break;
        }
    }
    public void optionSelectedList(){
        Option option = new Option();
        Scanner askOption = new Scanner(System.in);
        int numberOption = askOption.nextInt();
        switch (numberOption){
            case 1:
                System.out.println("Write your new password: ");
                members[profileOn()].setUserPassword(askPassword());
                System.out.println("Your new password: " + members[profileOn()].getUserPassword());
                option.showOptionList();
                optionSelectedList();
                break;

            case 2:
                System.out.println("Write your new name: ");
                members[profileOn()].setUserName(askName());
                System.out.println("Your new name: " + members[profileOn()].getUserName());
                option.showOptionList();
                optionSelectedList();
                break;

            case 3:
                members[profileOn()].setLogin(false);
                option.showFirstlOptionList();
                firstOptionSelected();
                break;

            case 4:
                System.out.println("Bye bye");
                option.showFirstlOptionList();
                firstOptionSelected();
                break;
            case 5:
                for(int i = 0; i<=(position-1); i++ ) {
                    System.out.print("UserName: " + members[i].getUserName());
                    System.out.println("---> UserPassword: " + members[i].getUserPassword());
                }
                break;
        }
    }
    public int profileOn(){
        int userOn = 0;
        for(int i = 0; i<=(position-1); i++){
            boolean login = members[i].getLogin();
            if(login == true){
                userOn = i;
            }
        }
        return userOn;
    }

    public void addUser(User user) {
        if (position < maxUsers) {
            members[position] = user;
            position = position + 1;
        }
    }

}

package main;

import static main.Manager.logIn;

public class Option {
    private int maxNumberOfOptions = 3;
    private String[] optionList = new String[maxNumberOfOptions];
    public Option(String[] optionList) {
        this.optionList = optionList;
    }

    public void showOptions(){
        for (int i = 0; i < optionList.length; i++) {
            if (optionList[i] != null) {
                System.out.println((i+1) + ". " + optionList[i]);
            }
        }
    }

    public void changePassword(Manager.User[] userList){
        for(int i= 0; i < userList.length; i++){
            if(userList[i].isLogin()){
                System.out.println("Enter the new password: ");
                userList[i].setUserPassword(Manager.scannerString());
            }
        }
        System.out.println("Password changed successfully");

    }



    public void changeUser(Manager.User[] userList, boolean authenticated, Option optionList){
        logIn(userList, authenticated, optionList);
    }

    public void showUsers(Manager.User[] userList){
        for (int i = 0; i < userList.length; i++) {
            if (userList[i] != null) {
                System.out.println(userList[i].getUserName());
            }
        }
    }



}



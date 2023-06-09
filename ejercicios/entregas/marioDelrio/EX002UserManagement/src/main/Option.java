package main;

import java.util.Scanner;

import static main.Manager.signIn;

public class Option {
    private int maxOptions = 5;
    private String[] optionList = new String[maxOptions];

    public Option(String[] optionList) {
        this.optionList = optionList;
    }
    public void displayOption() {
        for (int i = 0; i < optionList.length; i++) {
            if (optionList[i] != null) {
                System.out.println((i+1) + ". " + optionList[i]);
            }
        }
    }

    public void changePassword(User[] usersList){

        for(int i= 0; i < usersList.length; i++){
            if(usersList[i].isLogin()){
                System.out.println("Enter the new password: ");
                usersList[i].setPassword(Manager.scannerText());
            }
        }
        System.out.println("Password was changed");
    }

    public void changeUser(User[] usersList, boolean checked, Option optionList){
        signIn(usersList, optionList);
    }

    public void showUsers(User[] usersList){
        for (int i = 0; i < usersList.length; i++) {
            if (usersList[i] != null) {
                System.out.println(usersList[i].getName());
            }
        }
    }


}
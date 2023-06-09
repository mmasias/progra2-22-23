package main;

import java.util.Scanner;

public class Option {
    private final int[] firstOptionList = {1,2,3};
    private final int maxFirstOptions = 3;
    private final String[] firstOptionListText = {
            "-Login",
            "-Sign up",
            "-Exit"
    };
    private final int maxOptions = 5;
    private final int[] optionList = {1,2,3,4,5};
    private final String[] optionListText = {
            "-Change Password",
            "-Change User Name",
            "-Log out",
            "-Exit",
            "-Admin Option"
    };

    public void showFirstlOptionList(){
        for(int i= 0;i<=(maxFirstOptions - 1);i++){
            System.out.println(firstOptionList[i] + firstOptionListText[i]);
        }
    }
    public void showOptionList(){
        for(int i= 0;i<=(maxOptions - 1);i++){
            System.out.println(optionList[i] + optionListText[i]);
        }
    }
}
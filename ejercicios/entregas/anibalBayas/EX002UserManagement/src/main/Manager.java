package main;

import java.util.Scanner;

public class Manager {
    public static void main(String[] args) {
        User[] userList = new User[10];
        User Anibal=new User("Anibal","1234");
        userList[0]= Anibal;
        Option optionList= new Option(new String[]{"Press 1 to show account","Press 2 to log out"});
        System.out.println("Enter user: ");
        Scanner Teclado = new Scanner (System.in);
        String userName= Teclado.nextLine();

        System.out.println("Enter password: ");
        String password= Teclado.nextLine();

        if(userList[0].getUserName().equals(userName)&& userList[0].getUserPassword().equals(password)){
            userList[0].setLogin(true);
            System.out.println("Hello, choose one option:");
            optionList.ShowOptions();
            int choose = Teclado.nextInt();
            switch(choose){
                case 1:
                    System.out.println("Account:");
                    System.out.print("Name:");
                    optionList.ShowUser(userList);
                case 2:
                    optionList.LogOut(Anibal);
            }
        }else{
            System.out.println("Wrong password/username");
        }
    }

}

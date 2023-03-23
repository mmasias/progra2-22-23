package Poo;

public class Manager {
    private User[] usersList;
    private Option[] optionsList;
    private User autentUser;
    private Option selectedOption;
    private static int  maxUsers = 100;
    private static int maxOptions = 150;


    public Manager(User autentUser, Option selectedOption) {
        this.usersList = new User[maxUsers];
        this.optionsList = new Option[maxOptions];
        this.autentUser = autentUser;
        this.selectedOption = selectedOption;
    }


}

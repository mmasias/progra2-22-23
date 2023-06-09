import java.util.Scanner;

public class Manager {

    static Scanner sc = new Scanner(System.in);
    Scanner scNum= new Scanner(System.in);
    static User[] users;
    static Option[] options;
    int maxUsers;
    int maxOptions;
    static int identifiedUser=-1;


    String name;
    String password;
    String login;

    int storedUsers=0;
    int storedOptions=0;


    public Manager(int maxUsers) {
        this.maxUsers = maxUsers;
        users= new User[maxUsers];
        options= new Option[maxUsers];
    }

    void createUser(){
        System.out.println("\n--CREATE A NEW USER--");
        System.out.print("Name: ");
        name= sc.nextLine();
        System.out.print("Login: ");
        login= sc.nextLine();
        System.out.print("Password: ");
        password= sc.nextLine();
        System.out.print("Max menu options: ");
        maxOptions= scNum.nextInt();


        if (maxUsers>storedUsers){
            User tempUser = new User(login,name,password);

            users[storedUsers]=tempUser;
            System.out.println("You added a new user "+tempUser.name);


            Option tempOption = new Option(maxOptions);

            String newOption;
            for (int i=0;i<maxOptions;i++){
                System.out.print("Add the option "+(i+1)+": ");
                newOption = sc.nextLine();
                tempOption.addOptions(newOption);
            }
            options[storedOptions]= tempOption;
            System.out.println("You added a new option menu ");


            storedUsers++;
            storedOptions++;

        } else {
            System.out.println("It is impossible to add more options (MAX OPTIONS) "+maxUsers);
        }

    }

    static void identify(String john123, String password123){
        System.out.println("\n--LOGIN--");
        String login = null;
        System.out.println("Login: ");
        login= sc.nextLine();
        String password = null;
        System.out.println("Password: ");
        password= sc.nextLine();


        for (int x=0;x<users.length;x++){
            if ((users[x].login.equalsIgnoreCase(login))){
                identifiedUser=x;
                if ((users[x].password.equalsIgnoreCase(password))){
                    System.out.println("\nWelcome "+users[x].name);
                    options[x].showOptions();
                } else {
                    System.out.println("\nIncorrect password");
                }
            }
        }
        if (identifiedUser==-1){
            System.out.println("\nChosen user not found");
        }

    }



}

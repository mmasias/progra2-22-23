import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
    ArrayList<User> users;
    static final int maxUsers = 2;
    ArrayList<Option> options;
    int loggedUser;

    User authenticatedUser;

    MenuOption selectedOption;
    Scanner sc = new Scanner(System.in);

    Manager(){

        users = new ArrayList<User>();
        options = new ArrayList<Option>();
        loggedUser = -1;


    }
    void addUser(User user){

        if(users.size()==maxUsers){

            System.out.println("Unable to create an user. Maximum users: "+maxUsers);

        }else{

            users.add(user);

            System.out.print("How many options: ");
            int no = sc.nextInt();
            Option optionMenu = new Option(no);
            options.add(optionMenu);

            System.out.println("User "+user.getName()+" added to web DB.");

        }

    }

    void userLogin(){

        String login;
        String password;

        System.out.println("--- WEB PORTAL ---");
        System.out.print("Login: ");
        login = sc.next();
        System.out.print("Password: ");
        password = sc.next();

        for(int i=0;i<users.size();i++){

            if(login.equalsIgnoreCase(users.get(i).getLogin())){

                loggedUser = i;

            }

        }

        if(loggedUser==-1){

            System.out.println("User not found");

        }else{

            if(users.get(loggedUser).getPassword().equalsIgnoreCase(password)){

                System.out.println("User found");

                options.get(loggedUser).listOptions();

            }else{

                System.out.println("Invalid Password");

            }

        }

    }

    boolean authenticateUser(String login,String password){

        for(int i=0;i<users.size();i++){

            if(login.equalsIgnoreCase(users.get(i).getLogin())){

                loggedUser = i;

            }

        }

        if(loggedUser==-1){

            System.out.println("User not found");

        }else{

            if(users.get(loggedUser).getPassword().equalsIgnoreCase(password)){

                System.out.println("User found");

                showMenu();

                return true;

            }else{

                System.out.println("Invalid Password");

            }

        }

        return false;

    }

    void showMenu(){

        options.get(loggedUser).listOptions();

    }

}
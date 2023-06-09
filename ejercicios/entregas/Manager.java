import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
    ArrayList<User> users;
    static final int usersMax = 2;
    ArrayList<Option> options;
    int loggedUser;
    Manager(){

        users = new ArrayList<User>();
        options = new ArrayList<Option>();
        loggedUser = -1;


    }
    void addUser(User user,Option menuOptions){

        if(users.size()==usersMax){

            System.out.println("Unable to create an user. Maximum users: "+usersMax);

        }else{

            users.add(user);
            options.add(menuOptions);

            System.out.println("User "+user.getName()+" added to web DB.");

        }

    }
    void userLogin(){

        String login;
        String password;

        Scanner sc = new Scanner(System.in);

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

}

import java.util.Scanner;

public class UserManager extends Manager {

    String userName;
    String password;
    String name;
    int numberOfOptions;

    String opt;
    String admin;

    Scanner sctext =new Scanner(System.in);
    Scanner scint =new Scanner(System.in);

    public UserManager() {
    }

    public UserManager(int capacity) {
        super(capacity);
    }

    void registerUser() {
        System.out.println("\n--- REGISTER USER ---");
        System.out.println("Login: ");
        userName = sctext.nextLine();

        System.out.println("Password: ");
        password = sctext.nextLine();

        System.out.println("Name: ");
        name = sctext.nextLine();

        System.out.println("Number of options: ");
        numberOfOptions = scint.nextInt();

        MenuOption actualMenu =new MenuOption(numberOfOptions);

        for(int i=0; i<numberOfOptions; i++){

            System.out.println("Option "+(i+1)+": ");
            opt =sctext.nextLine();
            actualMenu.add(opt);
        }

        System.out.println("User is admin? (Yes/No): ");
        admin = sctext.nextLine();

        if (admin.equalsIgnoreCase("Yes")){

            Admin actualUser =new Admin(userName, password, name);
            add(actualUser, actualMenu);

        } else if (admin.equalsIgnoreCase("No")) {

            RegularUser actualUser =new RegularUser(userName, password, name);
            add(actualUser, actualMenu);

        }else {
            System.out.println("Invalid option");
        }



    }

    boolean isUserAdmin(Admin user){
        if(user.isAdmin()==true){
            System.out.println("User is admin\n");
            return true;

        }else{
            System.out.println("User is not admin\n");
            return false;

        }


    }

    boolean isUserAdmin(RegularUser user){
        if(user.isAdmin()==true){
            System.out.println("User is admin\n");
            return true;

        }else{
            System.out.println("User is not admin\n");
            return false;

        }

    }

    void authenticate(){
        String log;
        String pass;
        System.out.println("\n--- LOGIN ---");
        System.out.print("Login: ");
        log = sctext.nextLine();
        System.out.print("Password: ");
        pass = sctext.nextLine();

        login(log, pass);
    }

}

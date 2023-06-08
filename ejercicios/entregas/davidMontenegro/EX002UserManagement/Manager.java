package EX002UserManagement;
import java.util.scanner;
public class Manager {
    public static void main(String[] args){
        system.out.println("Number of users to create: ");
        int numMaxUsers = ImputIntScanner();
        User[] users = new User[numMaxUsers];
        boolean authentification = false;
        Option options = new Option(new String[]{"Change password", "Change user", "Show users"});
        signUp(users, numMaxUsers);

        logIn(users, authentification, options);
    }

    public static String ImputStringScanner(){
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        return string;
    }
    public static int ImputIntScanner(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        return num;
    }

    public static void addUser(User[] users, int numMaxUsers, User user){
        if (numMaxUsers <= users.length){
            for (int i = 0; i < numMaxUsers; i++) {
                if (users[i] == null) {
                    users[i] = user;
                    break;
                }
            }
        }
    }
    public static void signUp(User[] users, int numMaxUsers) {
        for (int i = 0; i < numMaxUsers; i++) {
            Systrem.out.println("Sign up");
            system.out.println("User name: ");
            String name = ImputStringScanner();
            system.out.println("User password: ");
            String password = ImputStringScanner();
            User user = new User(name, password);
            addUser(users, numMaxUsers, user);
        }
    }
    public static void singIn(User[] users, boolean authentification, Option options){
        system.out.println("Sing in");
        system.out.println("User name: ");
        String name = ImputStringScanner();
        system.out.println("User password: ");
        String password = ImputStringScanner();
        system.out.println("authenticating...");
        return authentification = authentification(users, name, password, authentification);
        }
    public static boolean authentification(User[] users, String name, String password, boolean authentification){
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                if (users[i].GetName().equals(name) && users[i].GetPassword().equals(password)) {
                    authentification = true;
                    break;
                }
            }
        }
        return authentification;
        }
    public static void logIn(User[] users, boolean authentification, Option options){
        if (signIn(users, authentification)){
            options.showOptions();
            optionChoose(options, users);
        } else {
            system.out.println("User or password are incorrect");
        }
        }
    public static void optionChoose(Option options, User[] users){
        system.out.println("Choose an option: ");
        int option = ImputIntScanner();
        switch (option) {
            case 1:
                system.out.println("Change password");
                options.changePassword(users);
                break;
            case 2:
                system.out.println("Change user");
                options.changeUser(users);
                break;
            case 3:
                system.out.println("Show users");
                options.showUsers(users);
                break;
            default:
                system.out.println("Option not found");
                break;
        }
        }
    }
    }
package src.classes;
import java.util.Scanner;

public class Manager {
    UserRepository userRepository;
    OptionRepository optionRepository;
    Scanner scanner = new Scanner(System.in);

    public Manager(UserRepository userRepository, OptionRepository optionRepository){
        this.userRepository = userRepository;
        this.optionRepository = optionRepository;
    }

    public void login() {
        System.out.println("Enter username:");
        String inputUserName = scanner.nextLine();

        validateUser(inputUserName);
    }

    public void validateUser(String username) {
        Boolean userNotExists = true;

        for (int index = 0; index < userRepository.get().length; index++) {
            if (userRepository.get()[index].getUserName().equals(username)) {
                userNotExists = false;
                validatePassword(index);
                getIndex(index);
            }
        }
        if (userNotExists) {System.out.println("Invalid username");}
    }

    public void validatePassword(int index){
        System.out.println("Enter password:");
        String inputPassword = scanner.nextLine();

        String username = userRepository.get()[index].getUserName();

        if(userRepository.get()[index].getUserPassword().equals(inputPassword)){
            System.out.println("Welcome " + username + "!");
            userRole(index);
        }else{System.out.println("Invalid password");}
    }

    public void userRole(int index) {
        Roles role = userRepository.get()[index].getUserRole();
        Option.showOptions(role);
    }
    public static int getIndex(int index){
        int Index = index;
        return Index;
    }
}

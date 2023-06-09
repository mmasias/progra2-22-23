package Main;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        Manager host = new Manager(5);
        User user1 = new User ("Manolo", "1234");
        User user2 = new User ("Pepe", "4321");
        User user3 = new User ("Peter", "5678");
        Option option1 = new Option ("Options for user1",3);
        Option option2 = new Option ("Options for user2",3);
        Option option3 = new Option ("Options for user3",3);

        host.addUser(user1);
        host.addUser(user2);
        host.addUser(user3);

        host.addOption(option1, 0);
        host.addOption(option2, 1);
        host.addOption(option3, 2);

        option1.addOption("Custom option1 n1");
        option1.addOption("Custom option1 n2");
        option1.addOption("Custom option1 n3");

        option2.addOption("Custom option2 n1");
        option2.addOption("Custom option2 n2");
        option2.addOption("Custom option2 n3");

        option3.addOption("Custom option3 n1");
        option3.addOption("Custom option3 n2");
        option3.addOption("Custom option3 n3");

        //Display
        String username;
        String password = "";
        int attempts = 4;
        int selectedUser;

        host.showUsers();

        while(true) {
            System.out.print("Introduce your username: ");
            username = entry.nextLine();
            selectedUser = host.inspectUsername(username);
            if (selectedUser != -1){break;}
            System.out.println("User does not exist");
        }
        for (int i = attempts; i >= 0; i--) {
            System.out.print("Hello "+username+", introduce your password: ");
            password = entry.nextLine();
            if (password.equals(host.listOfUsers[selectedUser].getPassword())){break;}
            System.out.println("Wrong password.\nYou have "+i+" attempts left");
        }
        host.listOfUsers[selectedUser].Login(username,password);
        if (host.listOfUsers[selectedUser].getLogin() == true){
            host.listOfOptions[selectedUser].showOptions();
        }
        else {System.out.println("Try later");}


        entry.close();
    }
}
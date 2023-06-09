import java.util.ArrayList;
import java.util.List;

public class Manager {
    private ArrayList<User> users;
    private User authenticatedUser;
    private Option userOptions;

    public Manager() {
        this.users = new ArrayList<User>();
        this.userOptions = new Option(5);
    }

    public void addUser(User user) {
        this.users.add(user);
    }

    public void removeUser(User user) {
        this.users.remove(user);
    }

    public boolean authenticate(String login, String password) {
        for (User user : this.users) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                this.authenticatedUser = user;
                return true;
            }
        }
        return false;
    }

    public void displayUserOptions() {
        if (this.authenticatedUser == null) {
            System.out.println("Usuario no autenticado");
        } else {
            List<String> options = this.userOptions.getOptions();
            System.out.println("Opciones disponibles para " + this.authenticatedUser.getName() + ":");
            System.out.println(options);
//            for (int i = 0; i < options.size(); i++) {
//                System.out.println(i + ": " + options.get(i));
//            }
        }
    }

    public void selectUserOption(int option) {
        if (this.authenticatedUser == null) {
            System.out.println("Usuario no autenticado");
        } else {
            this.userOptions.setSelectedOption(option);
            System.out.println("Opción seleccionada: " + this.userOptions.getOptions().get(option));
        }
    }
}
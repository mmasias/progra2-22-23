import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Option option = new Option(3);
        Scanner scanner = new Scanner(System.in);
        Manager manager = new Manager();

        option.addOption("Ver perfil");
        option.addOption("Editar perfil");
        option.addOption("Cerrar sesión");

        User user1 = new User("aochoa", "lobo1234", "Aurelio");
        manager.addUser(user1);

        boolean authenticated = false;
        while (!authenticated) {
            System.out.print("Introduce tu login: ");
            String login = scanner.nextLine();
            System.out.print("Introduce tu password: ");
            String password = scanner.nextLine();

            authenticated = manager.authenticate(login, password);
            if (!authenticated) {
                System.out.println("Autenticación fallida, inténtalo de nuevo.");
            }
        }

        manager.displayUserOptions();

        System.out.print("Selecciona una opción: ");
        int input = scanner.nextInt();
        manager.selectUserOption(input);

        scanner.close();
    }
}

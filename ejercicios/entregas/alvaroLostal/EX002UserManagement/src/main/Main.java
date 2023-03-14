package main;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        // crear un gestor de usuarios
        Manager userManager = new Manager();

        // agregar algunos usuarios al gestor
        User user1 = new User("user1", "password1", "John");
        User user2 = new User("user2", "password2", "Jane");
        User user3 = new User("user3", "password3", "Jack");
        userManager.addUser(String.valueOf(user1));
        userManager.addUser(String.valueOf(user2));
        userManager.addUser(String.valueOf(user3));

        // leer el login y password del usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el login: ");
        String login = scanner.next();
        System.out.print("Ingrese la contraseña: ");
        String password = scanner.next();

        // autenticar al usuario
        boolean authenticated = userManager.authenticate(login, password);

        if (authenticated) {
            // mostrar el menú de opciones
            Option menu = userManager.getMenu();
            System.out.println("Bienvenido " + userManager.getAuthenticatedUser().getName());
            System.out.println("Seleccione una opción:");
            int i = 1;
            for (String option : menu.getOptions()) {
                System.out.println(i + ". " + option);
                i++;
            }
            System.out.print("Seleccione una opción: ");
            int selectedOption = scanner.nextInt();
            userManager.setSelectedOption(selectedOption);

            // realizar la opción seleccionada
            System.out.println("Ha seleccionado la opción: " + menu.getSelectedOption());
            // ... código para realizar la opción seleccionada ...
        } else {
            System.out.println("Login o password incorrecto");
        }
    }

}

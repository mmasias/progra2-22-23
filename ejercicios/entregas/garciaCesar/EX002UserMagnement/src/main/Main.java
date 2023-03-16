package src.main;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Option options = new Option();
		Manager manager = new Manager();
		User user = new User();

		Scanner sc = new Scanner(System.in);

		while (true) {
			while (!manager.getIsLogged()) {
				System.out.println("What do you want to do?\n1. Log in\n2. Register\n3. Exit");
				int selectedOption = sc.nextInt();
				switch (selectedOption) {
					case 1:
						System.out.println("Enter username: ");
						String username = sc.next();
						System.out.println("Enter password: ");
						String password = sc.next();
						if (username.equals(user.getUsername()) && password.equals(user.getUserPassword())) {
							System.out.println("Logged successfully!");
							manager.setIsLogged(true);
						}
						else {
							System.out.println("Invalid username or password!");
						}
						break;
					case 2:
						System.out.println("Enter username: ");
						username = sc.next();
						System.out.println("Enter password: ");
						password = sc.next();
						user.setUsername(username);
						user.setUserPassword(password);
						System.out.println("Registration successfully done!");
						break;
					case 3:
						System.out.println("Exiting...");
						System.exit(0);
				}
			}

			while (Option.getIsLoggedIn()) {
				System.out.println("What do you want to do? \n 1. Change your password \n 2. Change your username \n 3. Log out");
				int selectedOption = sc.nextInt();
				switch(selectedOption) {
					case 1:
						Option.changePassword();
						break;
					case 2:
						Option.changeUsername();
						break;
					case 3:
						Option.logOut();
						manager.setIsLogged(false);
						break;
					default:
						System.out.println("Invalid option");
				}
			}
		}
	}
}
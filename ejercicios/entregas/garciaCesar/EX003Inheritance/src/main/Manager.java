package src.main;

public class Manager {
	private User users[];
	private User authenticatedUser;
	private MenuOption selectedOption;
	private int maxUsers;

	public Manager() {
		maxUsers = 10;
	}

	public void addUser(User user) {
		// agregar usuario
	}

	public boolean authenticateUser(String username, String password) {
		// autenticar usuario
		return false;
	}

	public void showMenu() {
		// mostrar menú
	}
}


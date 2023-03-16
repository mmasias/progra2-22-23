package src.main;
public class Manager {

	private static boolean isLogged;

	public Manager() {
		isLogged = false;
	}

	public static String scannerString() {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		return scanner.nextLine();
	}

	public boolean getIsLogged() {
		return isLogged;
	}
	public void setIsLogged(boolean isLogged) {
		this.isLogged = isLogged;
	}
}
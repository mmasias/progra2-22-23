package src.main;

public class Option {

	private static boolean isLoggedIn;

	public static boolean getIsLoggedIn() {
		return isLoggedIn;
	}

	public void setIsLoggedIn(boolean isLoggedIn) {
		this.isLoggedIn = isLoggedIn;
	}

	public Option() {
		isLoggedIn = true;
	}

	public static void changePassword(){
		System.out.println("Enter the new password: ");
		new User().setUserPassword(Manager.scannerString());
		System.out.println("Password changed successfully");
	}
	public static void changeUsername(){
		System.out.println("Enter the new username: ");
		new User().setUsername(Manager.scannerString());
		System.out.println("Username changed successfully");
	}
	public static void logOut(){
		System.out.println("Logging out...");
		new Option().setIsLoggedIn(false);
		new Manager().setIsLogged(false);
	}

}


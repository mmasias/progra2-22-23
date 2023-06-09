package src.main;

public class Admin extends User {
	private boolean isAdmin;

	public Admin(String userName, String password, boolean isAdmin) {
		super(userName, password);
		this.isAdmin = isAdmin;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
}

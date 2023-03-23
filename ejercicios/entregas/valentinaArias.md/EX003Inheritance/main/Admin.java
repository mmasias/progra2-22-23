package main;

public class Admin extends User {
	public boolean isAdmin;

	public Admin() {
		this.isAdmin = true;
	}

	public boolean isAdmin() {
		return isAdmin;
	}


	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

}

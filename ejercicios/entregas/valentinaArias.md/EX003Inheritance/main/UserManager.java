package main;

public class UserManager extends Manager {
	public String registerUser;
	public boolean isUserAdmin;

	public void registerUser(User user) {
		this.add(user);
	}
}

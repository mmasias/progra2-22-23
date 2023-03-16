package src.main;
public class User {
	private String username;
	private String password;
	private boolean logged = false;

	public User(String username, String password, boolean logged) {
		this.username = username;
		this.password = password;
		this.logged = logged;
	}

	public User() {
		username = "";
		password = "";
		logged = false;
	}

	public String getUsername() {
		return username;
	}

	public String getUserPassword() {
		return password;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setUserPassword(String password) {
		this.password = password;
	}
	public boolean isLogged() {
		return logged;
	}
	public void setLogged(boolean logged) {
		this.logged = logged;
	}
}
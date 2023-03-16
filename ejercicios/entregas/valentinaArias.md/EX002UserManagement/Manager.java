import java.util.ArrayList;

public class Manager {
	private ArrayList<User> userList;
	private boolean authenticatedUser;
	private int selectedOption;
	private int maximumNumberUsers;

	public Manager(int maximumNumberUsers) {
		this.userList = new ArrayList<>();
		this.authenticatedUser = false;
		this.selectedOption = -1;
		this.maximumNumberUsers = maximumNumberUsers;
	}

	public boolean addUser(User user) {
		if (userList.size() < maximumNumberUsers) {
			return userList.add(user);
		} else {
			return false;
		}
	}

	public boolean authenticateUser(String login, String password) {
		for (User user : userList) {
			if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
				authenticatedUser = true;
				return true;
			}
		}
		return false;
	}

	public void showMenu() {
		if (authenticatedUser) {
			System.out.println("Welcome!");
			Option option = new Option(3);
			option.addOption("Option 1");
			option.addOption("Option 2");
			option.addOption("Option 3");

			System.out.println("Select an option:");
			String[] options = option.getOptions();
			for (int i = 0; i < options.length; i++) {
				System.out.println((i + 1) + ". " + options[i]);
			}
			selectedOption = option.getSelectedOption();
		} else {
			System.out.println("You need to authenticate first.");
		}
	}

	public boolean isAuthenticatedUser() {
		return authenticatedUser;
	}

	public void setSelectedOption(int selectedOption) {
		this.selectedOption = selectedOption;
	}

	public int getSelectedOption() {
		return selectedOption;
	}
}

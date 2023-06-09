package src.main;

public class MenuOption extends Options {
	private String description;

	public MenuOption(int maxOptions) {
		super(maxOptions);
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}

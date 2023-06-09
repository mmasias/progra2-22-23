package src.main;

public class MenuOption extends Option{

    // Attributes
    private String description;

    // Constructor
    public MenuOption(String[] options, int selectedOption, int maxOptions, String description) {
        super(options, selectedOption, maxOptions);
        this.description = description;
    }
    public MenuOption(int maxOptions, String description) {
        super(maxOptions);
        this.description = description;
    }
    // description
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        addOption(description);
    }
}

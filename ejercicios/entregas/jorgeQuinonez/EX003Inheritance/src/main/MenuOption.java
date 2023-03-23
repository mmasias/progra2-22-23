package main;

public class MenuOption extends Option {

    private String description;

    public MenuOption(String[] options, int selectedOption, int maxOptions) {
        super(options, selectedOption, maxOptions);
        this.description = "";
    }

    public MenuOption(String[] options, int selectedOption, int maxOptions, String description) {
        super(options, selectedOption, maxOptions);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

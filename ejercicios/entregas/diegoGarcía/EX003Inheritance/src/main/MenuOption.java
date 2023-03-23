package main;

public class MenuOption extends Option{

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MenuOption(String description) {
        this.description = description;
    }

    public MenuOption(int maxOptions, String description) {
        super(maxOptions);
        this.description = description;
    }
}

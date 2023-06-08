package main;

public class MenuOption extends Option {

    String description;

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

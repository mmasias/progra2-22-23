package main;

public class MenuOption extends Option {
    String description;

    public MenuOption(int maxOptions, String description) {
        super(capacity);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    
}

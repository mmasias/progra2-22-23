package main;

public class MenuOption extends Option{
    public String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MenuOption(String description) {
        this.description = description;
    }

    public MenuOption(int capacity, String description) {
        super(capacity);
        this.description = description;
    }
}

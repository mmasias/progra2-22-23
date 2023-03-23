package main;

public class MenuOption extends Option {
    private String description;

    public MenuOption() {
        super();
        this.description = " ";
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

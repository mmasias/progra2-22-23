package main;

public class MenuOption extends Option {
    private String description;

    public MenuOption(String description)
    {
        super();
        this.description = description;
    }

    public MenuOption(String description, int capacity)
    {
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

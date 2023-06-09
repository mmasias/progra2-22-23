public class MenuOption extends Option{
    String description;

    MenuOption(int optionsNumber) {

        super(optionsNumber);

    }

    public String getDescription() {

        return description;

    }

    public void setDescription(String description) {

        this.description = description;

    }

    public int getOptionsNumber() {

        return optionsNumber;

    }
}

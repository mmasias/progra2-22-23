package Main;

public class MenuOption extends Option {
    private String description;

    public MenuOption(String[] options, int selectedOption, int maxOptions, String description) {
        super(options, selectedOption, maxOptions);
        this.description = description;
        this.selectedOption = selectedOption;
    }

    public String getDescription(int selectedOption) {
        if(selectedOption == 0){
            this.description = "Login";
        } else if(selectedOption == 1){
            this.description = "Register";
        } else if(selectedOption == 2){
            this.description = "Exit";
        }
        return this.description;
    }

    public void setDescription(String description, int selectedOption) {
        if(this.selectedOption == selectedOption){
            this.description = description;
        }
    }
}

package Main;

public class Options {
    int selectedOption;
    private int numberOfOptions = 4;
    String[] options = new String[numberOfOptions];

    public int getNumberOfOptions() {
        return this.numberOfOptions;
    }

    public void Option(int selectedOption) {
        this.selectedOption = selectedOption;
    }

    public void showOptions() {
        for (int i = 0; i < this.numberOfOptions; i++) {
            System.out.println(this.options[i]);
        }
    }

    public void setSelectedOption(int selectedOption) {
        this.selectedOption = selectedOption;
    }

    public int getSelectedOption() {
        return this.selectedOption;
    }
}

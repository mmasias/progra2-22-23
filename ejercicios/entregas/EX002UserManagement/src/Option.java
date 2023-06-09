import java.util.ArrayList;

public class Option {
    private ArrayList<String> options;
    private int maxOptions;
    private int selectedOption;

    public Option(int maxOptions) {
        this.maxOptions = maxOptions;
        this.options = new ArrayList<String>();
    }

    public void addOption(String option) {
        if (this.options.size() < this.maxOptions) {
            this.options.add(option);
        } else {
            System.out.println("No se pueden agregar más opciones");
        }
    }

    public ArrayList<String> getOptions() {
        return options;
    }

    public void setOptions(ArrayList<String> options) {
        this.options = options;
    }

    public int getMaxOptions() {
        return maxOptions;
    }

    public void setMaxOptions(int maxOptions) {
        this.maxOptions = maxOptions;
    }

    public int getSelectedOption() {
        return selectedOption;
    }

    public void setSelectedOption(int selectedOption) {
        if (selectedOption < 0 || selectedOption >= this.options.size()) {
            System.out.println("Opción no válida");
        } else {
            this.selectedOption = selectedOption;
        }
    }
}

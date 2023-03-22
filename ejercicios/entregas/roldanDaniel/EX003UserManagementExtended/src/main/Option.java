package src.main;

public class Option {

    private String[] options;
    private String selectedOption;
    private int maxOptions;


    public Option() {

        this.maxOptions = 5;

        String[] options = new String[maxOptions];


    }

    public String[] getOptions() {

        return options;
    }

    public void selectOption(int index) {


        if (index < this.options.length && index > 0) {
            System.out.println("is possible search.... searching....");
            System.out.println();

            selectedOption = this.options[index - 1];

            System.out.println("The selected option is: " + selectedOption);

        } else if (index < 1) {
            System.out.println("Admite valores positivos > 0");
        } else {
            System.out.println("No hay tantas opciones en el menú, ingresa un valor < introducido");
        }


    }

    public String getSelectedOption() {
        return selectedOption;
    }

    public void addOption(String option) {

        if (this.maxOptions < this.options.length) {

            this.options[0] = option;

        } else {

            System.out.println("no capacity");

        }

    }
}

package main;

public class Option {
    private String options[];
    private int selectedOption;
    private int maxOptions;
    private int size;

    public Option() {
        this.maxOptions = 10;
        this.options = new String[this.maxOptions];
        this.selectedOption = 0;
        this.size = 0;
    }
    public void addOption(String option) {
        if (this.size < this.maxOptions){
            this.options[this.size] = option;
            this.size++;
        }else{
            System.out.println("Max options reached");
        }
    }
    public String getOption(int index) {
        return this.options[this.selectedOption];
    }
    public void selectOption(int index) {
        this.selectedOption = index;
    }
    public int getSelectedOption() {
        return this.selectedOption;
    }

    public void showOptions() {
        for (int index = 0; index < this.size; index++) {
            System.out.println("[" + (index + 1) + "] " + this.options[index]);
        }
    }

    public int getSize() {
        return this.size;
    }

    public int getHashCode() {
        String hash = "";
        for (int index = 0; index < this.size; index++) {
            hash += this.options[index];
        }
        return hash.hashCode();
    }

}

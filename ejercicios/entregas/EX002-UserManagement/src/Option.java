public class Option {
    private String[] options;
    private int optionSelection;
    private int maxOptions;

    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    public int getOptionSelection() {
        return optionSelection;
    }

    public void setOptionSelection(int optionSelection) {
        this.optionSelection = 0;
    }

    public int getMaxOptions() {
        return maxOptions;
    }

    public void setMaxOptions(int maxOptions) {
        this.maxOptions = maxOptions;
    }

    public Option(String[] options, int optionSelection, int maxOptions) {
        this.options = options;
        this.optionSelection = optionSelection;
        this.maxOptions = maxOptions;
    }
    public void options(int maxOptions) {
        this.maxOptions = maxOptions;
        this.options= new String [maxOptions];
        this.optionSelection=0;
    }
    public void add(String o){

        if (this.optionSelection < maxOptions){
            this.options[optionSelection]=o;
            optionSelection++;
        }
    }

    public void showList(String options){
        for (int i=0; i<optionSelection; i++) {
            System.out.println(this.options[i]);
        }
    }

    public String showOption(int n){
        String help="";
        if (n<maxOptions){
            help= options[n];
        }
        return help;
    }


}

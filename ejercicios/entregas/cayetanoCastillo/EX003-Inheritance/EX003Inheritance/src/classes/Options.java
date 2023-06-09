package classes;

public class Options {
    private String items[];
    private int capacity;
    private int size;
    private int defaultSelection;
    private int selectedOption;
    private int maxOptions;

    public Options() {
        this.capacity = 10;
        this.size = 0;
        this.defaultSelection = 0;
        this.items = new String[capacity];
        this.selectedOption = 0;
        this.maxOptions = 10;
    }

    public Options(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.defaultSelection = 0;
        this.items = new String[capacity];
        this.selectedOption = 0;
        this.maxOptions = capacity;
    }

    public void add(String item) {
        if (size < capacity) {
            items[size] = item;
            size++;
        }
    }
    public void addOption(String option) {
    	 if (size < capacity) {
             items[size] = option;
             size++;
         }
    }

    public String[] getItems() {
        return items;
    }

    public String getOption(int index) {

        if (index < 0 || index >= size) {
            return null;
        }

        return items[index];
    }

    public int getSize() {
        return size;
    }

    public int getDefaultSelection() {
        return defaultSelection;
    }
    public void setDefaultSelection(int defaultSelection) {
        this.defaultSelection = defaultSelection;
    }
    public void selectedOption(int index) {
    	this.selectedOption = index;
    }
    public int getSelectedOption() {
    	return selectedOption;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + ". " + items[i]);
        }
    }
}

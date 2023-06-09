

public class Options {
    String items[];
    int capacity;
    int size;
    int defaultSelection;

    int selectedOption;

    public Options() {
        this.capacity = 10;
        this.size = 0;
        this.defaultSelection = 0;
        this.items = new String[capacity];
        this.selectedOption = -1;
    }

    public Options(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.defaultSelection = 0;
        this.items = new String[capacity];
        this.selectedOption = -1;
    }

    public void add(String item) {
        if (size < capacity) {
            items[size] = item;
            size++;
        }
    }

    public String[] getItems() {

        return items;
    }

    public String getItem(int index) {

        if (index < 0 || index >= size) {
            return null;
        }

        return items[index];
    }

    void selectOption(int index) {

        this.selectedOption = index;
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

    String getSelectedOption (){
        return items[selectedOption];

    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println((i+1) + " - " + items[i]);
        }
    }
}
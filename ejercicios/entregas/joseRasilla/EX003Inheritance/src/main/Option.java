package main;

public class Option {
    public String[] items;
    public int selectedOption;
    public int size;
    public int capacity;

    public Option() {
        this.capacity = 10;
        this.size = 0;
        items = new String[capacity];
    }
    public Option(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        items = new String[capacity];
    }

    public String[] getOptions(){return items;}
    public int getSize(){
        return size;
    }

    public void addOption(String option){
        if (size < capacity){
            items[size] = option;
            size++;
        }
    }
    public String getOption(int index){
        if (index < 0 || index >= size){
            return null;
        }
        return items[index];
    }

    public void setSelectedOption(int selectedOption) {
        this.selectedOption = selectedOption;
    }

    public int getSelectedOption() {
        return selectedOption;
    }
}

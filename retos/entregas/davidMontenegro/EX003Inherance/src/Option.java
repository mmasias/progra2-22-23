package src;
public class Option{
    String options[];
    int capacity;
    int size;
    int defaultSelection;
    public Option(){
        this.capacity = 15;
        this.size = 0;
        this.options = new String[capacity];
        this.defaultSelection = 0;
    }
    public Option(int capacity){
        this.capacity = capacity;
        this.size = 0;
        this.options = new String[capacity];
        this.defaultSelection = 0;
    }
    public void add(String option){
        if(size < capacity){
            options[size] = option;
            size++;
        }
    }
    public String getOption(int index){
        if(index =< size && index > 0){
            return options[index];
        }
        return null;
    }
    public int getSize(){
        return size;
    }
    public int getDefaultSelection(){
        return defaultSelection;
    }
    public void setDefaultSelection(int defaultSelection) {
        this.defaultSelection = defaultSelection;
    }
    public void printOptions(){
        for(int i = 0; i < size; i++){
            System.out.println(i + ". " + options[i]);
        }
    }
}
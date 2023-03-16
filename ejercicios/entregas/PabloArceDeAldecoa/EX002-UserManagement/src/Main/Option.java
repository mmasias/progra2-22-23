package Main;

public class Option {
    private String[] options;
    private int actualOption;
    private String description;
    private int capacity;

    public Option(String description, int capacity){
        this.description  = description;
        this.actualOption = 0;
        this.capacity = capacity;
        this.options = new String [this.capacity];
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getDescription(){
        return this.description;
    }
    public void setActualOption(int position){
        this.actualOption = position;
    }
    public int getActualOption(){
        return this.actualOption;
    }
    public void setCapacity(int capacity){
        this.capacity = capacity;
        this.options = new String[this.capacity];
    }
    public int getCapacity(){
        return this.capacity;
    }

    public void addOption(String option){
        for (int i = 0; i < this.capacity; i++) {
            if (this.options[i] == null){
                this.options[i] = option;
                break;
            }
        }
    }
    public void showOptions(){
        for (int i = 0; i<options.length; i++) {
            if (options[i] != null) {
                System.out.println(i + 1 +". "+ options[i]);
            }
        }
        System.out.println();
    }
}

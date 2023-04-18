package progra2.com.classes;

import java.util.Arrays;

public class Option {

    private String [] options;
    private int selectedOption;
    private int maxOptions;

    private int size;


    public Option(){

        this.maxOptions=3;
        String[] options = new String[this.maxOptions];
        this.selectedOption=0;
        this.size=0;
    }

    public Option(int capacity){

        this.size=0;
        this.maxOptions=capacity;
        this.options= new String[this.maxOptions];
        this.selectedOption=0;

    }



    public String getOptions() {
        return Arrays.toString(options);
    }

    public void add(String itemOpciones){

        if(this.size<this.maxOptions){

            this.options[this.size]=itemOpciones;
            this.size++;
        }
    }

    public String getSelectedOption(int value) {

       String result = this.options[value];
        return result;
    }


    public int getOptionSelect(){

        return this.selectedOption;
    }

    public void setSelectedOption(int selectedOption) {
        this.selectedOption = selectedOption;
    }

    public int getMaxOptions() {
        return maxOptions;
    }

    public void setMaxOptions(int maxOptions) {
        this.maxOptions = maxOptions;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}

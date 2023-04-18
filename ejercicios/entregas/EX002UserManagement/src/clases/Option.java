package clases;

import java.util.Arrays;

public class Option {


    private int maxOptions;
    private int indexOption;

    private String []options;

    public Option (){


        this.maxOptions=2;
        this.indexOption=0;

        options = new String[maxOptions];

    }

    public String [] getOpciones() {
        return options;
    }

    public void setOpciones(String opciones) {

        if (indexOption<maxOptions){

            this.options[indexOption]=opciones;
            indexOption++;
        }else{

            System.out.println("Array be completed");
        }

    }

    public int getMaxOpciones() {
        return maxOptions;
    }

    public int setMaxOpciones(int value) {

        return maxOptions;
    }

    public int getIndexOption() {
        return indexOption;
    }

    public void setIndexOption(int indexOption) {

        this.indexOption=indexOption;
    }

    @Override
    public String toString() {
        return  Arrays.toString(options);
    }
}

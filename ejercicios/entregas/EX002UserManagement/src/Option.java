import java.lang.*;
public class Option {


    private String [] options;
    private int size;
    private int maxCapacityOptions;



        public Option(){

            this.size=0;
            this.maxCapacityOptions=3;
            this.options= new String[this.maxCapacityOptions];

        }

        public void add(String option){

            if(this.size<this.maxCapacityOptions){

                this.options[this.size]=option;
                this.size++;
            }

        }


        public void listar(){

            for(int i=0; i<this.options.length;i++){

                System.out.println(this.options[i]);
            }
        }

        public void selectOption(int index){

            int opcionesTotales=this.options.length;
            String resultOption;

            //System.out.println(opcionesTotales);

            if(index<opcionesTotales && index>0){
                System.out.println("is possible search.... searching....");
                System.out.println();

                resultOption=this.options[index-1];

                System.out.println("The selected option is: "+resultOption);

            } else if (index<1) {
                System.out.println("Admite valores positivos > 0");
            }else{
                System.out.println("No hay tantas opciones en el menú, ingresa un valor < introducido");
            }

        }

    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }
}


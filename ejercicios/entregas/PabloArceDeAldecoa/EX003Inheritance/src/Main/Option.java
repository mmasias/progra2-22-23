package Main;
import java.util.*;

public class Option {
     private String[] options;
     private int selectedOption;
     private int maxOptions;
     public Option (int selectedOption, int maxOptions){
          this.selectedOption = selectedOption;
          this.maxOptions = maxOptions;
          this.options = new String [maxOptions];
     }
     public void addOption(String option){
          if (options.length <= maxOptions){
               for (int i = 0; i < option.length(); i++){
                    if (options[i] == null){
                         options[i] = option;
                         break;
                    }
               }
          }
          else{System.out.println("No space left!");}
     }
     public String getOption (int index){
          return (options[index]);
     }
     public void selectOption (int index){
          selectedOption = index;
     }
     public String getSelectedOption(){
          return options[selectedOption];
     }
     public void showOptions(){
          for (int i = 0; i < this.options.length; i++){
               if(options[i] != null){
                    System.out.println(i+1+". "+options[i]);
               }
          }
     }
}

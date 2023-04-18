package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import progra2.com.classes.*;

import static org.junit.jupiter.api.Assertions.*;

class OptionTest {


     @Test
    void validateAddOption(){

         Manager m1 = new Manager();
         AdminUser admin = new AdminUser("Daniel","12","Dani",true);
         RegularUser normal = new RegularUser();
         Option listaOpcionesAdmin = new Option(2);
         Option listaRegular = new Option(1);

         listaOpcionesAdmin.add(" listar usuario");
         listaOpcionesAdmin.add(" inicios de sesión");

         listaRegular.add("editar perfil");


        Assertions.assertEquals(listaOpcionesAdmin.getSize(),2);

     }

     @Test
    void validateGetOptions(){

         Option listAdmin = new Option(2);

         listAdmin.add("Hola");

         Assertions.assertEquals(listAdmin.getOptions(),"[Hola, null]");

     }

     @Test
    void validateGetAndSetSize (){

         Option op1 = new Option(1);

         Assertions.assertEquals(op1.getSize(),0);

         op1.add("añado 1");

         Assertions.assertEquals(op1.getSize(),1);
     }

     @Test
    void validateGetSelectedOption(){

         Option optionSelected = new Option(2);

         int selected = 0;

         optionSelected.add("primera");
         optionSelected.add("segunda");

         Assertions.assertEquals(optionSelected.getSelectedOption(0),"primera");

     }

     @Test
    void validateUploadSelectedOption(){

         Option uploadOptionSeleted = new Option(3);
         Assertions.assertEquals(uploadOptionSeleted.getOptionSelect(), 0);
         uploadOptionSeleted.setSelectedOption(2);
         Assertions.assertEquals(uploadOptionSeleted.getOptionSelect(), 2);

     }

     @Test
    void validateCapacity (){

         Option validateMaxCapacity = new Option(2);

         Assertions.assertEquals(validateMaxCapacity.getMaxOptions(),2);

     }


}
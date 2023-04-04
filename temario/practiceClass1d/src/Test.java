import java.util.*;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        Collection<String> listaMarcasCoches = new ArrayList<String>();
        listaMarcasCoches.add("Audi");
        listaMarcasCoches.add("Porsche");
        listaMarcasCoches.add("Aston Martin");
        listaMarcasCoches.add("Ferrari");
        listaMarcasCoches.add("Mercedes");
        listaMarcasCoches.add("Seat");

        System.out.println("Numero elementos antes de eliminar: "+ listaMarcasCoches.size());
        System.out.println(listaMarcasCoches.toString());

        listaMarcasCoches.remove("Seat");
        listaMarcasCoches.remove("Mercedes");

        System.out.println("Numero elementos despues de eliminar: "+ listaMarcasCoches.size());
        System.out.println(listaMarcasCoches.toString());

        Iterator<String> it = listaMarcasCoches.iterator();
        for (int i=0; it.hasNext(); i++){
            String marca = it.next();
            if(marca.equals("Audi")){
                it.remove();
            }
        }
        System.out.println(listaMarcasCoches.toString());
    }
}
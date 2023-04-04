package org.example;
import java.util.*;
public class test {
    public static void main(String[] args) {
        Collection<String> listaMarcasCoches = new ArrayList<String>();
        listaMarcasCoches.add("Seat");
        listaMarcasCoches.add("Renault");
        listaMarcasCoches.add("Fiat");
        listaMarcasCoches.add("Ford");
        listaMarcasCoches.add("Peugeot");
        listaMarcasCoches.add("Citroen");
        listaMarcasCoches.add("Audi");
        listaMarcasCoches.add("BMW");

        System.out.println("Número de elementos antes de eliminar: " + listaMarcasCoches.size());
        System.out.println(listaMarcasCoches.toString());
        listaMarcasCoches.remove("Citroen");
        listaMarcasCoches.remove("Audi");

        System.out.println("Número de elementos después de eliminar: " + listaMarcasCoches.size());
        System.out.println(listaMarcasCoches.toString());

        Iterator<String> it = listaMarcasCoches.iterator();
        for (int i = 0; it.hasNext(); i++) {
            String marca = it.next();
            if (marca.equals("Citroen")) {
                it.remove();
            }
        }
        System.out.println(listaMarcasCoches.toString());
    }
}
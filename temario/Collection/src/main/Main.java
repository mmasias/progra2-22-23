package main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Collection<String> carBrand = new ArrayList<String>();
        carBrand.add("Audi");
        carBrand.add("Porsche");
        carBrand.add("Aston Martin");
        carBrand.add("Ferrari");
        carBrand.add("Mercedes");
        carBrand.add("Seat");

        System.out.println("Number of elements before deleting: " + carBrand.size());
        System.out.println(carBrand.toString());

        carBrand.remove("Seat");
        carBrand.remove("Mercedes");

        System.out.println("Number of elements after deleting: " + carBrand.size());
        System.out.println(carBrand.toString());

        Iterator<String> it = carBrand.iterator();
        for (int i=0; it.hasNext(); i++){
            String marca = it.next();
            if (marca.equals("Audi")){
                it.remove();
            }
        }
        System.out.println(carBrand.toString());




    }
}
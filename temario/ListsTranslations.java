package c04_04;

import java.util.*;
public class prueba {
    public static void main(String[] args) {
        Collection<String> carBrandList = new ArrayList<String>();
        carBrandList.add("Audi");
        carBrandList.add("Porsche");
        carBrandList.add("Aston Martin");
        carBrandList.add("Ferrari");
        carBrandList.add("Mercedes");
        carBrandList.add("Seat");
        System.out.println("Number of elements before deleting: " +
                carBrandList.size() );
        System.out.println (carBrandList.toString() ) ;
        carBrandList.remove ("Seat");
        carBrandList.remove ("Mercedes");
        System.out.println("Number of elements after deleting Mercedes and Seat"
                + carBrandList.size() ) ;
        System.out.println(carBrandList.toString () );
        Iterator<String> it = carBrandList.iterator();
        for(int i=0; it.hasNext();i++){
            String marca = it.next();
            if(marca.equals("Audi"))
                it.remove();
        }
        System.out.println(carBrandList.toString () );
    }
}
import java.util.*;

public class Test {
    public static void main(String[] args) {
        // Create a collection of car brands
        Collection<String> listaMarcasCoches = new ArrayList<String>();
        listaMarcasCoches.add("Audi");
        listaMarcasCoches.add("Porsche");
        listaMarcasCoches.add("Aston Martin");
        listaMarcasCoches.add("Ferrari");
        listaMarcasCoches.add("Mercedes");
        listaMarcasCoches.add("Seat");

        // Print the number of elements before removing any
        System.out.println("Número elementos antes de eliminar: " + listaMarcasCoches.size());
        System.out.println(listaMarcasCoches.toString());

        // Remove "Seat" and "Mercedes" from the list
        listaMarcasCoches.remove("Seat");
        listaMarcasCoches.remove("Mercedes");

        // Print the number of elements after removing "Seat" and "Mercedes"
        System.out.println("Número elementos después de eliminar Seat y Mercedes: " + listaMarcasCoches.size());
        System.out.println(listaMarcasCoches.toString());

        // Create an iterator for the collection
        Iterator<String> it = listaMarcasCoches.iterator();

        // Iterate through the collection and remove "Audi" if found
        while (it.hasNext()) {
            String marca = it.next();
            if (marca.equals("Audi")) {
                it.remove();
            }
        }

        // Print the final list
        System.out.println(listaMarcasCoches.toString());
    }
}

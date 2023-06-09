import java.util.*;
public class test {
    
    public static void main(String[] args) {
        Collection<String> listaMarcasCoches = new ArrayList<String>();
        listaMarcasCoches.add("Audi");
        listaMarcasCoches.add("Porsche");
        listaMarcasCoches.add("Aston Martin");
        listaMarcasCoches.add("Ferrari");
        listaMarcasCoches.add("Mercedes");
        listaMarcasCoches.add("Seat");
    
        System.out.println("Number of elements before deleting: " +
        listaMarcasCoches.size() );

        System.out.println (listaMarcasCoches.toString() ) ;

        listaMarcasCoches.remove ("Seat");
        listaMarcasCoches.remove ("Mercedes");

        System.out.println("Number of elements before deleting Seat and Mercedes:"
        + listaMarcasCoches.size() ) ;
        System.out.println(listaMarcasCoches.toString () );
        Iterator<String> it = listaMarcasCoches.iterator();

        for(int i=0; it.hasNext();i++){
        String marca = it.next();
        if(marca.equals("Audi"))
        it.remove();
        }
        
        System.out.println(listaMarcasCoches.toString () );
}
}
